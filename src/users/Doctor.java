package users;
import medicationprocessing.Medication;
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
File Name: Doctor.java
*/

public class Doctor extends User {

	/**
	 * Default constructor for the Doctor class
	 */
	public Doctor() {
		super();
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Doctor class
	 * @param name = The name of the Doctor
	 */
	public Doctor(String name) {
		super(name);
	} // end of parameterized constructor
	
	/**
	 * Adds a new prescription to a patient
	 * @param medicationName = The name of the medication the Doctor is prescribing
	 */
	public void prescribeMedication(String medicationName, Patient patient) {
		Medication newPrescription =  MedicationList.getMedication(medicationName);
		patient.addPrescription(newPrescription);
	} // end of prescribeMedication method

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Doctor [name = " + super.getName() + "]";
	}
	
} // end of Doctor class
