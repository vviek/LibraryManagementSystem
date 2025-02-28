package com.reactjs.backend.model;

public class ResponseData {

	Boolean isSuccess;
	String successMessage;
	String errorMessage;

	public ResponseData(Boolean isSuccess, String successMessage, String errorMessage) {
		this.isSuccess = isSuccess;
		this.successMessage = successMessage;
		this.errorMessage = errorMessage;
	}

	public Boolean getIsSuccess() {
		return isSuccess;
	}

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getSuccessMessage() {
		return successMessage;
	}

	public void setSuccessMessage(String successMessage) {
		this.successMessage = successMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
