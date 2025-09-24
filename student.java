package com.p1;

public class student {
	int id;
	String name;
	void Display (){
		
	
		 System.out.println("id="+id);
		 System.out.println("name="+name);
		
		// TODO Auto-generated method stub

	}

}
class ece{
	public static void main(String []args){
		student ram=new student();
		ram.id=101;
		ram.name="ram kumar";
		ram.Display();
	}
	
}

