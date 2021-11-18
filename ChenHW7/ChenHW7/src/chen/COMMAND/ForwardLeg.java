package chen.COMMAND;

import chen.ENUMS.Side;
import chen.LegSupport.FootPad;
import chen.LegSupport.LowerLeg;
import chen.LegSupport.UpperLeg;

public class ForwardLeg {
	
	private String type = "Forward Leg";
	private Side legSide;
	private UpperLeg uprleg;
	private LowerLeg lwrLeg;
	private FootPad pad;
	
	public ForwardLeg(String side) {
		
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

	public UpperLeg getUprleg() {
		return uprleg;
	}

	public void setUprleg(UpperLeg uprleg) {
		this.uprleg = uprleg;
	}

	public LowerLeg getLwrLeg() {
		return lwrLeg;
	}

	public void setLwrLeg(LowerLeg lwrLeg) {
		this.lwrLeg = lwrLeg;
	}

	public FootPad getPad() {
		return pad;
	}

	public void setPad(FootPad pad) {
		this.pad = pad;
	}
	
	

}
