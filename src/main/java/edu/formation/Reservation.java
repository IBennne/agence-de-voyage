package edu.formation;

import java.sql.Date;

public class Reservation 
{
	// id date numero etat
	private int id;
	private int numero;
	private Date date;
	private EtatReservation etat;
	
	//pour incr�menter une nouvelle reservation
	public static int nbReservation=0;
	
	//Instanciation de la classe Reservation sans oublier id pour incr�menter
	public Reservation(int numero, Date date)
	{
		this.id = ++nbReservation;
		this.numero = numero;
		this.date = date;
	}
}