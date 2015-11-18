package fr.uvsq.coo.ex3_5;

public class Machine {
	protected Position pos ;
	protected Direction dir ;
	
	protected Machine (Direction d, Position p) {
		this.pos = p ;
		this.dir = d ;
	}

/*	public void avance () {
		if (this instanceof Robot) Robot.avance();
	}
*/
	
}
