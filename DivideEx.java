package com.exception.bll;

public class DivideEx {
	
	
	public int divide(int x,int y) { // divide method 
	
	try{
		 return x/y;
		}
	
	catch(ArithmeticException e){ //catching the exception
			System.out.println(e+"__Cannot divide by zero");
		}	
	
	return y;
	}
	

}
