package com.p1;

import java.util.Scanner;
public class ssumandaverage{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number:");
		int num1=sc.nextInt();
		System.out.println("enter the second number:");
		int num2=sc.nextInt();
		int sum=num1+num2;
		double average=sum/2.0;
		System.out.println("sum:"+sum);
		System.out.println("average:"+average);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}


