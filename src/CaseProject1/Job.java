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
	
	//Default/Empty constructor
	public Job() {
		
	}
	
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

	public int getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(int jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public float getJobTimeEstimate() {
		return jobTimeEstimate;
	}

	public void setJobTimeEstimate(float jobTimeEstimate) {
		this.jobTimeEstimate = jobTimeEstimate;
	}

	public float getJobTotalTime() {
		return jobTotalTime;
	}

	public void setJobTotalTime(float jobTotalTime) {
		this.jobTotalTime = jobTotalTime;
	}

	public Date getJobStartDate() {
		return jobStartDate;
	}

	public void setJobStartDate(Date jobStartDate) {
		this.jobStartDate = jobStartDate;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public static int getCounter() {
		return counter;
	}

	public static void setCounter(int counter) {
		Job.counter = counter;
	}

	public ArrayList<Material> getMaterialsList() {
		return materialsList;
	}

	public void setMaterialsList(ArrayList<Material> materialsList) {
		this.materialsList = materialsList;
	}
}