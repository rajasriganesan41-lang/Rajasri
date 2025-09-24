package com.p1;
import java.util.Scanner;
public class sarea {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		int length=sc.nextInt();
		System.out.println("enter breadth:");
		int breadth=sc.nextInt();
		int area=length*breadth;
		System.out.println("area:"+area);
		sc.close();
		// TODO Auto-generated method stub

	}

}
