package genericutility;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class LisImpClass implements ITestListener {
	
	

	public void onTestFailure (ITestResult result)
	{
		String testname = result.getMethod().getMethodName();
		System.out.println(testname  +  "Execute and iam listening");
		
		EventFiringWebDriver eDriver=new  EventFiringWebDriver(BaseClass.sDriver);
		
		 File srcfile = eDriver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile,new File("./screenshot/"+testname+ ".png"));

		} catch (IOException e) {
			e.printStackTrace();
			
			e.printStackTrace();
		}
	}
}
	
	
	
	
	

	


