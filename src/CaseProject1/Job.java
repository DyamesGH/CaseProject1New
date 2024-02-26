package CaseProject1;

import java.util.ArrayList;
import java.util.Date;

public class Job {

	private int jobNumber;
	private String jobDescription;
	private float jobTimeEstimate;
	private float jobTotalTime;
	private Date jobStartDate;
	private String customerName;
	private static int counter = 1024;
	private ArrayList<Material> materialsList = new ArrayList<Material>();
	
	
	
	
	public Job(String jobDescription, float jobTimeEstimate, float jobTotalTime, Date jobStartDate, String customerName){
		
		this.jobNumber = counter++;
		this.jobDescription = jobDescription;
		this.jobTimeEstimate = jobTimeEstimate;
		this.jobTotalTime = jobTotalTime;
		this.customerName = customerName;
		
	}
	
	public void addMaterial(String name, int quantity, float cost) {
		materialsList.add(new Material(name, quantity, cost));
	}
	
	public void viewMaterials() {
		for (Material i : materialsList) {
			System.out.println(i);
		}
	}
}