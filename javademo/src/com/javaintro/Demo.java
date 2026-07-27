package com.javaintro;

public class Demo {
	
	static int countryId;
	static String countryName;
	int jerseyNo;
	String demoName;
	
	public static void main(String[] args) {
		countryId=20;
		countryName="india";
		
		System.out.println(countryId);
		System.out.println(countryName);
		
		System.out.println("************** Object 1 *********************");
		Demo kln = new Demo();
		
		System.out.println("CountryId : " + countryId);
		System.out.println("CountryName : " + countryName);
		
		
		kln.jerseyNo = 11;
		kln.demoName="Nara";
		System.out.println("JerseyNo : " + kln.jerseyNo);
		System.out.println("DemoName : " + kln.demoName);
		
		System.out.println("------------------------------------------");
		
		System.out.println("********** Object 2 *****************");
		
		Demo LN = new Demo();
		
		LN.jerseyNo= 20;
		LN.demoName ="KLN";
		
	System.out.println("CountryId : " + countryId);
	System.out.println("CountryName : " + countryName);
	System.out.println("JerseyId : " + LN.jerseyNo);
	System.out.println("DemoName : " + LN.demoName);


	}

}
