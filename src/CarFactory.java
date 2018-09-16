
public abstract class CarFactory {
	private String name;
	private int ModelYear;
	private int maxSpeed;
	private String Color;
	public CarFactory(String color) {
		setColor(color);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getModelYear() {
		return ModelYear;
	}

	public void setModelYear(int modelYear) {
		ModelYear = modelYear;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public void drive() {
		System.out.println(
				getColor() + " " + getName() + " start driving and will get to speed " + getMaxSpeed() + "Km/h ");
	}

}
