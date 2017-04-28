/**
 * 
 */
package edu.formation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import sun.launcher.resources.launcher;

/**
 * @author ajc
 *
 */
public class MainAgence {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		lectureAdresse();
	}

	// public static void lecturePassager() throws NumberFormatException,
	// IOException {
	// File fp = new File("passagers.csv");
	// // Je demande au programme de lire le fichier f
	// FileReader fr = new FileReader(fp);
	// // placer tamporaorement dans un buffer
	// BufferedReader br = new BufferedReader(fr);
	// // instanciation de variables
	// String op;
	//
	// // creation d'une boucle tant que le tableau n'est pas terminé
	// while ((op = br.readLine()) != null) {
	// /*
	// * split=separer dissocier les chaines de caractere en fonction des
	// * ";" et chaque element va former une chaine de caractere dans un
	// * tableau
	// */
	// List<Passager> listePassagers;
	// listePassagers = new ArrayList<Passager>();
	//
	// String[] tabOp = op.split(";");
	// passager.add(tabOp[1], tabOp[2]);
	// // chercher la chaine de caractere au rang 3, la valeur
	// String typeOp = tabOp[3];
	// // chercher le montant de l'operation au rang 4
	// double montant = Double.parseDouble(tabOp[4]);
	//
	// System.out.println("Total Versement:" + totalVersements);
	// System.out.println("Total Retrait:" + totalRetraits);
	// }
	// }

	public static void lectureAdresse() throws Exception {
		File fa = new File("adresses.csv");
		// Je demande au programme de lire le fichier f
		FileReader fr = new FileReader(fa);
		// placer tamporaorement dans un buffer
		BufferedReader br = new BufferedReader(fr);
		// instanciation de variables
		String op;

		// creation d'une boucle tant que le tableau n'est pas terminé
		while ((op = br.readLine()) != null) {
			/*
			 * split=separer dissocier les chaines de caractere en fonction des
			 * ";" et chaque element va former une chaine de caractere dans un
			 * tableau
			 */
			List<Adresse> listeAdresse;
			listeAdresse = new ArrayList<Adresse>();

			String[] tabOp = op.split(";");

			listeAdresse.add(new Adresse(tabOp[1], tabOp[2], tabOp[3], tabOp[4], Integer.parseInt(tabOp[0])));

		}

	}

}
