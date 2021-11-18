package chen.SUPPORT;

public class Location {
	private int x;
	private int y; 
	private int z;
	
	public Location(int x, int y, int z) {
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	
	public double getEuclidean(Location L) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2) );
		return distance;
	}
	
	public String toString() {
		return toString();
	}
}
