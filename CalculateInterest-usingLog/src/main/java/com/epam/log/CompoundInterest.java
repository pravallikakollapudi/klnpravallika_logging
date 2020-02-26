package com.epam.log;


import java.io.IOException;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
	private static final Logger LOGGER = LogManager.getLogger(CompoundInterest.class);
	float principleAmount,rate,time,compoundInterest,n;
	void readValues() throws IOException{
		Scanner s = new Scanner(System.in);
		LOGGER.info("Enter Principle Amount : ");
		principleAmount = s.nextFloat();
		LOGGER.info("Enter Rate : ");
		rate = s.nextFloat();
		LOGGER.info("Enter Time Period : ");
		time = s.nextFloat();
	}
	void calculateCompoundInterest(){
		compoundInterest = (float) (principleAmount * (Math.pow((1 + rate / 100.0), time))); 
	}
	void displayAmount() throws IOException{
		LOGGER.info("Total Amount : "+compoundInterest);
	}

}
