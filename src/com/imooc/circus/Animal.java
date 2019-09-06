package com.imooc.circus;

public abstract class Animal {
	private String name;			//昵称
	private int age;				//年龄

	public abstract String love();	//描述爱好
	//getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
