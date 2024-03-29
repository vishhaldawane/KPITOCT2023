
public class AssociationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Begin the association....");
		
		WashingMachine washingMachineObj = new WashingMachine();
		
		/*
		Cloth clothObj1 = new Cloth();
		Cloth clothObj2 = new Cloth();
	
		clothObj1.setBrand("Fahernheit");
		clothObj1.setClean(false);
		clothObj1.setColor("red+white+blue");
		clothObj1.setCost(1200);
		clothObj1.setSize("Large");
		clothObj1.setWeight(300.0f);
		clothObj1.setTypeOfCloth("Cotton");
	
		
		clothObj2.setBrand("Levis");
		clothObj2.setClean(false);
		clothObj2.setColor("blue");
		clothObj2.setCost(1800);
		clothObj2.setSize("38");
		clothObj2.setWeight(500.0f);
		clothObj2.setTypeOfCloth("Cotton");
	
		Cloth myCloths[] = new Cloth[2];
		
		myCloths[0] = clothObj1;
		myCloths[1] = clothObj2;
		*/
		
		/*Cloth myClothsToWash [] = new Cloth[5];
		
		myClothsToWash[0] = new Cloth("T-Shirt","Cotton","Red",500.0f,250.0f,"Fehernheit","Large",false);
		myClothsToWash[1] = new Cloth("Shirt","Linen","White",2500.0f,150.0f,"CottonKing","Large",false);
		myClothsToWash[2] = new Cloth("Jean","Cotton","Black",2500.0f,350.0f,"Levis","38",false);
		myClothsToWash[3] = new Cloth("Jean","Cotton","Blue",2500.0f,350.0f,"Levis","38",false);
		myClothsToWash[4] = new Cloth("T-Shirt","Cotton","Pink",1500.0f,250.0f,"Raymonds","Large",false);
		*/
		
		Cloth myClothsToWashObjAry[] = {
				new Cloth("T-Shirt","Cotton","Red",500.0f,250.0f,"Fehernheit","Large",false), //0
				new Cloth("Shirt","Linen","White",2500.0f,150.0f,"CottonKing","Large",false), //1
				new Cloth("Jean","Cotton","Black",2500.0f,350.0f,"Levis","38",false),		 //2
				new Cloth("Jean","Cotton","Blue",2500.0f,350.0f,"Levis","38",false),         //3
				new Cloth("T-Shirt","Cotton","Pink",1500.0f,250.0f,"Raymonds","Large",false),//4
				//new Cloth("Saree","Silk","Blue",12500.0f,150.0f,"Nallis","Regular",false) //5

		};
		
		Water waterObj = new Water(90,"SoftWater",20.2f);
		
		WashingPowder washingPowderObj = new WashingPowder("Front", "Wheel", 50.0f);
		
		
		
		washingMachineObj.wash(myClothsToWashObjAry,waterObj,washingPowderObj);
	}

}

class Machine
{
	
}
class WashingMachine extends Machine //isA
{
	private WashingTub washTubObj = new WashingTub(); //hasA

	void wash(Cloth clothsInLaundryRef[], Water waterObjRef, WashingPowder washingPowderObjRef) {
		System.out.println("Washing "+clothsInLaundryRef.length+" cloths in "+waterObjRef.getTypeOfWater()+ " of temperature "+waterObjRef.getTemperature()+" with washing powder of "+washingPowderObjRef.getBrand()+" brand");
		
		float totalLaundryBill =0;
		
		for (int i = 0; i < clothsInLaundryRef.length; i++) {
			Cloth cloth = clothsInLaundryRef[i];
			if(cloth.getStyle().equals("T-Shirt")) {
				totalLaundryBill = totalLaundryBill + 50;
			}
			else if(cloth.getStyle().equals("Shirt")) {
				totalLaundryBill = totalLaundryBill + 70;
			} 
			else if(cloth.getStyle().equals("Jean")) {
				totalLaundryBill = totalLaundryBill + 80;
			} 
			else if(cloth.getStyle().equals("Saree")) {
				totalLaundryBill = totalLaundryBill + 170;
			} 
		}
		
		System.out.println("Total bill : "+totalLaundryBill); 
		
	}
}



class WashingPowder
{
	String type; //front/top
	String brand;
	float quantity;
	public WashingPowder(String type, String brand, float quantity) {
		super();
		this.type = type;
		this.brand = brand;
		this.quantity = quantity;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	
}


class Water
{
	int quantity;
	String typeOfWater;
	float temperature;
	public Water(int quantity, String typeOfWater, float temperature) {
		super();
		this.quantity = quantity;
		this.typeOfWater = typeOfWater;
		this.temperature = temperature;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getTypeOfWater() {
		return typeOfWater;
	}
	public void setTypeOfWater(String typeOfWater) {
		this.typeOfWater = typeOfWater;
	}
	public float getTemperature() {
		return temperature;
	}
	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}
	
	
	
}

class Tub
{
	
}
class WashingTub extends Tub //isA
{
	
}

class Cloth
{
	String style;
	String typeOfCloth; // cotton, silk
	String color; //red green pink, mix
	float cost; //1500/2000
	float weight; //300gm 200gm
	String brand; //beneton, levis, arrow, vh
	String size; // M L XL XXL 
	boolean clean; // true mean its clean, flase mean its dirty
	
	
	
	public Cloth(String style, String typeOfCloth, String color, float cost, float weight, String brand, String size, boolean clean) {
		super();
		this.style = style;
		this.typeOfCloth = typeOfCloth;
		this.color = color;
		this.cost = cost;
		this.weight = weight;
		this.brand = brand;
		this.size = size;
		this.clean = clean;
	}
	
	
	public String getStyle() {
		return style;
	}


	public void setStyle(String style) {
		this.style = style;
	}


	public boolean isClean() {
		return clean;
	}
	public void setClean(boolean clean) {
		this.clean = clean;
	}
	public String getTypeOfCloth() {
		return typeOfCloth;
	}
	public void setTypeOfCloth(String typeOfCloth) {
		this.typeOfCloth = typeOfCloth;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	
	
}
