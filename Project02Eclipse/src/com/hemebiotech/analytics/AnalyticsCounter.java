package com.hemebiotech.analytics;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import java.util.Set;
import java.util.HashSet;
import java.util.Collections;


/**
 * Classe du comptage du nombre d'occurence de symptoms qui implémente une interface SymptomReader
 * @author JeanLuc
 *
 */

public class AnalyticsCounter implements ISymptomReader {
	
	private String filepath;
	private int nbOccurence;
	private String s =  System.getProperty("line.separator");
	
	
	

	/**
	 * Mets le nom du chemin du fichier symptom dans la variable filepath
	 * @param filepath  fichier à lire au sein de la méthode
	 */
	public void ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
		
	
	/**
	 * Créer le fichier result.out
	 * @return retourne une liste dédoublonné des symptoms
	 * @throws IOException
	 */
	public List<String> GetSymptoms () throws IOException {
		ArrayList<String> result = new ArrayList<String>();
				
				//lecture du fichier symptom pour le mettre dans une arraylist 
				if (filepath != null) {
					try {
						BufferedReader reader = new BufferedReader (new FileReader(filepath));
						String line = reader.readLine();
						
						while (line != null) {
							result.add(line);
							line = reader.readLine();
						}
						reader.close();
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
				
			
				
				//Je dédoublonne Mes symptom
				 Set<String> mySet =new HashSet<String>(result);
				
				 // Créer une Nouvelle ArrayList à partir de Set
				 List<String> result2 = new ArrayList<String>(mySet);
				
				//Je trie ma liste				
				 Collections.sort(result2);
				 
				 		 
				//Création du fichier de sortie result.out
				 FileWriter writer = new FileWriter ("C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/result.out");
				 
				//Je compte le nombre d'occurrence et je l'écris dans le fichier de sortie result.out
				 for(int p=0;p<result2.size();p++) {
					 nbOccurence=0;
						
						for(int j=0;j<result.size();j++) {
							if(result.get(j).equals(result2.get(p))) {
								
								nbOccurence++;
							
						}	
							
											
						}
												
						System.out.println(result2.get(p) + " : " + nbOccurence);
						writer.write(result2.get(p)+ " : " + nbOccurence + s);

					}
				 
				 writer.close();
				 
				 return result2;
				 
							 
				
			}



	



	

	

		
	}

	
	
	
	
	
