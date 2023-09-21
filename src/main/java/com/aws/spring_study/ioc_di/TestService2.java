package com.aws.spring_study.ioc_di;

public class TestService2 implements TestService{

	@Override
	public void aaa() {
		System.out.println("TestService2에서 호출");
	}
}
