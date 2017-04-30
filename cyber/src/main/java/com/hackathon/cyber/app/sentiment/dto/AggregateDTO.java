package com.hackathon.cyber.app.sentiment.dto;

import com.google.gson.Gson;
import com.hackathon.cyber.app.sentiment.dto.FraudCallDTO.Category;
import com.hackathon.cyber.app.sentiment.dto.FraudCallDTO.FraudType;

public class AggregateDTO {

	private String sentiment;

	private Double score;

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "AggregateDTO [sentiment=" + sentiment + ", score=" + score + "]";
	}
}
