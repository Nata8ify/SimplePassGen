package com.n8ify.genpass.service;

import com.n8ify.genpass.model.Genpass;

public interface GenerateService {
	public String generate4Alphabet(int length, int flag) throws Exception;
	public Genpass generate4AlphabetModel(int length, int flag) throws Exception;
}
