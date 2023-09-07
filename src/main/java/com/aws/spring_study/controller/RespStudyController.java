package com.aws.spring_study.controller;

import com.aws.spring_study.controller.dto.JsonTestDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RespStudyController {

	@GetMapping("/resp/str")
	public String strTest() {
		return "문자열";
	}

	@GetMapping("/resp/obj")
	public Map<String, Object> ObjectStudy() {
		Map<String, Object> responseMap = new HashMap<>();
		return responseMap;
	}

	@GetMapping("/resp/obj2")
	public Object objectTest2() {
		JsonTestDto jsonTestDto = new JsonTestDto();
		jsonTestDto.setName("주성광");
		jsonTestDto.setAge(30);
		return jsonTestDto;
	}

	@GetMapping("/resp/status")
	public Object statusTest(HttpServletResponse response) {
		response.setStatus(400);
		return null;
	}

	@GetMapping("/resp/resp-entity")
	public ResponseEntity<?> responseEntityTest() {
		JsonTestDto jsonTestDto = new JsonTestDto();
		jsonTestDto.setName("김준삼");
		jsonTestDto.setAge(30);
		return new ResponseEntity<JsonTestDto>(jsonTestDto, HttpStatus.UNAUTHORIZED);
	}

	@GetMapping("/resp/resp-entity2")
	public ResponseEntity<Map<String,Object>> mapResponseEntity() {
		Map<String, Object> map = new HashMap<>();
		map.put("data", "데이터입니다");
		return new ResponseEntity<>(map, HttpStatus.OK);
	}

	@GetMapping("/resp/resp-entity3")
	public ResponseEntity<JsonTestDto> jsonResponse() {
		JsonTestDto jsonTestDto = new JsonTestDto();
		jsonTestDto.setName("주성광");
		jsonTestDto.setAge(30);
		//Return Like 빌더패턴
		return ResponseEntity.ok().body(jsonTestDto); //Like 빌더패턴
//		return ResponseEntity.badRequest().body(jsonTestDto); //Like 빌더패턴
//		return ResponseEntity.status(405).body(jsonTestDto); //Like 빌더패턴
//		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonTestDto);

	}
}
