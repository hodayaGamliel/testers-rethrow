package com.example;

import com.example.ThrowExcepIntoAnotherExcep;

@SuppressWarnings("serial")
public class ThrowExcepIntoCatchTwoDiffExcep extends Exception
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
			System.out.println("first try");
			s = null;
			s.equals("");
		}
		catch (Exception e)
		{
			try
			{
				System.out.println("second try");
				s = null;
				s.equals("");
			}
			catch (Exception exception1)
			{
				throw e;
			}
		}
	}
}

