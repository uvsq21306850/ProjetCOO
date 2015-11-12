package fr.uvsq.coo.ex3_4;



public class Manager extends Salarié {
	//ArrayList<Salarié> Team ;
	int Team ;
	
	/*public Manager ( ArrayList<Salarié> team){
		this.Team = team ;
		
		
	}*/
	
	
     /*
	@Override
	public double calcul_salaire() {
		double tmp =0 ;
		for (int j = 0 ; j < this.Team.size() ; j++) {
			tmp+=this.Team.get(j).calcul_salaire() ;
		}
		
		return tmp+1500+20/12;
	}
	*/
	public Manager (int team) {
		this.Team = team;
	}
	@Override
	public double calcul_salaire() {
		return 1500+20/12 +this.Team*100 ;
	}
	

}
