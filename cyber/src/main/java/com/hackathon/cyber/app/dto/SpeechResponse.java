package com.hackathon.cyber.app.dto;

import java.util.Arrays;

public class SpeechResponse {
	private SpeechDetechResponseDTO[] actions;
	private String jobID;
	private String status;

	public String getJobID() {
		return jobID;
	}

	public void setJobID(String jobID) {
		this.jobID = jobID;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SpeechDetechResponseDTO[] getActions() {
		return actions;
	}

	public void setActions(SpeechDetechResponseDTO[] actions) {
		this.actions = actions;
	}

	@Override
	public String toString() {
		return "SpeechResponse [actions=" + Arrays.toString(actions) + ", jobID=" + jobID + ", status=" + status + "]";
	}

}
