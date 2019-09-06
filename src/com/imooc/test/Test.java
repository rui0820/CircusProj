package com.imooc.test;

import com.imooc.circus.*;
public class Test {
	public static void main(String[] args) {
		Test t1 = new Test();
		//棕熊测试
		Bear bear = new Bear("Bill",1);
		System.out.println(bear.act());
		System.out.println("=============================");
		//狮子测试
		Lion lion = new Lion("Lain",2,"灰色","公狮");
		System.out.println(lion.act());
		System.out.println("=============================");
		//猴子测试
		Monkey monkey = new Monkey("Tom",1,"金丝猴");
		System.out.println(monkey.act());
		System.out.println("=============================");
		//鹦鹉测试
		Parrot parrot = new Parrot("Rose",1,"牡丹鹦鹉");
		System.out.println(parrot.act());
		System.out.println("=============================");
		//小丑测试
		Clown clown = new Clown("Kahle",5);
		System.out.println(clown.act());
		System.out.println("=============================");
	}
}
