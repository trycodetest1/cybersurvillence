package com.hackathon.cyber.app.dto;

public class SpeechDetechResponseDTO {

	private SpeechResultDTO result;
	private String status;
	private String action;
	private String version;

	public SpeechResultDTO getResult() {
		return result;
	}

	public void setResult(SpeechResultDTO result) {
		this.result = result;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@Override
	public String toString() {
		return "SpeechDetechResponseDTO [status=" + status + ", action=" + action + ", version=" + version + "]";
	}

}
