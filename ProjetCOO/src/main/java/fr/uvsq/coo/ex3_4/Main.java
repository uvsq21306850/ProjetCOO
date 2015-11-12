package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employé e1 = new Employé () ;
		//Employé e2 = new Employé () ;
		Vendeur v1 = new Vendeur (60) ;
		//Vendeur v2 = new Vendeur (100) ;
		//Vendeur v3 = new Vendeur (150) ;
			Manager m1 = new Manager (1);
		ArrayList <Salarié> equipe  = new ArrayList <Salarié>() ;
		equipe.add(e1) ;
		equipe.add(v1) ;
		equipe.add(m1) ;
		
		Entreprise ent = new Entreprise (equipe) ;
		System.out.println (ent.calcul_salaire()) ;





	}

}
