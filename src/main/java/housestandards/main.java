package housestandards;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.System.Logger;
import java.util.Scanner;
import java.util.logging.LogManager;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
 


public class main {
   private static  final Logger LOGGER = (java.lang.System.Logger) LogManager.getLogger(main.class.getName());
	public static void func()  {
		Scanner input=new Scanner(System.in);
		
		int opt,sq,ans,a;
	
		((java.util.logging.Logger) LOGGER).info("1.standard materials \n2.above standard materials \n3.high standard materials \nenter your option : ");
		
		opt=input.nextInt();
		((java.util.logging.Logger) LOGGER).info("enter total area of the house in square feet : ");
		
		sq=input.nextInt();
		((java.util.logging.Logger) LOGGER).info("enter fully automatic or not  if yes type 1 ,otherwise type 2 :   ");
		
		a=input.nextInt();
		ans=estimate.func(opt,sq,a);
		((java.util.logging.Logger) LOGGER).info("\n total amount is : "+ans+"INR");
		
		
		
	}

}
