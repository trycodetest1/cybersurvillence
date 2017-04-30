package com.hackathon.cyber.app.dto;

public class SoundDTO {

	private Long start_time_offset;
	private Long end_time_offset;
	private String text;
	private Long confidence;

	public Long getStart_time_offset() {
		return start_time_offset;
	}

	public void setStart_time_offset(Long start_time_offset) {
		this.start_time_offset = start_time_offset;
	}

	public Long getEnd_time_offset() {
		return end_time_offset;
	}

	public void setEnd_time_offset(Long end_time_offset) {
		this.end_time_offset = end_time_offset;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getConfidence() {
		return confidence;
	}

	public void setConfidence(Long confidence) {
		this.confidence = confidence;
	}

	@Override
	public String toString() {
		return "SoundDTO [start_time_offset=" + start_time_offset + ", end_time_offset=" + end_time_offset + ", text="
				+ text + ", confidence=" + confidence + "]";
	}

}
