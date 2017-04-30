package com.hackathon.cyber.app.controller;

import java.io.IOException;

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
import com.hackathon.cyber.app.dto.SpeechResponse;

/**
 * @ApplicationController Controller class used to call the logging restful microservice
 *
 */
@RestController
@EnableAutoConfiguration
@RequestMapping(value = Constants.CYBER)
public class SpeechToTextController {
	private static final Logger logger = LoggerFactory.getLogger(SpeechToTextController.class);

	@RequestMapping(value = Constants.SPEECH_TO_TEXT)
	public @ResponseBody SpeechResponse speechToText(@RequestParam(value = "url") String uri)
			throws JsonProcessingException, IOException {
		/*
		 * StringBuffer url = new StringBuffer("https://api.havenondemand.com/1/api/async/recognizespeech/v2"); String
		 * apiKey = "apikey=d42d7f30-ee7e-470a-8ab6-34a9d7de120c";
		 */

		StringBuffer url = new StringBuffer(
				"https://api.havenondemand.com/1/api/async/recognizespeech/v2?apikey=4f4d0e1a-1ae0-4226-b01b-9164a98f39fc"
						+ "&url=" + uri + "&language_model=en-us");
		RestTemplate restTemplate = new RestTemplate();
		SpeechResponse speechResponse = (SpeechResponse) restTemplate.getForObject(url.toString(),
				SpeechResponse.class);

		StringBuffer url2 = new StringBuffer("https://api.havenondemand.com/1/job/result/");
		url2.append(speechResponse.getJobID() + "?apikey=4f4d0e1a-1ae0-4226-b01b-9164a98f39fc");
		speechResponse = (SpeechResponse) restTemplate.getForObject(url2.toString(), SpeechResponse.class);
		System.out.println(speechResponse);
		return speechResponse;
	}

}
