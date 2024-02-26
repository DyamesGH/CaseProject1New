package CaseProject1;

import java.util.ArrayList;
import java.util.Date;

public class Job {

	private int jobNumber;
	private String jobDescription;
	private int jobTimeEstimate;
	private Date jobScheduleStart;
	private Date jobScheduleFinish;
	private String customerName;
	private static int counter = 1024;
	private ArrayList<Material> materialsList = new ArrayList<Material>();
	
	
	
	
	public Job(String jobDescription, Date jobScheduleStart, Date jobScheduleFinish, String customerName){
		
		this.jobNumber = counter++;
		this.jobDescription = jobDescription;
		this.jobScheduleStart = jobScheduleStart;
		this.jobScheduleFinish = jobScheduleFinish;
		this.customerName = customerName;
		
	}
	
	public void estimateTime(Date jobScheduleStart, Date jobScheduleFinish) {
	
		

	}
	
	public void addMaterial(String newMaterial, int quantity) {
			
		materialsList.add(new Material(newMaterial, quantity));
		
	}
	
	public void viewMaterials() {
		for (Material i : materialsList) {
			System.out.println(i);
		}
	}
}