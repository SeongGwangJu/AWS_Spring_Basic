package com.aws.spring_study;

import com.aws.spring_study.ioc_di.TestController;
import com.aws.spring_study.ioc_di.TestService1;
import com.aws.spring_study.ioc_di.TestService2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringStudyApplication {
//Git Test!
	public static void main(String[] args) {
		SpringApplication.run(SpringStudyApplication.class, args);
//		main2();
	}

	public static void main2() {
		//이전
//		TestController testController = new TestController();
		//수정(결합도 낮춤 : 매개변수화)
		TestService1 testService1 = new TestService1();
		TestService2 testService2 = new TestService2();
		TestController testController = new TestController(testService1);
		testController.control();
	}
}