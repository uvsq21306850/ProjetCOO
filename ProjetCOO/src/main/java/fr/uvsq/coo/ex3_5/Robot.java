package fr.uvsq.coo.ex3_5;

public class Robot extends Machine {
	
	private static Direction dir ;
	 private static  Position pos ;
	
	public Robot (Direction d ,Position p) {
		super (d,p ) ;
	}
	
	public   void avance () {
		if (dir.equals(Direction.NORD) ) pos.y ++ ;
		if (dir.equals(Direction.SUD)) pos.y -- ;
		if (dir.equals(Direction.EST)) pos.x ++ ;
		if (dir.equals(Direction.OUEST)) pos.x -- ;
		

	}
	public   void tourne () {
		if (dir.equals(Direction.NORD) ) dir = Direction.OUEST;
		if (dir.equals(Direction.SUD)) dir = Direction.EST;
		if (dir.equals(Direction.EST)) dir = Direction.NORD;
		if (dir.equals(Direction.OUEST)) dir = Direction.SUD;
		

		
	}
		

}
