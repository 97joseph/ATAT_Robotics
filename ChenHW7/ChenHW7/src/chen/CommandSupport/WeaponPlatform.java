package chen.CommandSupport;

import chen.SUPPORT.*;
import chen.WALKERS.*;

public class WeaponPlatform {
	private String type;
	private LaserCannon laser;
	private HeavyBlaster blaster;

	
	public WeaponPlatform(String type) {
		this.type = type;
	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LaserCannon getLaser() {
		return laser;
	}

	public void setLaser(LaserCannon laser) {
		this.laser = laser;
	}

	public HeavyBlaster getBlaster() {
		return blaster;
	}

	public void setBlaster(HeavyBlaster blaster) {
		this.blaster = blaster;
	}
	
	
	
	public void fireCannon(String Target_T) {
		laser.fire();
	}
	

	//this below also doesnt work
	public void fireBlaster(String Target_T) {
		
		if (Position.distanceToPosition()< blaster.getMaxRange()
				& Position.distanceToPosition() > blaster.getMinRange()) {
			blaster.fire();
		}
		
	}

}
