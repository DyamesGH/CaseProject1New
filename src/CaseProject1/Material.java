package CaseProject1;

import java.util.Date;

public class Material {
	
	
	private String name;
	private int quantity;
	private boolean isAvailable;
	private Date orderDate; 
	
	
	
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
	
	
	public Material(String name, int quantity){
		this.name = name;
		this.quantity = quantity;
	}
	

	public boolean checkAvailability() {
		if(isAvailable == true) {
			return true;
		} else {
			return false;
		}
	}
	
	
}