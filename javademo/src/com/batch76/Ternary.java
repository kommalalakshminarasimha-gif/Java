package com.batch76;

public class Ternary {

	public static void main(String a[]) {
//		int n = 8;
//		
//		switch(n){
//		
//		case 1:
//		     System.out.println("Monday");
//		     break;
//		case 2:     
//		     System.out.println( "Tuesday");
//		     break;
//		case 3:
//		     System.out.println("wednesday");
//		     break;
//		case 4:     
//		     System.out.println("Thursday");
//		     break;
//		case 5:     
//		     System.out.println("Friday");
//		     break;
//		case 6:     
//		     System.out.println("Saturday");
//		     break;
//		case 7:     
//		     System.out.println("Sunday");
//		     break;
//		   default:
//			   System.out.println("Enter a valid NUmber");
		
//		}
		
		String day ="Sunday";
		
		String result = "";
		
		
		result =  switch(day) {
		case "Saturday","Sunday" -> "6am";
		
		case "Moday" -> "8am";
		
		default -> "7am";
		};
		
		System.out.println(result);
	}

}
