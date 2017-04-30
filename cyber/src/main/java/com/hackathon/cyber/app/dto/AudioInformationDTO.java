package com.hackathon.cyber.app.dto;

public class AudioInformationDTO {

	private Long sample_rate;
	private Long channels;
	private String codec;

	public Long getSample_rate() {
		return sample_rate;
	}

	public void setSample_rate(Long sample_rate) {
		this.sample_rate = sample_rate;
	}

	public Long getChannels() {
		return channels;
	}

	public void setChannels(Long channels) {
		this.channels = channels;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

	@Override
	public String toString() {
		return "AudioInformationDTO [sample_rate=" + sample_rate + ", channels=" + channels + ", codec=" + codec + "]";
	}

}
