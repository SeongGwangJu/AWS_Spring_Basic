package com.aws.spring_study.controller.dto;

import lombok.Data;

@Data
public class RegisterUserReqDto {
	private String username;
	private String name;
	private String phone;
}
