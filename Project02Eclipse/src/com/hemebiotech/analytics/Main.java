package com.hemebiotech.analytics;

import java.util.List;



public class Main {
	
	static List<String> monFichierSortie;
	static String fichierSymptomTexte = "C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/symptoms.txt";
	
	
	/**
	 * point d'entr�e du code
	 * @param args
	 * @throws Exception
	 */
	public static void main(String args[]) throws Exception {
		
		//J'instancie ma classe AnalyticsCounter
		AnalyticsCounter monFichierSymptom = new AnalyticsCounter();
		
		//Je joins le chemin de mon fichier symptom en utilisant ma m�thode ReadSymptomDataFromFile
		monFichierSymptom.readSymptomDataFromFile(fichierSymptomTexte);
		
		//Appel de la m�thode GetSymptom pour cr�er le fichier result.out
		monFichierSortie=monFichierSymptom.getSymptoms();
		
		System.out.println(monFichierSortie);
		System.out.println("Fichier g�n�r�");
		
		
	}
		

}
