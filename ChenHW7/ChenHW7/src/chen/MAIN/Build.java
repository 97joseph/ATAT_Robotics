package chen.MAIN;

import java.util.ArrayList;

import chen.ENUMS.StormTrooper;
import chen.SUPPORT.Location;
import chen.SUPPORT.Position;
import chen.WALKERS.ATAT;

public class Build {

	public static void main(String[] args) {	
		
		ATAT x = new ATAT("Chen Imperial 1");
			Position hoth = new Position("Hoth", new Location(10,10,10));
			Position rebelBase = new Position("Rebel Base", new Location(15,20,10));
			
		x.setCurrentPosition(hoth);
		x.displayWalkerSpecs();
		x.moveToPosition(rebelBase);
		
		System.out.println();
		
		ArrayList<StormTrooper> st = new ArrayList<>();
			st.add(StormTrooper.Standard);
			st.add(StormTrooper.Assault);
			st.add(StormTrooper.Scout);
		x.embarkTroopers(st);
		
		System.out.println();
		x.displayWalkerSpecs();
		
		System.out.println();
		x.disembarkTroopers();
		x.rollCall();
		
			
		
	}
}
