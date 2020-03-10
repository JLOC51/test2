package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filePath;

	/**
	 * 
	 * @param fichier à lire
	 */
	public ReadSymptomDataFromFile(String filePath) {
		this.filePath = filePath;

	}
	
	/**
	 * J'alimente ArrayList
	 */
	public ArrayList<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();

		if (filePath != null) {

			FileReader fileReader;
			try {

				fileReader = new FileReader(filePath);

			} catch (FileNotFoundException e) {
				System.out.println("Fichier non trouvé");
				// e.printStackTrace();
			}

			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filePath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();

			}

			catch (IOException e) {
				System.out.println("Erreur D'entrée de manipulation avec le fichier");
				// e.printStackTrace();
			} finally {
				reader.close();
			}

		}

		return result;

	}

}
