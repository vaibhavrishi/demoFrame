package vtiger.com.create.contact.Test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.comcast.pomrepositrylib.ContactInfoPage;
import com.vtiger.comcast.pomrepositrylib.ContactsPage;
import com.vtiger.comcast.pomrepositrylib.CreatNewOrganizationPage;
import com.vtiger.comcast.pomrepositrylib.CreateNewContactPage;
import com.vtiger.comcast.pomrepositrylib.HomePage;
import com.vtiger.comcast.pomrepositrylib.OrganizationInfoPage;
import com.vtiger.comcast.pomrepositrylib.OrganizationsPage;

import genericutility.BaseClass;
@Listeners(genericutility.LisImpClass.class)
public class CreatenewContactNew extends BaseClass {


	@Test(groups="Smoke test")
	public void createcontactTest() throws Throwable {

		int random = jLib.getRandomNum();

		String contactname = eLib.getDataFromExcel("Sheet1", 7, 2)+ random;

		HomePage hp = new HomePage (driver);
		hp.getContactslnk().click();

		ContactsPage cp= new ContactsPage(driver);
		cp.getcontactplusimg().click();


		//Thread.sleep(3000);
		CreateNewContactPage cnp = new CreateNewContactPage(driver);
		cnp.createcontact(contactname);



		ContactInfoPage cinfo = new ContactInfoPage(driver);
		wLib.waitForVisibility(driver, cinfo.getSuccessfullmsg());
		String actsucmsg = cinfo.getSuccessfullmsg().getText();

		/*if (actsucmsg.contains(contactname)){
			System.out.println("contact created successfully");

		}
		else {
			System.out.println("contact not created sussessfully");


		}
*/

	}



	@Test(groups="regression test")
	public void orgWithContactTest() throws Throwable {
		
		
		
		int random = jLib.getRandomNum();

		String orgnameforcnt = eLib.getDataFromExcel("Sheet1", 10, 2)+ random;
		String contactnamefororg = eLib.getDataFromExcel("Sheet1", 10, 3)+ random;

		HomePage hp = new HomePage(driver);
		hp.getOrganizationlnk().click();

		OrganizationsPage org = new OrganizationsPage(driver);
		org.getOrganplusimg().click();

		CreatNewOrganizationPage cno = new CreatNewOrganizationPage(driver);
		cno.createOrgforcnt(orgnameforcnt);

		/*/Explicitly time out
		 * 
		 * */

		OrganizationInfoPage orgn = new OrganizationInfoPage(driver);

		wLib.waitForVisibility(driver, orgn.getSuccessfullmsg());

		/*
		 * navigate to contact page
		 */
		hp.getContactslnk().click();

		/*
		 * navigate to contacts plus symbol
		 */
		ContactsPage cnt = new ContactsPage(driver);
		cnt.getcontactplusimg().click();
		/*
		 * navigate to create contacts page
		 */
		CreateNewContactPage nct = new CreateNewContactPage(driver);

		nct.getOrgName().click();

		nct.createcontactwithOrg(contactnamefororg, driver, orgnameforcnt);

		ContactInfoPage cinfo = new ContactInfoPage(driver);
		wLib.waitForVisibility(driver, cinfo.getSuccessfullmsg());
		String actsucmsg = cinfo.getSuccessfullmsg().getText();

		if (actsucmsg.contains(contactnamefororg)){
			System.out.println("contact with organization created successfully");

		}
		else {
			System.out.println("contact with organization not created sussessfully");


		}





	}


}





