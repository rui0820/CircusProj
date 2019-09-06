package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.imooc.circus.*;

public class Circus {
	public void display() {
		System.out.println("************欢迎来到太阳马戏团************");
		System.out.println("************  请选择表演者  ************");
		System.out.println("*********    1、棕     熊    *********");
		System.out.println("*********    2、狮     子    *********");
		System.out.println("*********    3、猴     子    *********");
		System.out.println("*********    4、鹦     鹉    *********");
		System.out.println("*********    5、小     丑    *********");
	}
	
	public static void main(String[] args) {
		//实例化对象
		Bear bear = new Bear("Bill",1);
		Lion lion = new Lion("Lain",2,"灰色","公狮");
		Monkey monkey = new Monkey("Tom",1,"金丝猴");
		Parrot parrot = new Parrot("Rose",1,"牡丹鹦鹉");
		Clown clown = new Clown("Kahle",5);
		Circus cs = new Circus();
		
		Scanner sc = new Scanner(System.in);
		int input = 0;
		
		while(true) {
			cs.display();
			try {
			input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入");
				sc.next();
				continue;
			}
			
			if(input < 1 || input > 5) {
				System.out.println("*******输入信息不正确，请重新输入*******");
			}
			
			switch(input) {
			case 1:
				System.out.println(bear.act());
				break;
			case 2:
				System.out.println(lion.act());
				break;
			case 3:
				System.out.println(monkey.act());
				break;
			case 4:
				System.out.println(parrot.act());
				break;
			case 5:
				System.out.println(clown.act());
				break;
			}
			
			System.out.println("*********** 是否继续观看（1/0）***********");
			try {
			input = sc.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("输入的数据有误，请重新输入");
				sc.next();
				continue;
			}
			if(input == 0) {
				System.out.println("***********     欢 迎 下 次 光 临    ***********");
				break;
			}else if(input == 1) {
				//nothing
			}else {
				System.out.println("*******输入信息不正确，请重新输入*******");
			}
		}
	}
}
