package com.hackathon.cyber.app.sentiment.dto;

public class SentimentResponseDTO {
	private String sentiment;
	private String topic;
	private Double score;
	private String original_text;
	private Long original_length;
	private String normalized_text;
	private Long normalized_length;
	private Long offset;

	public String getSentiment() {
		return sentiment;
	}

	public void setSentiment(String sentiment) {
		this.sentiment = sentiment;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getOriginal_text() {
		return original_text;
	}

	public void setOriginal_text(String original_text) {
		this.original_text = original_text;
	}

	public Long getOriginal_length() {
		return original_length;
	}

	public void setOriginal_length(Long original_length) {
		this.original_length = original_length;
	}

	public String getNormalized_text() {
		return normalized_text;
	}

	public void setNormalized_text(String normalized_text) {
		this.normalized_text = normalized_text;
	}

	public Long getNormalized_length() {
		return normalized_length;
	}

	public void setNormalized_length(Long normalized_length) {
		this.normalized_length = normalized_length;
	}

	public Long getOffset() {
		return offset;
	}

	public void setOffset(Long offset) {
		this.offset = offset;
	}

	@Override
	public String toString() {
		return "PositiveDTO [sentiment=" + sentiment + ", topic=" + topic + ", score=" + score + ", original_text="
				+ original_text + ", original_length=" + original_length + ", normalized_text=" + normalized_text
				+ ", normalized_length=" + normalized_length + ", offset=" + offset + "]";
	}

}
