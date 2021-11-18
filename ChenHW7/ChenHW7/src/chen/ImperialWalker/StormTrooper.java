package chen.ENUMS;

public enum StormTrooper
	{Standard("Standard", 76, 215, 25), Scout("Scout", 72, 185, 28), Assault("Assault", 74, 230, 26);

	StormTrooper(String type, int height, int weight, int age) {
		// TODO Auto-generated constructor stub
	}
	
	private String type;
	private int height;
	private int weight;
	private int age;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	}












