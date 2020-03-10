package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;


/**
 * Une interface pour créer le fichier result.out
 *
 * 
 */
public interface ISymptomReader {
	
	
	/**
	 * Lecture des symptoms à mettre dans une ArrayList
	 * @return retourne une liste dédoublonné des symptoms
	 * @throws IOException
	 */
	public ArrayList<String> getSymptoms () throws IOException;

	
}