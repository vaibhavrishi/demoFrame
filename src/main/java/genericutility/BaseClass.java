package genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.vtiger.comcast.pomrepositrylib.HomePage;
import com.vtiger.comcast.pomrepositrylib.LoginPage;

public class BaseClass {
	public static WebDriver sDriver=null;

	public WebDriver driver;
	/*
	 * CREATING THE OBJECT CLASS FOR GENERIC LIBRARY METHODS
	 */
	public JavaUtility jLib = new JavaUtility();
	public FileUtility fLib = new FileUtility();
	public ExcelUtility eLib = new ExcelUtility();
	public WebDriverUtility wLib = new WebDriverUtility();

	@BeforeSuite(groups= {"Smoke test","regression test"})
	public void configBS() {

		System.out.println("=================Conect To DataBase================");
	}
	//@Parameters("BROWSER")
	@BeforeClass(groups= {"Smoke test","regression test"})
	public void configBC() throws Throwable {

		System.out.println("=================Launch the Browser================");
	    String BROWSER = fLib.getPropertyKeyValue("browser");
		String URL = fLib.getPropertyKeyValue("url");

		if(BROWSER.toLowerCase().equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(BROWSER.toLowerCase().equals("firefox"))	
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.toLowerCase().equals("ie"))	
		{
			driver=new InternetExplorerDriver();
		}
		else if(BROWSER.toLowerCase().equals("firefox"))	
		{
			driver=new FirefoxDriver();
		}
		else if(BROWSER.toLowerCase().equals("edge"))	
		{
			driver=new EdgeDriver();
		}

		wLib.waitUntilLoad(driver);
		driver.get(URL);
		sDriver=driver;
		driver.manage().window().maximize();
	}



	@BeforeMethod(groups= {"Smoke test","regression test"})
	public void configBM() throws Throwable {

		/*step 1 : log in */
		String USN = fLib.getPropertyKeyValue("username");
		String PWD = fLib.getPropertyKeyValue("password");

		LoginPage lin = new LoginPage(driver);
		lin.loginPage(USN, PWD);

	}

	@AfterMethod(groups= {"Smoke test","regression test"})
	public void configAM() {
		/* log out */

		HomePage hp = new HomePage(driver);
		hp.logout();	
	}

	@AfterClass(groups= {"Smoke test","regression test"})
	public void configAC() {

		System.out.println("============Close the Browser===============");

		driver.quit();
	}

	@AfterSuite(groups= {"Smoke test","regression test"})
	public void configAS() {

		System.out.println("=================Close The DataBase Connection================");
	}


}






