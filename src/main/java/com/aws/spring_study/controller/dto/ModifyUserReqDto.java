package com.aws.spring_study.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ModifyUserReqDto {
	private int userId;
	private String username;
	private String name;
	private  String phone;
}
