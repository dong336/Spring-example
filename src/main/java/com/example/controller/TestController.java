package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.User;
import com.example.repository.UserRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Tag(name = "Template", description = "템플릿 API Document")
public class TestController {

	private final UserRepository userRepo;
	
	@PostMapping("/ping")
	@Operation(summary = "템플릿 rest api", description = "템플릿 rest api를 출력합니다.")
	public User ping() {
		User user = userRepo.findByNo(1);
		
		return user;
	}
	
	@PostMapping("/native-query")
	@Operation(summary = "네이티브 쿼리", description = 
			  "    		select \r\n"
			+ "    			count(*) as cnt\r\n"
			+ "    			, userkind as userkind\r\n"
			+ "			from t_user \r\n"
			+ "			where siteid = ?\r\n"
			+ "			group by userkind")
	public List<Map<String, Object>> nq() {
		var items = userRepo.findUserBySiteid("base");
		
		return items;
	}
}
