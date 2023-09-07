package com.aws.spring_study.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ReqStudyController {

	@PostMapping("/test/post")
	@GetMapping("/test/get")
	public Object get() {
		Map<String, String> dataMap = new HashMap<>();
		dataMap.put("name", "주성광");
		dataMap.put("email", "aaa@gmail.com");
		return dataMap;
	}

	public Object post() {
		return null;
	}
	@PutMapping("/test/put")
	public Object put() {
		return "PUT";
	}
	@DeleteMapping("/test/delete")
	public Object delete() {
		return "DELETE";
	}
}