/**
 * 
 */
package com.hackathon.cyber.app.sentiment.dto;

import java.util.Arrays;

/**
 * @author akshjadh
 *
 */
public class SentimentsDTO {
	private ResponseDTO[] sentiment_analysis;

	public ResponseDTO[] getSentiment_analysis() {
		return sentiment_analysis;
	}

	public void setSentiment_analysis(ResponseDTO[] sentiment_analysis) {
		this.sentiment_analysis = sentiment_analysis;
	}

	@Override
	public String toString() {
		return "SentimentsDTO [sentiment_analysis=" + Arrays.toString(sentiment_analysis) + "]";
	}

}
