package javaBasics;

public class switchcaseassignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String env="test";
//		switch(env.toLowerCase().trim())
//		{
//		case "dev":
//		System.out.print("execute in Dev environment");
//		break;
//		case "qa":
//			System.out.print("execute in QA environment");
//			break;
//			
//		case "uat":
//			System.out.print("execute in UAT environment");
//			break;
//			
//		case "stage":
//			System.out.print("execute in stage environment");
//			break;
//			
//		case "prod":
//			System.out.print("execute in Production environment");
//			break;
//			default: System.out.println("Please provide valid environment");
//			break;
//		
		
		char stateCode ='k';
		switch (stateCode)
		{
		case 'd': System.out.println("total corono cases in Delhi is 100");
		break;
		case 'a': System.out.println("total corono cases in Andra is 100");
		break;
		case 'k': System.out.println("total corono cases in karnataka is 100");
		break;
		case 't': System.out.println("total corono cases in TamilNadu is 100");
		break;
		default : System.out.println("Please enter valid state code");
		break;
		
	}
	}

}
