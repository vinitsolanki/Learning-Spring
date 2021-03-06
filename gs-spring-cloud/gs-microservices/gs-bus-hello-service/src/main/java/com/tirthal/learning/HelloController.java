package com.tirthal.learning;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {

	@Value("${hello.message}")
	private String message;

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public ResponseEntity<String> sayHello() {
		return new ResponseEntity<>(this.message, HttpStatus.OK);
	}
}