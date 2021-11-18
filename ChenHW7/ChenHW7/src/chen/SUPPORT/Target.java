package chen.SUPPORT;

public class Target {
	
	private String tgt;
	private boolean isAlive;
	private Position pos;

	public Target(String tgt) {
		this.tgt = tgt;
	}

	public String getTgt() {
		return tgt;
	}

	public void setTgt(String tgt) {
		this.tgt = tgt;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public Position getPos() {
		return pos;
	}

	public void setPos(Position pos) {
		this.pos = pos;
	}

	@Override
	public String toString() {
		return "Target [tgt=" + tgt 
				+ ", isAlive=" + isAlive 
				+ ", pos=" + pos + "]";
	}
	
	
	

}
