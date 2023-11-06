package com.uap.it1311l.passwordencryptorapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passwordencryptorapi.webclient.EncryptionApiClient;

@Service
public class EncryptDecryptService {
	
	@Autowired
	EncryptionApiClient apiClient;
	
	public EncryptionResponse encrypt(String password) {
		return apiClient.encrypt("whateverkeyyouwant", password, "AES");
	}
	
}
