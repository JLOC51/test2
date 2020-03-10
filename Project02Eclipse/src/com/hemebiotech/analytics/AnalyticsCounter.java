package com.hemebiotech.analytics;


import java.util.ArrayList;



import java.util.TreeMap;


/**
 * Classe du comptage du nombre d'occurence de symptoms qui implémente une
 * interface SymptomReader
 * 
 * @author JeanLuc
 *
 */

public class AnalyticsCounter implements ISymptomCounter {

	
	private int nbOccurence;
	private ArrayList<String> pMonFichierSortie;
	
	
	/**
	 * 
	 * @param pMonFichierSortie
	 */
	public AnalyticsCounter(ArrayList<String> pMonFichierSortie) {
		this.pMonFichierSortie=pMonFichierSortie;
	}


	/**
	 * Mets le nom du chemin du fichier symptom dans la variable filepath
	 * 
	 * @param filepath fichier à lire au sein de la méthode
	 */
	public TreeMap<String, Integer> countSymptom() {
		TreeMap<String, Integer> result = new TreeMap<>();
		
		
		for (int p = 0; p < pMonFichierSortie.size(); p++) {


			if (result.containsKey(pMonFichierSortie.get(p))){
				nbOccurence=result.get(pMonFichierSortie.get(p));
				result.put(pMonFichierSortie.get(p),(nbOccurence+1));
				
			}
			else {
				
				result.put(pMonFichierSortie.get(p),1);
			}
			
		}
			return result;
	}	
	
}