package com.hackathon.cyber.app.dto;

public class VideoInformationDTO {

	private Long width;
	private Long height;
	private String codec;
	private String pixel_aspect_ratio;

	public Long getWidth() {
		return width;
	}

	public void setWidth(Long width) {
		this.width = width;
	}

	public Long getHeight() {
		return height;
	}

	public void setHeight(Long height) {
		this.height = height;
	}

	public String getCodec() {
		return codec;
	}

	public void setCodec(String codec) {
		this.codec = codec;
	}

	public String getPixel_aspect_ratio() {
		return pixel_aspect_ratio;
	}

	public void setPixel_aspect_ratio(String pixel_aspect_ratio) {
		this.pixel_aspect_ratio = pixel_aspect_ratio;
	}

	@Override
	public String toString() {
		return "VideoInformationDTO [width=" + width + ", height=" + height + ", codec=" + codec
				+ ", pixel_aspect_ratio=" + pixel_aspect_ratio + "]";
	}

}
