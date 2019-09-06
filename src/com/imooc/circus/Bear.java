package com.imooc.circus;

public class Bear extends Animal implements IAct {
	public Bear() {
		
	}
	public Bear(String name,int age) {
		this.setName(name);
		this.setAge(age);
	}
	//技能
	@Override
	public String skill() {
		return "挽着花篮，打着雨伞，自立走秀";
	}
	//爱好
	@Override
	public String love() {
		return "喜欢卖萌";
	}
	//表演信息
	@Override
	public String act() {
		return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n技能：" + this.skill() + "\n爱好：" + this.love();
	}
}
