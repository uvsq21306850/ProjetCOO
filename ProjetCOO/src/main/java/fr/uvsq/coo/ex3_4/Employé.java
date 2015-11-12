package fr.uvsq.coo.ex3_4;

public class Employé extends Salarié {

	public Employé () {
		
		this.salaire = 1500 + 20/12  ;
	}

	@Override
	public double calcul_salaire() {

		return 1500 + 20/12  ;
	}

}
