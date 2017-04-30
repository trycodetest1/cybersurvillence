package com.hackathon.cyber.app.sentiment.dto;

import java.util.Arrays;

public class ResponseDTO {
	private SentimentResponseDTO[] negative;
	private SentimentResponseDTO[] positive;
	private AggregateDTO aggregate;

	public SentimentResponseDTO[] getNegative() {
		return negative;
	}

	public void setNegative(SentimentResponseDTO[] negative) {
		this.negative = negative;
	}

	public SentimentResponseDTO[] getPositive() {
		return positive;
	}

	public void setPositive(SentimentResponseDTO[] positive) {
		this.positive = positive;
	}

	public AggregateDTO getAggregate() {
		return aggregate;
	}

	public void setAggregate(AggregateDTO aggregate) {
		this.aggregate = aggregate;
	}

	@Override
	public String toString() {
		return "ResponseDTO [negative=" + Arrays.toString(negative) + ", positive=" + Arrays.toString(positive)
				+ ", aggregate=" + aggregate + "]";
	}

}
