package patientprocessing;

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
File Name: PatientAccounts.java
*/

public class PatientAccounts {

	public static final int PATIENT_ACCOUNTS_ARRAY_SIZE = 50;
	
	private int numOfElements = 0;
	private Patient[] patientAccounts = null;
	
	/**
	 * Default constructor for the PatientAccounts class
	 */
	public PatientAccounts() {
		patientAccounts = new Patient[PATIENT_ACCOUNTS_ARRAY_SIZE];
	} // end of default constructor

	/**
	 * adds a patient account to the PatientAccounts array and increments 
	 * the numOfElements instance variable by 1
	 * @param patient = the patient to add
	 */
	public void addPatient(Patient patient) {
		patientAccounts[numOfElements++] = patient;
	} // end of addPatient method
	
	/**
	 * Overloaded method
	 * searches for, and returns, the Patient object associated with the parameter patientID in the 
	 * patientAccounts Array, or returns null if that patientID does not exist.
	 * @param patientID = the patientID of Patient object to get
	 * @return Patient = the Patient object or null if the Patient is not found
	 */
	public Patient searchPatient(int patientID) {
		for (int i = 0; i < numOfElements; i++) {
			if ((patientAccounts[i].getPatientID() == patientID)) {
				return patientAccounts[i];
			} else {
				continue;
			}
		}
		return null;
	} // end of searchPatient method
	
	/**
	 * Overloaded method
	 * searches for, and returns, the patient object associated with the patients name in the 
	 * patientAccounts Array, or returns null if that name does not exist.
	 * @param patientName = the patientName of patient object to get
	 * @return Patient = the Patient object or null if the Patient is not found
	 */
	public Patient searchPatient(String patientName) {
		for (int i = 0; i < numOfElements; i++) {
			if ((patientAccounts[i].getName().equalsIgnoreCase(patientName))) {
				return patientAccounts[i];
			} else {
				continue;
			}
		}
		return null;
	} // end of searchPatient method

} // end of PatientAccounts class
