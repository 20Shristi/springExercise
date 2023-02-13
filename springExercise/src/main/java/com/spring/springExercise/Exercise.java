package com.spring.springExercise;

public class Exercise {
	
	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Exercise() {
		
	}
	public Exercise(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "Exercise [str=" + str + "]";
	}
	

}
