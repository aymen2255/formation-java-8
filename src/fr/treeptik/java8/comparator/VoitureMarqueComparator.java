package fr.treeptik.java8.comparator;

import java.util.Comparator;

import fr.treeptik.java8.Voiture;

public class VoitureMarqueComparator implements Comparator<Voiture>{

	@Override
	public int compare(Voiture v1, Voiture v2) {
		
		return v1.getMarque().compareToIgnoreCase(v2.getMarque());
		
	}

}
