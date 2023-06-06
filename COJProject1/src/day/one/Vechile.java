package day.one;

public class Vechile {
	String type;
	String model;
	int manufactuerDate;
	double milege;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getManufactuerDate() {
		return manufactuerDate;
	}
	public void setManufactuerDate(int manufactuerDate) {
		this.manufactuerDate = manufactuerDate;
	}
	public double getMilege() {
		return milege;
	}
	public void setMilege(double milege) {
		this.milege = milege;
	}
	public static void main(String[]args) {
		Vechile V=new Vechile();
		V.type="hatchback";
		V.manufactuerDate=2012;
		V.milege=90000.25;
		V.model="Toyota prius";
		System.out.println("car type= "+V.type);
		System.out.println("car manufactureyear= "+V.manufactuerDate);
		System.out.println("car milege= "+V.milege);
		System.out.println("car model= "+V.model);
	}
}
