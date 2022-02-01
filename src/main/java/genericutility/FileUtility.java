package genericutility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 
 * @authorDeepak
 *	
 */

public class FileUtility {

	/**
	 * its used to read the data from commonData.properties File based on Key which you pass as an argument
	 * @param key
	 * @throws Throwable 
	 */
	public String getPropertyKeyValue(String key) throws Throwable {
		FileInputStream fis = new FileInputStream("./data/commondata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;

	}

	/**
	 * used to pass Virtual Key to OS
	 * @throws Throwable
	 */
	public void pressVurtualEnterKey() throws Throwable {

		Robot rc=new Robot();
		rc.keyPress(KeyEvent.VK_ENTER);
		rc.keyRelease(KeyEvent.VK_ENTER);
	}




}






