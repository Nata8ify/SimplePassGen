package com.n8ify.genpass.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.n8ify.genpass.service.impl.GenerateServiceImpl;

@RestController
@RequestMapping("/rest")
public class RestfulGenpassController {

	@Autowired
	private GenerateServiceImpl genService;
	
	//for now
	@GetMapping("/genalphabet")
	public List<String> generateAlphabet(int length, int flag, int amount) throws Exception{
		List<String> genArray = new ArrayList<>();
		for(int i = 0 ; i < amount ; i++) {
			genArray.add(genService.generate4Alphabet(length, flag));
		}
		return genArray;
	}
}
