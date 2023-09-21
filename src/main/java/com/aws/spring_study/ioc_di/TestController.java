package com.aws.spring_study.ioc_di;

public class TestController {
	private TestService1 t;

	public TestController(TestService1 t) {
		//수정전 : 결합도 높음
//		t = new TestService1();
		this.t =t;
	}

	public void control() {
		t.aaa();
	}
}
