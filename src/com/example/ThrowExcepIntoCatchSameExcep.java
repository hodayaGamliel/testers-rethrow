package com.example;

import java.util.logging.Logger;

@SuppressWarnings("unused")

public class ThrowExcepIntoCatchSameExcep 
{ 
	public static ThrowExcepIntoAnotherExcep s; 
	
	public static void main(String[] args) 
	{
		RethrowException();		
	}
	public static void RethrowException()
	{
		try 
		{
			System.out.println("rethrow Exception");
			s = null;
			s.equals("");
		}
		catch (Exception e)
		{
			throw e;
		}
	}
}


