package com.epam.logging_Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class compoundInterest {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	int p;
	int t;
	double r;
	public compoundInterest(int p,int t,double r) {
		this.p=p;
		this.t=t;
		this.r=r;
	}
	public void CI() {
		double ans=p * 
                (Math.pow((1 + r / 100), t));
		LOGGER.info("Compound Interest is : "+ans);
	}
}
