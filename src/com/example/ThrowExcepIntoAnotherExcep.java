package com.example;

import java.lang.RuntimeException;;
//import java.util.logging.Logger;

@SuppressWarnings("serial")
public class ThrowExcepIntoAnotherExcep extends RuntimeException
{
	public static ThrowExcepIntoAnotherExcep s; 
	public static void main(String[] args) 
	{	
		exception();		
	}
	public static void exception()
	{	
		try 
		{
			s = null;
			s.equals("");
		//	System.out.println("Try Exception");
		}
		catch (NullPointerException test2_exception)
		{
			throw new IllegalStateException(test2_exception) ;
		}
	}
}
 