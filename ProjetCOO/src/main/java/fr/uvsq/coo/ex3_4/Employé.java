package fr.uvsq.coo.ex3_4;

public class Employé extends Salarié {
	int anciennete ;

	public Employé (int an) {
		this.anciennete = an ;
		
		
	}

	@Override
	public double calcul_salaire() {

		return 1500 + 20*this.anciennete ;
	}

}
