/*
 2.	After mentioning to Professor Jackson that you would like to get some more practice with exceptions, she offered to let you write some grading software! Before she gives you full control over auto-grading students’ work, she asked if you could write a function called checkFileExtension(). 

The checkFileExtension() method takes in one parameter: fileName.

checkFileExtension() should return an integer representing the number of points a student receives for properly submitting a file in Java. 

If a student’s submitted file ends in .java, they get 1 point. 

If a student’s submitted file doesn’t end in .java, they get 0 points. 

If the file submitted is null or an empty string, an exception should be thrown and you should give the student -1 points. 

What kind of exception is up to you, including to a custom exception!

In main(), Professor Jackson has provided a array of students and the names of their submitted files for you to test out your work. 

If an exception is caught, make sure to print out the error message.

 */


package com.exception.bll;
import java.util.Map;
import java.util.HashMap;

public class CheckFile {


	  public static void main(String[] args) {

	        HashMap<String, String> studentFiles = new HashMap<>();
	        studentFiles.put("Abhishek", "Program.java");
	        studentFiles.put("Anant", "");
	        studentFiles.put("Elon", "MyCode.txt");
	        studentFiles.put("Aryan", "JavaProgram.java");
	        
	        int i=0; 
	         
	        for (Map.Entry<String, String> e : studentFiles.entrySet()) {
	        	
	        	
	        	
	        	try 
	        	{   
		        	int point=checkFileExtension(e.getValue());//checking file type with checkFileExtension() method.
		        	
		        	// giving points according to file type
		        	if(point==1) {
		        		System.out.println( e.getKey() +"'s " + e.getValue() + " is a java file. Point: 1");
		        	}
		        	
		        	else {
						System.out.println(e.getKey() +"'s " + e.getValue() + " is not a java file. Point: 0");
		        	}
	        	}
	        	
	        	catch(NullException ex) {//null string
	    			System.out.println(e.getKey() +". You have send a null. Point: -1");
	    			
	    		}
	        	
	        	catch(EmptyException ex) {//empty string
	    			System.out.println( e.getKey() +". You have send an empty string. Point: -1");
	    			
	    		}
	        	
	        	catch(Exception ex) {//other exception
	    			System.out.println("Your score is -1");
	    			System.out.println(ex.getMessage());
	    		}
	       }
	         
	    }
	  
	  
		
public static int checkFileExtension(String fileName) throws NullException, EmptyException 
{
	if(fileName==null) { //null exception
		throw new NullException("You have send the null string.");
	}
	
	if(fileName.isEmpty()) { //empty exception
		throw new EmptyException("You have send the empty string.");
	}
	
	if(fileName.endsWith(".java")) 
		return 1;
	
	else
		return 0;
}



}
