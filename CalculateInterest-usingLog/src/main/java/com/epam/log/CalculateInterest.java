package com.epam.log;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CalculateInterest {
	private static final Logger LOGGER = LogManager.getLogger(CalculateInterest.class);
    public static void main( String[] args )throws IOException{
    	
    	LOGGER.debug("This is DEBUG Statement");
    	LOGGER.info("This is INFO Statement");
    	LOGGER.warn("This is WARN Statement");
    	LOGGER.error("This is ERROR Statement");
    	LOGGER.fatal("This is FATAL Statement");
    	
		Scanner s = new Scanner(System.in);
		LOGGER.info("Choose either option 1 or 2 :"+"\n");
		LOGGER.info("1.Simple Interest"+"\n");
		LOGGER.info("2.Compound Interest"+"\n");
		SimpleInterest simpleInterest = new SimpleInterest();
		CompoundInterest compoundInterest = new CompoundInterest();
		int choice = s.nextInt();
		switch(choice){
			case 1:simpleInterest.readValues();
				   simpleInterest.calculateSimpleInterest();
				   simpleInterest.displayAmount();
				   break;
			case 2:compoundInterest.readValues();
			   compoundInterest.calculateCompoundInterest();
			   compoundInterest.displayAmount();
			   break;
			default:LOGGER.info("Please Enter Valid Option!");
		}
	}

}
