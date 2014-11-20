package fr.treeptik.java8.runtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fr.treeptik.java8.Voiture;
import fr.treeptik.java8.comparator.VoitureMarqueComparator;

public class Runtime {

	public static void main(String[] args) {
		Voiture v1 = new Voiture(1, "AUDI", "A1");
		Voiture v2 = new Voiture(2, "AUDI", "A2");
		Voiture v3 = new Voiture(3, "AUDI", "A3");
		Voiture v4 = new Voiture(4, "MINI", "COOPER");
		Voiture v5 = new Voiture(5, "Peugeot", "308");
		List<Voiture> voitures = Arrays.asList(v1, v2, v3, v4, v5);
		Collections.sort(voitures, new VoitureMarqueComparator());

		for (Voiture voiture : voitures) {
			System.out.println(voiture);
		}
		Collections.sort(voitures, new Comparator<Voiture>() {

			@Override
			public int compare(Voiture v1, Voiture v2) {
				return v1.getMarque().compareToIgnoreCase(v2.getMarque());
				
			}
		});
		for (Voiture voiture : voitures) {
			System.out.println(voiture);
		}
	}

}
