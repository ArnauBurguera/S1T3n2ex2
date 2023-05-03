package s1t3n2ex2;

import java.util.Objects;

public class Restaurant{
	
	private String nom;
	private int puntuacio;

	public Restaurant(String nom, int puntuacio) {
		this.nom = nom;
		this.puntuacio = puntuacio;
	}

	public String getNom() {
		return this.nom;
	}

	public int getPuntuacio() {
		return this.puntuacio;
	}

	@Override
	public String toString() {
		return "Restaurant [nom=" + this.nom + ", puntuacio=" + this.puntuacio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, puntuacio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(nom, other.nom) && puntuacio == other.puntuacio;
	}
}
