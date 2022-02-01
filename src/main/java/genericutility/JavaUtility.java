package genericutility;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;
import java.util.Random;


public class JavaUtility {
	/**
	 * this method will generate a random number and returns it to the caller
	 * @return
	 */
	public int getRandomNum() {

		Random rndm = new Random();

		int randomInt = rndm.nextInt(10000);
		return randomInt;

	}
	/**
	 * this method will return the current date
	 * @return 
	 * @return
	 */
	public String getCurrentdate() {


		Date dd = new Date();
		String currentdate = dd.toString();
		return currentdate;

	}

	/**
	 * this method will return date in soecified farmat
	 * @return 
	 * @return
	 */

	public String getFinalDateformat() {


		Date dd = new Date();
		String d = dd.toString();
		String[] dte = d.split("");
		String  YYYY = dte[5];
		String DD = dte[2];
		String MM = dte[2];
		String today = YYYY+"_"+MM+"_"+DD;
		return today;

	}



}
