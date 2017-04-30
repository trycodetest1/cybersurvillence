package com.hackathon.cyber.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.hackathon.cyber.app.common.Constants;
import com.hackathon.cyber.app.sentiment.dto.SentimentsDTO;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;

/**
 * @ApplicationController Controller class used to call the logging restful
 *                        microservice
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = Constants.CYBER)
public class SentimentAnalysisController {
	private static final Logger logger = LoggerFactory.getLogger(SentimentAnalysisController.class);

	@RequestMapping(value = Constants.SENTIMENT_TEXT)
	public @ResponseBody SentimentsDTO sentimentAnalysis(@RequestParam(value = "message") String message)
			throws JsonProcessingException, IOException {
		StringBuffer url = new StringBuffer("https://api.havenondemand.com/1/api/sync/analyzesentiment/v2");
		String apiKey = "apikey=4f4d0e1a-1ae0-4226-b01b-9164a98f39fc";
		url.append("?" + apiKey + "&text=" + message);
		System.out.println(url);
		// String fooResourceUrl =
		// "https://api.havenondemand.com/1/api/sync/analyzesentiment/v2?text=good&language=eng";
		RestTemplate restTemplate = new RestTemplate();
		SentimentsDTO sentimentsDTO = (SentimentsDTO) restTemplate.getForObject(url.toString(), SentimentsDTO.class);
		System.out.println(sentimentsDTO);

		return sentimentsDTO;
	}

	@RequestMapping(value = Constants.TWITTER_SENTIMENT_TEXT)
	public @ResponseBody List<SentimentsDTO> twitterSentimentAnalysis() throws JsonProcessingException, IOException {

		Twitter twitter = new TwitterFactory().getInstance();
		// Twitter Consumer key & Consumer Secret
		twitter.setOAuthConsumer("Szq80ZOnYLRupItpn7IXKiLhw", "4OepR2I1hSkeewlYAkbZrebm4eyP7kyJMjGKuAP3tHhhRxJoIe");
		// Twitter Access token & Access token Secret
		twitter.setOAuthAccessToken(new AccessToken("858537108578893824-2S1zQGFAKHiFSEARHus6CBrGUFWmobN",
				"siyd9YSNpZlbe7X4HjPcBGCELfsBQuLSpVq0PAdHb5fud"));
		List<SentimentsDTO> sentimentsList = new ArrayList<SentimentsDTO>();
		try {
			User user = twitter.verifyCredentials();
			List<Status> statuses = twitter.getUserTimeline();
			for (Status status : statuses) {
				StringBuffer url = new StringBuffer("https://api.havenondemand.com/1/api/sync/analyzesentiment/v2");
				String apiKey = "apikey=4f4d0e1a-1ae0-4226-b01b-9164a98f39fc";
				url.append("?" + apiKey + "&text=" + status.getText());
				if (!"".equals(status.getText()) && status.getText() != null) {
					RestTemplate restTemplate = new RestTemplate();
					SentimentsDTO sentimentsDTO = (SentimentsDTO) restTemplate.getForObject(url.toString(),
							SentimentsDTO.class);
					System.out.println(sentimentsDTO);
					sentimentsList.add(sentimentsDTO);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Failed to get timeline: " + e.getMessage());
		}

		return sentimentsList;
	}

}
