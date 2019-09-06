package com.imooc.circus;

public class Lion extends Animal implements IAct {
	private String color;
	private String sex;
	
	public Lion() {
		
	}
	public Lion(String name,int age,String color,String sex) {
		this.setName(name);
		this.setAge(age);
		this.setColor(color);
		this.setSex(sex);
	}
	//技能
	@Override
	public String skill() {
		return "擅长钻火圈";
	}	
	//爱好
	@Override
	public String love() {
		return "喜欢吃各种肉类";
	}
	//表演信息
	@Override
	public String act() {
		return "表演者：" + this.getName() + "\n年龄：" + this.getAge() + "岁\n性别："+ this.getSex() + "\n毛色：" + this.getColor() + "\n技能：" + this.skill() + "\n爱好：" + this.love();
	}
	//getter/setter	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
}
