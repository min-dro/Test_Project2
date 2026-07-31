package com.kh.myapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestProject2Application {

	public static void main(String[] args) {
		SpringApplication.run(TestProject2Application.class, args);
		
		// 서버 구동 후 콘솔에 무언가를 출력해서 실행이 잘 되었는지 검사용 코드
		System.out.println("잘 구동 됐나?");
	}

}