package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Anything that will read symptom data from a source
 * The important part is, the return value from the operation, which is a list of strings,
 * that may contain many duplications
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomReader {
	/**
	 * If no data is available, return an empty List
	 * @param string 
	 * 
	 * @return a raw listing of all Symptoms obtained from a data source, duplicates are possible/probable
	 */
	
	
	public void ReadSymptomDataFromFile ();
	
	public List<String> GetSymptoms () throws IOException;

	
}