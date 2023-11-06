package com.uap.it1311l.passwordencryptorapi.models;

public class EncryptionResponse {
	private String status;
	private String result;
	
	//Status
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	//Result
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
}
