package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.TreeMap;

public class Main {

	static ArrayList<String> monFichierSortie;
	static TreeMap<String, Integer> monFichierSymptomCount;
	static String fichierSymptomTexte = "C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/symptoms.txt";

	/**
	 * point d'entrée du code
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {

		// Je lis mon fichier symptom
		ISymptomReader monFichierSymptom = new ReadSymptomDataFromFile(fichierSymptomTexte);
		monFichierSortie = monFichierSymptom.getSymptoms();
		System.out.println(monFichierSortie);

		// Je Compte et trie mes symptom
		ISymptomCounter monFichierSymptomSortieCount = new AnalyticsCounter(monFichierSortie);
		monFichierSymptomCount = monFichierSymptomSortieCount.countSymptom();
		System.out.println(monFichierSymptomCount);

		// J'écris dans mon fichier Result.out
		ISymptomWriter monFichierSymptomSortieWrite = new WriteSymptomDataFromFile(monFichierSymptomCount);
		monFichierSymptomSortieWrite.WriteSymptom();

	}

}
