package com.example;


import java.util.logging.Level;
import java.util.logging.Logger;

public class ThrowLogExcepIntoCatch 
{	
	public static ThrowExcepIntoAnotherExcep s;
	
	public static void main(String[] args) 
	{
		RethrowException();		
	}
	public static  void RethrowException()
	{
		try 
		{
			System.out.println("logger obgect in catch");
			s = null;
			s.equals("");
		}
		catch (Exception e)
		{
			Logger log = Logger.getLogger("logs");
			log.log(Level.SEVERE, "severe log", e);
		}
		

	}
}

