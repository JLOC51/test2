package com.hemebiotech.analytics;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class WriteSymptomDataFromFile implements ISymptomWriter {

	private TreeMap<String, Integer> pmonFichierSortieCount;
	private String s = System.getProperty("line.separator");

	/**
	 * 
	 * @param pmonFichierSortieCount
	 */
	public WriteSymptomDataFromFile(TreeMap<String, Integer> pmonFichierSortieCount) {
		this.pmonFichierSortieCount = pmonFichierSortieCount;
	}

	/**
	 * Création et ecriture des symptoms dans le fichier result.out
	 * 
	 * @throws IOException
	 */
	public void WriteSymptom() throws IOException {

		FileWriter writer = null;

		try {
			writer = new FileWriter("C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/result5.out");
			for (Map.Entry<String, Integer> entry : pmonFichierSortieCount.entrySet()) {

				String key = entry.getKey();
				Integer value = entry.getValue();
				writer.write(key + " : " + value + s);

			}

			writer.close();

		}

		catch (FileNotFoundException e) {
			System.out.println("chemin du fichier result.out non trouvé");
			// e.printStackTrace();
		}

		catch (IOException e) {

			e.printStackTrace();

		}

	}

}
