package com.p1;

public class swappingusesbitwis {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		System.out.println("value of before swapping="+x);
		System.out.println("value of before swapping="+y);
		System.out.println("-----------------");
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("vale of x after swapping="+x);
		System.out.println("value of y after swapping="+y);
		
		
		
		
			
		// TODO Auto-generated method stub

	}

}
