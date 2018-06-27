package com.fescotech.business.drools.entity.dto;
public class ApiResponse {
	private boolean success;
	private String rspCode;
	private String message;
	private Object data;
	private String msgDetail;
	public ApiResponse(boolean success) {
		this.success = success;
	}

	public ApiResponse(String message) {
		this.message = message;
		this.success = false;
	}

	public ApiResponse(Object data) {
		this.data = data;
		this.success = true;
	}

	public ApiResponse(boolean success, Object data) {
		this.success = success;
		this.data = data;
	}

	public ApiResponse() {
	}

	public boolean isSuccess() {
		return this.success;
	}

	public ApiResponse setSuccess(boolean success) {
		this.success = success;
		return this;
	}

	public String getRspCode() {
		return this.rspCode;
	}

	public ApiResponse setRspCode(String rspCode) {
		this.rspCode = rspCode;
		return this;
	}

	public String getMessage() {
		return this.message;
	}

	public ApiResponse setMessage(String message) {
		this.message = message;
		return this;
	}

	public Object getData() {
		return this.data;
	}

	public ApiResponse setData(Object data) {
		this.data = data;
		return this;
	}

	public String getMsgDetail() {
		return msgDetail;
	}

	public ApiResponse setMsgDetail(String msgDetail) {
		this.msgDetail = msgDetail;
		return this;
	}
	
}