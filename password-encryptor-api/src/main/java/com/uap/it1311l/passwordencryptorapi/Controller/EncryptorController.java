package com.uap.it1311l.passwordencryptorapi.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.uap.it1311l.passwordencryptorapi.models.EncryptionResponse;
import com.uap.it1311l.passwordencryptorapi.models.UapEncryptionRequest;
import com.uap.it1311l.passwordencryptorapi.service.EncryptDecryptService;

@RestController
public class EncryptorController {
	
	@Autowired
	EncryptDecryptService encryptDecryptService;

	@GetMapping("/api/encryption")
	public EncryptionResponse encryptString(@RequestBody UapEncryptionRequest request) {
		return encryptDecryptService.encrypt(request.getPassword());
	}
}
