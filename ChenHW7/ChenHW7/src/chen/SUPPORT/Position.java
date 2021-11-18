package chen.SUPPORT;

public class Position {
	
	private String name;
	private Location pos;
	
	public Position(String name, Location pos) {
		this.name = name;
		this.pos = pos;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Location getPos() {
		return pos;
	}

	public void setPos(Location pos) {
		this.pos = pos;
	}
	
	public double distanceToPosition() {
		return pos.getEuclidean(pos);
		 
	}
	
	public void displayPosition() {
		
	}
	
	

}
