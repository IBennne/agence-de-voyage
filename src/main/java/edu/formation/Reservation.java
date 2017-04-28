package edu.formation;

import java.sql.Date;

public class Reservation 
{
	// id date numero etat
	private int id;
	private int numero;
	private Date date;
	private EtatReservation etat;
	private Passager passager;
	
	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}

	//pour incrémenter une nouvelle reservation
	public static int nbReservation=0;
	
	//Instanciation de la classe Reservation sans oublier id pour incrémenter
	public Reservation(int numero, Date date)
	{
		this.id = ++nbReservation;
		this.numero = numero;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public EtatReservation getEtat() {
		return etat;
	}

	public void setEtat(EtatReservation etat) {
		this.etat = etat;
	}

	public static int getNbReservation() {
		return nbReservation;
	}

	public static void setNbReservation(int nbReservation) {
		Reservation.nbReservation = nbReservation;
	}
}