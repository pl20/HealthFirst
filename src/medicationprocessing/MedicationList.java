package medicationprocessing;

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
File Name: MedicationList.java
*/

public class MedicationList {

	public static final int MEDICATION_LIST_ARRAY_SIZE = 50;
	
	private int numOfElements = 0;
	static Medication[] medications = null;
	
	/**
	 * Default constructor for the MedicationList class
	 */
	public MedicationList() {
		medications = new Medication[MEDICATION_LIST_ARRAY_SIZE];
	} // end of default constructor

	/**
	 * searches for, and returns, the Medication object associated with the parameter medicationName in the 
	 * medications Array, or returns null if that medicationName does not exist.
	 * @param medicationName = the medication name of medication object to get
	 * @return Medication = the Medication object or null if the account is not found
	 */
	public Medication getMedication(String medicationName) {
		// fix code
		return null;
	} // end of getMedication method
	
	/**
	 * adds a Medication to the medication list medications array and increments the numOfElements instance variable by 1
	 * @param medication = a Medication to add
	 */
	public void addMedication(Medication medication) {
		medications[numOfElements++] = medication;
	} // end of addMedication method

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String completeString = "";
			for (int l = 0; l < this.numOfElements; l++) {
				completeString += medications[l].toString() + "\n";
			} 
			return completeString;
	}
	
} // end of MedicationList class
