package patientprocessing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
This program:
HealthFirst allows doctors, nurses, and pharmacists to prescribe, review, distribute, 
and track patient medications simultaneously. This would reduce the confusion that might 
come from the use of paper records/logs, and reduce the risk of potential over/under 
dosage and conflicts with other medications.


@author Timothy McWatters
@author Keenal Shah
@author Chris Ault
@author Jimmy Le

@version 1.0

CEN3031    "HealthFirst" SE1-Afternoon Group 1's class project
File Name: PatientDatabaseManager.java
*/

public class PatientDatabaseManager {

	private Scanner fileIn = null; // default empty
	private String fileName = "";
	
	/**
	 * Default constructor for the PatientDatabaseManager class
	 */
	public PatientDatabaseManager() {
		setFileName("");
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the PatientDatabaseManager class
	 * @param name = The name of the patient database file
	 */
	public PatientDatabaseManager(String name) {
		setFileName(name);
	} // end of parameterized constructor

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	/**
	 * attempts to open the file to process, and throws an exception if it can't
	 */
	public void openFile() {
		try {
			// Attempt to open the file
			fileIn = new Scanner(new FileInputStream(getFileName()));
		}
		catch (FileNotFoundException e)
		{
			System.out.println("File not found");
			System.exit(0);
		}
	} // end of openFile method
	
	/**
	 * processes the file (reads in the file, processes in the information to create 
	 * Patient objects stored in the file to populate the Patient Accounts) 
	 */
	public void processInput() {
		// finish code
	}
	
} // end of PatientDatabaseManager class
