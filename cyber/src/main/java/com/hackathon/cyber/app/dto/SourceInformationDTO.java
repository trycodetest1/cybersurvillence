package com.hackathon.cyber.app.dto;

public class SourceInformationDTO {
	private String mime_type;
	private AudioInformationDTO audio_information;
	private VideoInformationDTO video_information;

	public String getMime_type() {
		return mime_type;
	}

	public void setMime_type(String mime_type) {
		this.mime_type = mime_type;
	}

	public AudioInformationDTO getAudio_information() {
		return audio_information;
	}

	public void setAudio_information(AudioInformationDTO audio_information) {
		this.audio_information = audio_information;
	}

	public VideoInformationDTO getVideo_information() {
		return video_information;
	}

	public void setVideo_information(VideoInformationDTO video_information) {
		this.video_information = video_information;
	}

	@Override
	public String toString() {
		return "SourceInformationDTO [mime_type=" + mime_type + ", audio_information=" + audio_information
				+ ", video_information=" + video_information + "]";
	}

}
