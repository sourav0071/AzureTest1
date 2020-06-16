package com.azr.boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureRestController {

	@GetMapping("/test")
	public String getResult() {
		return "I am a service to validate Azure Pipe Line ";
	}
}
