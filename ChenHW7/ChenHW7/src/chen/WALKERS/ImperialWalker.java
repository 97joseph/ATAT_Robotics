package chen.WALKERS;

import java.util.Map;

import chen.SUPPORT.Position;
import chen.COMMAND.Command;
import chen.COMMAND.ForwardLeg;
import chen.COMMAND.RearLeg;
import chen.COMMAND.Transport;
import chen.ImperialWalker.Combatable;
import chen.ImperialWalker.Moveable;
import chen.ImperialWalker.Transportable;

public abstract class ImperialWalker implements Moveable,Transportable,Combatable {
	private String type;
	protected String iDNumber;
	private int height;
	private int weight;
	private int length;
	private int mass;
	private int TroopCapacity;
	
	protected Position currentPosition;
	protected Command cmdModule;
	private Transport cargoModule;
	private  Map<String, RearLeg> aftLeg;
	private  Map<String, ForwardLeg> fwdLeg;

	
	public ImperialWalker(String type, String iDNumber) {
		super();
		this.type = type;
		this.iDNumber = iDNumber;	
	
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getiDNumber() {
		return iDNumber;
	}

	public void setiDNumber(String iDNumber) {
		this.iDNumber = iDNumber;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	public int getTroopCapacity() {
		return TroopCapacity;
	}

	public void setTroopCapacity(int troopCapacity) {
		TroopCapacity = troopCapacity;
	}

	public Position getCurrentPosition() {
		return currentPosition;
	}

	public void setCurrentPosition(Position currentPosition) {
		this.currentPosition = currentPosition;
	}

	public Command getCmdModule() {
		return cmdModule;
	}

	public void setCmdModule(Command cmdModule) {
		this.cmdModule = cmdModule;
	}

	public Transport getCargoModule() {
		return cargoModule;
	}

	public void setCargoModule(Transport cargoModule) {
		this.cargoModule = cargoModule;
	}
	
	public void displayWalkerSpecs() {
		
	}

	public Map<String, RearLeg> getAftLeg() {
		return aftLeg;
	}

	public void setAftLeg(Map<String, RearLeg> aftLeg) {
		this.aftLeg = aftLeg;
	}

	public Map<String, ForwardLeg> getFwdLeg() {
		return fwdLeg;
	}

	public void setFwdLeg(Map<String, ForwardLeg> fwdLeg) {
		this.fwdLeg = fwdLeg;
	}
	
	
	
}
