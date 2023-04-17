package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
public class TestController {

	private final UserRepository userRepo;
	
	@RequestMapping("/ping")
	public List<Map<String, Object>> ping() {
		
//		User user = userRepo.findByNoNamedQuery(1);
		var items = userRepo.findUserBySiteid("base");
		
		return items;
	}
}
