package fr.uvsq.coo.ex3_4;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Employé e1 = new Employé (3) ;
		//Employé e2 = new Employé (6) ;
		Vendeur v1 = new Vendeur (5,60) ;
		//Vendeur v2 = new Vendeur (1,100) ;
		//Vendeur v3 = new Vendeur (9,350) ;
			Manager m1 = new Manager (4);
		ArrayList <Salarié> equipe  = new ArrayList <Salarié>() ;
		equipe.add(e1) ;
		equipe.add(v1) ;
		equipe.add(m1) ;
		
		Entreprise ent = new Entreprise (equipe) ;
		System.out.println (ent.calcul_salaire()) ;





	}

}
