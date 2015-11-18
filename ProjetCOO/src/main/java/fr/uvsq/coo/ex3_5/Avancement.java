package fr.uvsq.coo.ex3_5;

import java.util.ArrayList;

public class Avancement {
	ArrayList <Machine> ensemble ;
	public Avancement (ArrayList <Machine> ens) {
		this.ensemble = ens ;
		
		
	}
	
	void avancerTout () {
		for (int i =0 ;i<ensemble.size() ; i++) {
			 if (ensemble.get(i) instanceof Robot ) 
			((Robot)ensemble.get(i)).avance() ;
		}
		
		
		
	}

}
