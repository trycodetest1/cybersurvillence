package com.hackathon.cyber.app.common;

/**
 * Data transfer object for Account
 *
 */
public class ResponseDTO {

	private String message;

	private Integer statusCode;

	private Boolean error;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	@Override
	public String toString() {
		return "ResponseDTO [message=" + message + ", statusCode=" + statusCode + ", error=" + error + "]";
	}
}
