package CaseProject1;

import java.util.Date;

public class Material {
	
	
	private String name;
	private int quantity;
	private float cost;
	private float totalCost;
	
	public Material(String name, int quantity, float cost){
		this.name = name;
		this.quantity = quantity;
		this.cost = cost;
		this.totalCost = cost*quantity;
	}
	
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public float getTotalCost() {
		return totalCost;
	}

	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	
	

	

	
	
}