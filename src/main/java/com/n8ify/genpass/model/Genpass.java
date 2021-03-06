package com.n8ify.genpass.model;

public class Genpass {
	private String id;
	private String pass;
	private int flag;

	
	
	public Genpass(String id, String pass, int flag) {
		super();
		this.id = id;
		this.pass = pass;
		this.flag = flag;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "Genpass [id=" + id + ", pass=" + pass + ", flag=" + flag + "]";
	}

}
