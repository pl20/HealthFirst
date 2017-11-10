package users;
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
File Name: Pharmacist.java
*/

public class Pharmacist extends User {

	/**
	 * Default constructor for the Pharmacist class
	 */
	public Pharmacist() {
		super();
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Pharmacist class
	 * @param name = The name of the Pharmacist
	 */
	public Pharmacist(String name) {
		super(name);
	} // end of parameterized constructor
	
	/**
	 * Allows for a prescription to be verified before being filled
	 * @param name = The name of the medication being verified
	 * @param patientName = the name of the patient the prescription is being filled for
	 * @ boolean = true if the medication has been verified and false otherwise
	 */
	public boolean verifyMedicaton(String medicationName, Patient patientName) {
		// insert code
		return false;
	} // end of verifyMedicaton class
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Pharmacist [name = " + super.getName() + "]";
	}
	
} // end of Pharmacist class
