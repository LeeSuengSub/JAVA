package com.example.first_spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.VO.UserVO;

//@Controller : url을 요청받는 곳이야~
@RestController
public class MainController {
	
	@GetMapping("/index")
	public String call() {//index라는 주소를 요청하면 call() 메소드를 실행할께~
		String word = "이승섭 Hello World!";
		return word;
	}
	@GetMapping("/sum")
	public int callSum() {
		int x = 10;
		int y = 100;
		return x+y;
	}
	@GetMapping("/user")
	public UserVO callUser() {
		UserVO vo = new UserVO();
		vo.setName("홍길동");
		vo.setAge(20);
		return vo;
	}
	@GetMapping("/userList")
	public List<UserVO> callList(){
		List<UserVO> list = new ArrayList<UserVO>();
		UserVO vo1 = new UserVO();
		vo1.setAge(10);
		vo1.setName("홍길동");
		
		UserVO vo2 = new UserVO();
		vo2.setAge(20);
		vo2.setName("박길동");
		
		UserVO vo3 = new UserVO();
		vo3.setAge(30);
		vo3.setName("이길동");
		
		UserVO vo4 = new UserVO();
		vo4.setAge(40);
		vo4.setName("김길동");
		
		UserVO vo5 = new UserVO();
		vo5.setAge(50);
		vo5.setName("최길동");
		
		list.add(vo1);
		list.add(vo2);
		list.add(vo3);
		list.add(vo4);
		list.add(vo5);
		return list;
	}
	@GetMapping("/list")
	public List<UserVO> callUserList(){
		List<UserVO> list = new ArrayList<UserVO>();
		for(int i=0; i<5;i++) {
			list.add(new UserVO("홍길동",30,"대전"));
		}
		return list;
	}
	//회사마다 call, load를 이름에 붙임.
}
