package fr.uvsq.coo.ex3_4;
import java.util.ArrayList;


public class Entreprise {
	ArrayList<Salarié> equipe ;
	
	public Entreprise (	ArrayList<Salarié> e) {
		equipe = e ;
		
	}
	public double  calcul_salaire () {
		double resultat = 0 ;
		for (int i =0 ; i<this.equipe.size() ; i++) {
			resultat +=equipe.get(i).calcul_salaire() ;
		}
		
		
		
		return resultat;
	}

}
