/**
 * 
 */
package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * @author N9-T
 *
 */
public class PrintResultToFile implements IPrintResults {
	
	private String pathToFile;
	
	public PrintResultToFile(String path) {
		this.pathToFile = path;
	}

	/* (non-Javadoc)
	 * @see com.hemebiotech.analytics.IPrintResults#printResults(java.util.Map)
	 */
	@Override
	public boolean printResults(Map<String, Integer> results) {
		try(FileWriter writer= new FileWriter (pathToFile)) {
			for(Map.Entry<String, Integer> item: results.entrySet()) {
				writer.write(item.getKey()+": " + item.getValue() + "\n");
			}
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

}
