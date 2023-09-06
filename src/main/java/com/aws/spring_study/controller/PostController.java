package com.aws.spring_study.controller;

import com.aws.spring_study.controller.dto.JsonTestDto;
import com.aws.spring_study.controller.dto.xWWWTestDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

	@PostMapping("/post/xwww")
	public Object xWwwFormUrlEncoded(xWWWTestDto xWWWTestDto) {
		System.out.println(xWWWTestDto);
		return null;
	}

	@PostMapping("/post/json")
//	JSON형태에선 @RequestBody가 필수.
	public Object json(@RequestBody JsonTestDto jsonTestDto) {
		System.out.println(jsonTestDto);
		return null;
	}
}
