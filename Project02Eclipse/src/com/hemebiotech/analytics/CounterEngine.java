package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * This class handles the logic to count the symptoms from a list
 * 
 * The symptoms will be associated to their number of apparitions inside a map,
 * and the content of that map will be printed to the result file
 * 
 * 
 * @author N9-T
 *
 */
public class CounterEngine {
	
	private static final String EMPTY_SYMPTOM_LIST = "Empty symptom list given";

	/**
	 * This methods counts the symptoms and stores the results in a map
	 * with the symptom as key and the number of apparition as value
	 * 
	 * @param symptoms
	 * @return
	 */
	public static Map<String, Integer> countSymptoms(List<String> symptoms){
		//this map will store the symptoms and the number of apparitions
		final Map<String, Integer> result = new TreeMap<String, Integer>();
		
		//if the list of symptoms is not empty, the we can process it
		if(!symptoms.isEmpty()) {
			for(String s: symptoms) {
				//if a given symptom is already in the map, the we just have to retrieve its value and increment it
				if(result.containsKey(s)) {
					int val = result.get(s);
					val++;
					result.put(s, val);
				}
				// if not, then we store the symptom with the number of apparition set to 1
				else {
					result.put(s,1);
				}
			}
		}else {
			result.put(EMPTY_SYMPTOM_LIST, -1);
		}
		return result;
	}
	
}
