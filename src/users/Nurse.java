package users;
import java.util.Calendar;

import medicationprocessing.Medication;
import medicationprocessing.MedicationList;
import patientprocessing.Patient;

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
File Name: Nurse.java
*/

public class Nurse extends User {
	
	/**
	 * Default constructor for the Nurse class
	 */
	public Nurse() {
		super();
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Nurse class
	 * @param name = The name of the Nurse
	 */
	public Nurse(String name) {
		super(name);
	} // end of parameterized constructor
	
	/**
	 * Allows the Nurse to log a dose of medication
	 * @param medicationName = The name of the medication to log
	 * @param patient = The patient to log the medication for
	 * @return currentTime = the time the dose was logged
	 */
	public Calendar logDose(String medicationName, Patient patient) {
		Medication medication =  MedicationList.getMedication(medicationName);
		Calendar currentTime = null; // fix this to get current time
		patient.logMostRecentDose(medication, currentTime);
		return currentTime;
	} // end of parameterized constructor
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Nurse [name = " + super.getName() + "]";
	}
}
