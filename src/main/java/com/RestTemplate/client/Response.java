package com.RestTemplate.client;

public class Response {
	
	private String type;
	
	private Value value;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(String type, Value value) {
		super();
		this.type = type;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Response [type=" + type + ", value=" + value + "]";
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}
	

}
