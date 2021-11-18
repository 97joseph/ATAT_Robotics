package chen.LegSupport;

import chen.ENUMS.Side;

public class LegComponent {

	private String type;
	private Side legSide;
	
	public LegComponent(String type, Side legSide) {
		this.type = type;
		this.legSide = legSide;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Side getLegSide() {
		return legSide;
	}

	public void setLegSide(Side legSide) {
		this.legSide = legSide;
	}
	
	
	
	
}
