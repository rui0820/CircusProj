package com.imooc.circus;

public class Parrot extends Animal implements IAct {
	private String type;
	
	public Parrot() {
		
	}
	public Parrot(String name,int age,String type) {
		this.setName(name);
		this.setAge(age);
		this.setType(type);
	}
	//技能
	@Override
	public String skill() {
		return "擅长模仿";
	}	
	//爱好
	@Override
	public String love() {
		return "喜欢吃坚果和松子";
	}
	//表演信息
	@Override
	public String act() {
		return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n品种："+ this.getType() + "\n技能：" + this.skill() + "\n爱好：" + this.love();
	}
	//getter/setter
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
