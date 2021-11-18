package chen.WALKERS;

import java.util.ArrayList;

import chen.SUPPORT.Position;
import chen.COMMAND.Transport;
import chen.CommandSupport.WeaponPlatform;
import chen.ENUMS.StormTrooper;

public class ATAT extends ImperialWalker{
	
	private String ATATBattleCode = "Heavy_AT";
	
	public ATAT(String iDNumber) {
		super(iDNumber, iDNumber);
		// TODO Auto-generated constructor stub
	}

	public String getATATBattleCode() {
		return ATATBattleCode;
	}

	public void setATATBattleCode(String aTATBattleCode) {
		ATATBattleCode = aTATBattleCode;
	}
	
	
	// methods
	public void moveToPosition(Position Position_P) {
		currentPosition = Position_P;
	}
	
	public void embarkTroopers(ArrayList<StormTrooper> S) {
		Transport.troops.addAll(S);
		System.out.println(Transport.troops.size() + "StormTroopers onboard");
		
	}
	
	public void disembarkTroopers() {
		Transport.troops.clear();
		System.out.println("All Stormtroopers off loaded");
		
	}
	
	public void rollCall() {
		System.out.println(Transport.troops.size() + "StormTroopers currently aboard");

	}
	
	public void fireLaserCannons(String Target_T) {
		WeaponPlatform wpn = new WeaponPlatform(Target_T);
		wpn.fireCannon(Target_T);
	}
	
	public void fireHeavyBlasters(String Target_T) {
		WeaponPlatform wpn = new WeaponPlatform(Target_T);
		wpn.fireBlaster(Target_T);

	}
	
	public void assaultPositions(String Position_P) {
		moveToPosition(Position_P);
	
		//this below doesnt work 
		Position pos = new Position(ATATBattleCode, );
	
		System.out.print("Assaulting ");
		System.out.print(pos.displayPosition());
	}

	
	
	@Override
	public void embarkTroopers() {
		// TODO Auto-generated method stub
	}

	@Override
	public void assaultPosition(String Position_P) {
		// TODO Auto-generated method stub
	}

	@Override
	public void moveToPosition(String Position_P) {
		// TODO Auto-generated method stub
		
	}
}
