package edu.formation;

public class Adresse {
	
	private String adresse;
	private String codePostal;
	private String ville;
	private String pays;
	private Passager passager;
	
	
	
	public Adresse(String adresse, String codePostal, String ville, String pays) {
		
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}

	public Passager getPassager() {
		return passager;
	}

	public void setPassager(Passager passager) {
		this.passager = passager;
	}
	
	
}
