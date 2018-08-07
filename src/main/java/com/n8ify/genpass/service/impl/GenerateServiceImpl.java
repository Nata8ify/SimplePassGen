package com.n8ify.genpass.service.impl;

import org.springframework.stereotype.Service;

import com.n8ify.genpass.model.Genpass;

@Service
public class GenerateServiceImpl implements com.n8ify.genpass.service.GenerateService {

	public static final int FLAG_GENERATE_LOWER_ONLY = 0;
	public static final int FLAG_GENERATE_UPPER_ONLY = 1;
	public static final int FLAG_GENERATE_BOTH_DONT_CARE = 2;
	
	@Override
	public String generate4Alphabet(int length, int flag) throws Exception {
		int startAsciiPosition = 0;
		int endAsciiPosition = 0;
		switch(flag) {
		case FLAG_GENERATE_LOWER_ONLY :
			startAsciiPosition = 97;
			endAsciiPosition = 122;
			break;
		case FLAG_GENERATE_UPPER_ONLY :
			startAsciiPosition = 65;
			endAsciiPosition = 90;
			break;
		case FLAG_GENERATE_BOTH_DONT_CARE :
			startAsciiPosition = 65;
			endAsciiPosition = 122;
			break;
		default : throw new Exception("Invalid Flag");
		}

		StringBuilder builder = new StringBuilder();
		for(int i = 0 ; i < length ; i++) {
			char randomCharacter = (char) (((int)(Math.random()*(endAsciiPosition - startAsciiPosition + 1)) + startAsciiPosition));
			builder.append(String.valueOf(randomCharacter));
		}
		return builder.toString();
	}

	@Override
	public Genpass generate4AlphabetModel(int length, int flag) throws Exception {
		int startAsciiPosition = 0;
		int endAsciiPosition = 0;
		switch(flag) {
		case FLAG_GENERATE_LOWER_ONLY :
			startAsciiPosition = 97;
			endAsciiPosition = 122;
			break;
		case FLAG_GENERATE_UPPER_ONLY :
			startAsciiPosition = 65;
			endAsciiPosition = 90;
			break;
		case FLAG_GENERATE_BOTH_DONT_CARE :
			startAsciiPosition = 65;
			endAsciiPosition = 122;
			break;
		default : throw new Exception("Invalid Flag");
		}

		StringBuilder builder = new StringBuilder();
		for(int i = 0 ; i < length ; i++) {
			char randomCharacter = (char) (((int)(Math.random()*(endAsciiPosition - startAsciiPosition + 1)) + startAsciiPosition));
			builder.append(String.valueOf(randomCharacter));
		}
		String genpass = builder.toString();
		String psuedoPassId = String.valueOf(genpass.hashCode()).concat(String.valueOf(System.currentTimeMillis()%100));
		return new Genpass(psuedoPassId, genpass, flag);
	}
}
