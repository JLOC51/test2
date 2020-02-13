package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.Set;

/**
 * Une interface pour créer le fichier result.out
 *
 * 
 */
public interface ISymptomReader {
	/**
	 * Mets le nom du chemin du fichier symptom dans la variable filepath
	 * @param filepath  fichier à lire au sein de la méthode
	 */
	public void ReadSymptomDataFromFile (String filepath);
	
	/**
	 * Créer le fichier result.out
	 * @return retourne une liste dédoublonné des symptoms
	 * @throws IOException
	 */
	public List<String> GetSymptoms () throws IOException;

	
}