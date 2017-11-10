package medicationprocessing;

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
File Name: MedicationDatabaseManager.java
*/

public class MedicationDatabaseManager {

	private Scanner fileIn = null; // default empty
	private String fileName = "";
	
	/**
	 * Default constructor for the MedicationDatabaseManager class
	 */
	public MedicationDatabaseManager() {
		setFileName("");
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the MedicationDatabaseManager class
	 * @param name = The name of the medication database file
	 */
	public MedicationDatabaseManager(String name) {
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
	 * Medication objects stored in the file to populate the MedicationList) 
	 */
	public void processInput() {
		// finish code
	}
	
} // end of MedicationDatabaseManager class
