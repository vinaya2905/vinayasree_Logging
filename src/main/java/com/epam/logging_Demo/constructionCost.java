package com.epam.logging_Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class constructionCost {
	private static final Logger LOGGER = LogManager.getLogger(App.class);
	String materials;
	double area;
	String automatedType;
	double ans=0;
	public constructionCost(String materials2, double area2, String automatedType2) {
		// TODO Auto-generated constructor stub
		this.materials=materials2;
		this.area=area2;
		this.automatedType=automatedType2;
	}
	public void finalCost() {
		if((automatedType.equals("no"))) 

		{
			if(materials.equals("standard")) {
				ans=1200*area;
			}
			else if(materials.equals("AboveStandard")) {
				ans=1500*area;
			}
			else if(materials.equals("HighStandard")) {
				ans=1800*area;
			}
		}
		else if((materials.equals("HighStandard")) && (automatedType.equals("yes"))){
		
				ans=2500*area;
		}
		else {
			LOGGER.info("invalid input");
		}
		LOGGER.info("Final ConstructionCost is: "+ ans);
	}
}
