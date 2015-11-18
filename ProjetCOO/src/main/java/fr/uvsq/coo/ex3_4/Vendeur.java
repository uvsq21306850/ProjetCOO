package fr.uvsq.coo.ex3_4;

public class Vendeur extends Salarié {
	double commission ;
	int anciennete ;
	
	public Vendeur (int an ,double com) {
		anciennete = an ;
		commission  = com ;
		
	}

	@Override
	public double calcul_salaire() {
		
		return 1500 + 20*anciennete + commission ;
	}

}
