package com.epam.log;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);
	float principleAmount,rate,time,simpleInterest;
	void readValues() throws IOException{
		Scanner s = new Scanner(System.in);
		LOGGER.info("Enter Principle Amount : ");
		principleAmount = s.nextFloat();
		LOGGER.info("Enter Rate : ");
		rate = s.nextFloat();
		LOGGER.info("Enter Time Period : ");
		time = s.nextFloat();
	}
	void calculateSimpleInterest(){
		simpleInterest = (principleAmount * rate * time)/100;
	}
	void displayAmount() throws IOException{
		LOGGER.info("Total Amount : "+simpleInterest);
	}

}
