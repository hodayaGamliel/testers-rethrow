package com.example;

public class TrowIntoCatch 
{
		public static void main(String[] args) throws Exception  	
		{
			exception();
		}	
		public static void exception() throws Exception
		{
			System.out.println("before excep ");		
			throw new Exception();
		}
}