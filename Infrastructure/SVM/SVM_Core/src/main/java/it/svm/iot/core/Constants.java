package it.svm.iot.core;

/**
 * Class containing all the constants used in the application
 * @author Paolo Sassi
 * @author Matteo Rotundo
 *
 */

public class Constants {
	
	/************************ Core Constants **********************************/
	
	/**
	 * Loopback address.
	 * 127.0.0.1 is used when the OM2M CSEs are on the same machine of
	 * the ADN.
	 * 10.0.2.2 is used when the OM2M CSEs are on the host OS (assuming
	 * to run the cooja simulation on the Instant Contiki VM.
	 */
	public static final String LOOPBACK = "127.0.0.1";
	//public static final String LOOPBACK = "10.0.2.2";
	
	/**
	 * Enables the debugging code.
	 */
	public static final Boolean DEBUG = true;
	
	/**
	 * Maximum quantity for a specific product.
	 */
	public static final int MAX_PROD_QTY = 10;
	/**
	 * Minimum product price.
	 */
	public static final float MIN_PRICE = (float) 0.0;
	/**
	 * Maximum product price.
	 */
	public static final float MAX_PRICE = (float )3.0;
	/**
	 * Minimum coffee machine drink temperature.
	 */
	public static final float MIN_COFFEE_TEMP = (float) 40.0;
	/**
	 * Maximum coffee machine drink temperature.
	 */
	public static final float MAX_COFFEE_TEMP = (float) 80.0;
	/**
	 * Minimum food machine food temperature.
	 */
	public static final float MIN_FOOD_TEMP = (float) 5.0;
	/**
	 * Maximum food machine food temperature.
	 */
	public static final float MAX_FOOD_TEMP = (float) 25.0;
	/**
	 * Minimum latitude.
	 */
	public static final float MIN_LAT = (float) -90.0;
	/**
	 * Maximum latitude.
	 */
	public static final float MAX_LAT = (float) 90.0;
	/**
	 * Minimum longitude.
	 */
	public static final float MIN_LNG = (float) -180.0;
	/**
	 * Maximum longitude.
	 */
	public static final float MAX_LNG = (float) 180.0;
	
	/************************ Middle Node Constants **************************/
	
	/**
	 * Middle Node CSE URI
	 */
	public static final String MN_CSE_URI = "coap://" + LOOPBACK + ":5683/~/"
			+ "svm-mn-cse/svm-mn-name";
	
	/**
	 * Middle Node CSE URI without the cse name.
	 */
	public static final String MN_CSE_SHORT_URI = "coap://" + LOOPBACK + ":5683/~/"
			+ "svm-mn-cse";
	/**
	 * Border Router global IPv6 address
	 */
	public static final String BR_ADDR = "aaaa::c30c:0:0:1";
	
	/******************** Infrastructure Node Constants **********************/
	
	public static final String IN_CSE_URI = "coap://" + LOOPBACK + ":5683/~/"
			+ "svm-in-cse/svm-in-name";
}
