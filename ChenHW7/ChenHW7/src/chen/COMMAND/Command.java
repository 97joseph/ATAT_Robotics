package chen.COMMAND;

import chen.CommandSupport.WeaponPlatform;
import chen.ENUMS.Crewman;

public class Command {
	private String type = "Command";
	private WeaponPlatform LeftWpns;
	private WeaponPlatform RightWpns;
	private Crewman driver;
	private Crewman cmdr;
	private Crewman gunner;
	
	public Command(String walkerType) {
		
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public WeaponPlatform getLeftWpns() {
		return LeftWpns;
	}

	public void setLeftWpns(WeaponPlatform leftWpns) {
		LeftWpns = leftWpns;
	}

	public WeaponPlatform getRightWpns() {
		return RightWpns;
	}

	public void setRightWpns(WeaponPlatform rightWpns) {
		RightWpns = rightWpns;
	}

	public Crewman getDriver() {
		return driver;
	}

	public void setDriver(Crewman driver) {
		this.driver = driver;
	}

	public Crewman getCmdr() {
		return cmdr;
	}

	public void setCmdr(Crewman cmdr) {
		this.cmdr = cmdr;
	}

	public Crewman getGunner() {
		return gunner;
	}

	public void setGunner(Crewman gunner) {
		this.gunner = gunner;
	}
		
	
	

}
