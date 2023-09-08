package com.aws.spring_study.controller;

import com.aws.spring_study.controller.dto.ModifyUserReqDto;
import com.aws.spring_study.controller.dto.RegisterUserReqDto;
import com.aws.spring_study.entity.User;
import com.aws.spring_study.repository.UserMappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //Post요청 처리
public class UsersController {


	@Autowired //autoWired를 통해 AutoIncrement 구현함.
	private UserMappers userMappers;

	@CrossOrigin
	@PostMapping("/user")

//	DataTransferObject(Dto) :데이터 변환 객체
	public ResponseEntity<Integer> registerUser(@RequestBody RegisterUserReqDto registerUserReqDto) {

		Integer count = userMappers.saveUser(registerUserReqDto);
		return ResponseEntity.ok().body(count);
	}

	@CrossOrigin
	@GetMapping("/user/list")
	public ResponseEntity<List<User>> userListAll() {
		return ResponseEntity.ok().body(userMappers.getUserListAll());
	}

	@CrossOrigin
	@PutMapping("/users/{userId}")
	public ResponseEntity<Integer> modifyUser(
	@PathVariable int userId,
	@RequestBody ModifyUserReqDto modifyUserReqDto) {

		userMappers.updateUser(modifyUserReqDto);
		return ResponseEntity.ok().body(null);
	}

	@CrossOrigin
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<Integer> deleteUser(@PathVariable int userId) {

		userMappers.deleteUser(userId);
		return ResponseEntity.ok().body(null);
	}
}
