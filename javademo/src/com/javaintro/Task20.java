package com.javaintro;

public class Task20 {
	
	int bugId;
	String applicationName;
	String bugtitle;
	String severity;
	String priority;
	String status;
	String assinedDeveloper;
	
	//getters Methode
	
	int getBugid() {
		return bugId;
	}
	
	String getApplicationName() {
		return applicationName;
	}
	
	String getBugTitle() {
		return bugtitle;
	}
	String getseverity() {
		return severity;
	}
	
	String getPriority() {
		
		return priority;
	}
	
	String getstatus() {
		return status;
	}
	
	String getAssignedDeveloper() {
		return assinedDeveloper;
	}
	
	// Assign Developer
	
	void assignToDeveloper(int bugid, String developerName) {
		this.bugId = bugId;
		this.assinedDeveloper = developerName;
		updateStatus("In Development");
	}
	void updateStatus (String newstatus) {
		status = newstatus;
	}
	
	void displayBugSummary() {
		System.out.println("BugId :"+ bugId);
		System.out.println("ApplicationName :" + applicationName);
		System.out.println("Bugtitle :" + bugtitle);
		System.out.println("severity :" + severity);
		System.out.println("Priority :" + priority);
		System.out.println("Status :" + status);
		System.out.println("AssinedDeveloper :" + assinedDeveloper);
		System.out.println("----------------------------------------");
	}
	
	public static void main(String[] args) {
		Task20 a = new Task20();
		a.bugId = 30;
		a.applicationName = "Banking Apliation";
		a.bugtitle = "Login button is not working";
		a.severity = "High";
		a.priority = "Critical";
		a.status = "Open";
		a.assinedDeveloper = "Not Assigned";
		System.out.println("------------------Intial bug Details------------------------");
		a.displayBugSummary();
		a.assignToDeveloper(102, "Narasimha");
		System.out.println("-------------------Updated bug details--------------------------");
		a.displayBugSummary();		
	}

}
