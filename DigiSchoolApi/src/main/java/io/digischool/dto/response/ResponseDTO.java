package io.digischool.dto.response;

import io.digischool.util.MessageConstants;

public class ResponseDTO {
	
	private String status=MessageConstants.success;
	private String message;
	private Object data;
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
