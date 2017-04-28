/**
 * 
 */
package edu.formation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author ajc
 *
 */
public class MainAgence {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
			
	}
	public static void lecture()
	{
		File f=new File("passagers.csv");
		//Je demande au programme de lire le fichier f
		FileReader fr=new FileReader(f);
		//placer tamporaorement dans un buffer
		BufferedReader br=new BufferedReader(fr);
		//instanciation de variables
		String op;double totalVersements=0;double totalRetraits=0;
		
		//creation d'une boucle tant que
		while((op=br.readLine())!=null)
		{
			/*split=separer dissocier les chaines de caractere en fonction des ";" 
			 * et chaque element va former une chaine de caractere dans un tableau
			 */
			String[] tabOp=op.split(";");
			//chercher la chaine de caractere au rang 3, la valeur
			String typeOp=tabOp[3];
			//chercher le montant de l'operation au rang 4
			double montant=Double.parseDouble(tabOp[4]);
			//si type operation = v
			if(typeOp.equals("V"))
				//cest une versement, ecrire le montant
				totalVersements+=montant;
			else
				//sinon cest un retrait
				totalRetraits+=montant;
		
		System.out.println("Total Versement:"+totalVersements);
		System.out.println("Total Retrait:"+totalRetraits);
		}
	}
	
}
