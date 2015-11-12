package fr.uvsq.coo.ex3_4;

public class Vendeur extends Salarié {
	double commission ;
	
	public Vendeur (double com) {
		this.salaire = 1500 + 20/12  ; 
		commission  = com ;
		
	}

	@Override
	public double calcul_salaire() {
		
		return 1500 + 20/12 + commission ;
	}

}
