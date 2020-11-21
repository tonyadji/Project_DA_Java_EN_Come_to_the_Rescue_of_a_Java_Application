package com.hemebiotech.analytics;

import java.util.Map;

/**
 * This class will write results to any storage
 * 
 * 
 * @author N9-T
 */
public interface IPrintResults {

	/**
	 * This methods prints the result to some storage (file, db...)
	 * Returns true if the operation completes successfully or false if a problem occurs
	 * 
	 * @param results
	 * 
	 * @return boolean
	 */
	public boolean printResults(Map<String, Integer> results);
}
