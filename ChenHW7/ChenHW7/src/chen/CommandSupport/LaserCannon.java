package chen.CommandSupport;

public class LaserCannon {
	
	private int MaxRange;
	private int ammoCapacity;
	private int currentAmmo;
	
	public LaserCannon() {
		
	}

	public int getMaxRange() {
		return MaxRange;
	}

	public void setMaxRange(int maxRange) {
		MaxRange = maxRange;
	}

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	public int getCurrentAmmo() {
		return currentAmmo;
	}

	public void setCurrentAmmo(int currentAmmo) {
		this.currentAmmo = currentAmmo;
	}
	
	public boolean fire() {
		if (currentAmmo > 1) {
			System.out.println("Firing Laser Cannon");
			currentAmmo -= 1;
			return true;
		}
		else {
			System.out.println("Ammunition Expended");
			return false;
		}
	}
	
	public boolean rapidFire() {
		if (currentAmmo > 3) {
			System.out.println("Firing Laser Cannon");
			currentAmmo -= 3;
			return true;
		}
		else {
			System.out.println("Ammunition Expended");
			return false;
		}
	}
	
	public boolean reload() {
		currentAmmo = ammoCapacity;
		return true;
		
	}
		

	
	
}

