package chen.COMMAND;

import java.util.ArrayList;

import chen.ENUMS.AccessRamps;
import chen.ENUMS.StormTrooper;

public class Transport {
	
	private String type = "Transport";
	private AccessRamps ramp;
	public static ArrayList<StormTrooper> troops;
	
	public Transport(String walker) {
		
	}

	public ArrayList<StormTrooper> getTroops() {
		return troops;
	}

	public void setTroops(ArrayList<StormTrooper> troops) {
		Transport.troops = troops;
	}

	public AccessRamps getRamp() {
		return ramp;
	}

	public void setRamp(AccessRamps ramp) {
		this.ramp = ramp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	

}
