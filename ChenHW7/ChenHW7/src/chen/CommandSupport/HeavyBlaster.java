package chen.CommandSupport;

public class HeavyBlaster {
	
	private int maxRange;
	private int minRange;
	private int ammoCapacity;
	private static int currentAmmo;

	public HeavyBlaster() {
		
	}

	public int getMaxRange() {
		return maxRange;
	}

	public void setMaxRange(int maxRange) {
		this.maxRange = maxRange;
	}

	public int getMinRange() {
		return minRange;
	}

	public void setMinRange(int minRange) {
		this.minRange = minRange;
	}

	public int getAmmoCapacity() {
		return ammoCapacity;
	}

	public void setAmmoCapacity(int ammoCapacity) {
		this.ammoCapacity = ammoCapacity;
	}

	
	public boolean fire() {
		if (currentAmmo > 1) {
			System.out.println("Firing Heavy Cannon");
			currentAmmo -= 1;
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
