package com.hackathon.cyber.app.dto;

import java.util.Arrays;

public class SpeechResultDTO {
	private SourceInformationDTO result;
	private SoundDTO[] items;

	public SourceInformationDTO getResult() {
		return result;
	}

	public void setResult(SourceInformationDTO result) {
		this.result = result;
	}

	public SoundDTO[] getItems() {
		return items;
	}

	public void setItems(SoundDTO[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "SpeechResultDTO [result=" + result + ", items=" + Arrays.toString(items) + "]";
	}

}
