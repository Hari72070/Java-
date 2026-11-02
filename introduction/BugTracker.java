package com.java.introduction;

import java.util.Scanner;

public class BugTracker {

	int bugId;
	String applicationName;
	String bugTitle;
	String severity;
	String priority;
	String status;
	String assignedDeveloper;

	void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bugId");
		bugId = sc.nextInt();
		System.out.println("Enter application name");
		applicationName = sc.next();
		System.out.println("Enter bug title");
		bugTitle = sc.next();
		System.out.println("Enter bug severity");
		severity = sc.next();
		System.out.println("Enter priority");
		priority = sc.next();
		System.out.println("Enter bug Status");
		status = sc.next();
		System.out.println("Enter Assigned Developer");
		assignedDeveloper = sc.next();
		System.out.println("Bug Id is : " + bugId + "\n" 
		        + "Application Name is : " + applicationName);
	}

	void bugId(int bugId) {
		System.out.println("Bug id id : " + bugId);
	}

	void applicationName(String applicationName) {
		System.out.println("Application name is : " + applicationName);
	}

	void bugTitle(String bugTitle) {
		System.out.println("Bug title is : " + bugTitle);
	}

	void bugSeverity(String severity) {
		System.out.println("Bug severity is : " + severity);
	}

	void priority(String priority) {
		System.out.println("Bug priority is : " + priority);
	}

	void status(String status) {
		System.out.println("The Bug status is : " + status);
	}

	void assignedDeveloper(String assignedDeveloper) {
		System.out.println("The Assigned Developer is  :" + " " + assignedDeveloper);
	}

}
//1. Create a Java class BugTracker to maintain bug details.
//Variables:
// > bugId, applicationName, bugTitle, severity,
//priority, status, assignedDeveloper
//Requirements:
// > Create an object in main() and initialize all values using the object reference.
// > Create getters for all variables.
//assignToDeveloper(int bugId, String developerName) → Assign developer and change status to "In Development".
// > updateStatus(String newStatus) → Update the bug status.
//displayBugSummary() → Display all bug details using getter methods.
