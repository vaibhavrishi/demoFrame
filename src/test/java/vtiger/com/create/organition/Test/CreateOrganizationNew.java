package vtiger.com.create.organition.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.vtiger.comcast.pomrepositrylib.CreatNewOrganizationPage;
import com.vtiger.comcast.pomrepositrylib.HomePage;
import com.vtiger.comcast.pomrepositrylib.LoginPage;
import com.vtiger.comcast.pomrepositrylib.OrganizationInfoPage;
import com.vtiger.comcast.pomrepositrylib.OrganizationsPage;

import genericutility.BaseClass;
import genericutility.ExcelUtility;
import genericutility.FileUtility;
import genericutility.JavaUtility;
import genericutility.WebDriverUtility;

public class CreateOrganizationNew extends BaseClass {

	@Test(groups="Smoke test")
	public void createOrgTest()throws Throwable {

		int random = jLib.getRandomNum();
		String orgname = eLib.getDataFromExcel("Sheet1", 1, 2)+ random;

		HomePage hp = new HomePage(driver);
		hp.getOrganizationlnk().click();

		OrganizationsPage org = new OrganizationsPage(driver);
		org.getOrganplusimg().click();

		CreatNewOrganizationPage cno = new CreatNewOrganizationPage(driver);
		cno.createOrgan(orgname);


		OrganizationInfoPage oinfo = new OrganizationInfoPage(driver);
		wLib.waitForVisibility(driver, oinfo.getSuccessfullmsg());
		String actsucmsg = oinfo.getSuccessfullmsg().getText();

		if (actsucmsg.contains(orgname)){
			System.out.println("org created successfully");

		}
		else {
			System.out.println("org not created sussessfully");


		}

	}



	@Test(groups="regression test")	
	public void createoeganwithIndEducationTest() throws Throwable {

		int random = jLib.getRandomNum();

		String orgnameforEdu = eLib.getDataFromExcel("Sheet1", 4, 2)+ random;

		HomePage hp = new HomePage(driver);
		hp.getOrganizationlnk().click();

		OrganizationsPage org = new OrganizationsPage(driver);
		org.getOrganplusimg().click();


		CreatNewOrganizationPage cno = new CreatNewOrganizationPage(driver);

		cno.createOrganWithEdu(orgnameforEdu);
		Thread.sleep(2000);
		

	}

}



