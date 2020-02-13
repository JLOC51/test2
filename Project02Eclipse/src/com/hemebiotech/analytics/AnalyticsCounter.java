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

public class AnalyticsCounter implements ISymptomReader {
	
	private String filepath;
	private int nbOccurence;
	private String s =  System.getProperty("line.separator");
	
	public void ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	
	//public List<String> GetSymptoms () {
	public List<String> GetSymptoms () throws IOException {
		ArrayList<String> result = new ArrayList<String>();
				
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
				 
				 		 
				 /////////////
				 FileWriter writer = new FileWriter ("C:/Users/JeanLuc/eclipse-workspace/MonPremierProjetJava/src/result.out");
				 
				 for(int p=0;p<result2.size();p++) {
					 nbOccurence=0;
						
						for(int j=0;j<result.size();j++) {
							if(result.get(j).equals(result.get(p))) {
								
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

	
	
	
	
	
