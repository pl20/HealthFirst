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
File Name: Administrator.java
*/

public class Administrator extends User {

	/**
	 * Default constructor for the Administrator class
	 */
	public Administrator() {
		super();
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Administrator class
	 * @param name = The name of the Administrator
	 */
	public Administrator(String name) {
		super(name);
	} // end of parameterized constructor
	
	/**
	 * Allows the Administrator creates new patients
	 * @param name = The name of the Patient
	 * @param patientID = The Patients ID number
	 * @param age = The age of the patient
	 * @param bloodPressure = The patients blood pressure
	 * @param heartRate = The patients heart rate
	 * @param weightInLbs = The patients weight measured in pounds (lbs)
	 * @param heightInInches = The patients height measured in inches (in)
	 * @param familyHistory = The patients family history
	 * @param currentIllness = Any illness' that the patient currently has
	 * @param allergies = Any allergies that the patient has
	 */
	public Patient createNewPatient(String name, int patientID, int age, String bloodPressure,
			int heartRate, double weightInLbs, double heightInInches, String familyHistory, 
			String currentIllness, String allergies) {
		Patient patient = new Patient(name, age, bloodPressure, heartRate, weightInLbs, 
				heightInInches, familyHistory, currentIllness, allergies);
		return patient;
	} // end createNewPatient method

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Administrator [name = " + super.getName() + "]";
	}
	
} // end of Administrator class
