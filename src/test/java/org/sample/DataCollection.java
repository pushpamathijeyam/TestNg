package org.sample;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class DataCollection extends BaseClass {

	@DataProvider(name = "course")
	private Object[][] loginData() throws IOException {

		return new Object[][] {
			{readDataFromExcel("adactin", 1, 0),readDataFromExcel("adactin", 1, 1)},
//			{readDataFromExcel("adactin", 2, 0),readDataFromExcel("adactin", 2, 1)},
//			{readDataFromExcel("adactin", 3, 0),readDataFromExcel("adactin", 3, 1)},
//			{readDataFromExcel("adactin", 4, 0),readDataFromExcel("adactin", 4, 1)},
//			{readDataFromExcel("adactin", 5, 0),readDataFromExcel("adactin", 5, 1)}
//			

//				{ "java", "java@123" }, 
//				{ "sele", "sele@123" }, 
//				{ "fram", "Frame@123" },
//				{ "manual", "manual@123" },
//				{ "greens", "greens@123" },

		};

	}

}
