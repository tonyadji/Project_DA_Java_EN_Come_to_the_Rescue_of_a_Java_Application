package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		ISymptomReader reader = new ReadSymptomDataFromFile("symptoms.txt");
		IPrintResults resultsPrinter = new PrintResultToFile("result.out");
		resultsPrinter.printResults(CounterEngine.countSymptoms(reader.GetSymptoms()));
	}
}
