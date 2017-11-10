package patientprocessing;
import java.util.Calendar;

import medicationprocessing.Medication;

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
File Name: Patient.java
*/

public class Patient {

	private static int PRESCRIPTION_LIST_SIZE = 50;
	
	private String name = "";
	private int patientID = 0;
	private static int nextIDNum = 1000;
	private int age = 0;
	private String bloodPressure = "";
	private int heartRate = 0;
	private double weightInLbs = 0.0;
	private double heightInInches = 0.0;
	private String familyHistory = ""; 
	private String currentIllness = "";
	private String allergies = "";
	private Medication[] activePrescriptions = null;
	private int numOfPrescriptions = 0;
	
	/**
	 * Default constructor for the Patient class
	 */
	public Patient() {
		setName("");
		setPatientID();
		setAge(0);
		setBloodPressure("");
		setHeartRate(0);
		setWeightInLbs(0.0);
		setHeightInInches(0.0);
		setFamilyHistory("");
		setCurrentIllness("");
		setAllergies("");
		activePrescriptions = new Medication[PRESCRIPTION_LIST_SIZE];
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Patient class
	 * @param name = The name of the Patient
	 * @param age = The age of the patient
	 * @param bloodPressure = The patients blood pressure
	 * @param heartRate = The patients heart rate
	 * @param weightInLbs = The patients weight measured in pounds (lbs)
	 * @param heightInInches = The patients height measured in inches (in)
	 * @param familyHistory = The patients family history
	 * @param currentIllness = Any illness' that the patient currently has
	 * @param allergies = Any allergies that the patient has
	 */
	public Patient(String name, int age, String bloodPressure,
			int heartRate, double weightInLbs, double heightInInches, String familyHistory, 
			String currentIllness, String allergies) {
		setName(name);
		setPatientID();
		setAge(age);
		setBloodPressure(bloodPressure);
		setHeartRate(heartRate);
		setWeightInLbs(weightInLbs);
		setHeightInInches(heightInInches);
		setFamilyHistory(familyHistory);
		setCurrentIllness(currentIllness);
		setAllergies(allergies);
		activePrescriptions = new Medication[PRESCRIPTION_LIST_SIZE];
	} // end of parameterized constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the patientID
	 */
	public int getPatientID() {
		return patientID;
	}

	/**
	 * sets the ID for the patient using a static variable nextIDNum
	 * and increments the ID in preparation for the next patient.
	 */
	public void setPatientID() {
		this.patientID = nextIDNum++;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the bloodPressure
	 */
	public String getBloodPressure() {
		return bloodPressure;
	}

	/**
	 * @param bloodPressure the bloodPressure to set
	 */
	public void setBloodPressure(String bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	/**
	 * @return the heartRate
	 */
	public int getHeartRate() {
		return heartRate;
	}

	/**
	 * @param heartRate the heartRate to set
	 */
	public void setHeartRate(int heartRate) {
		this.heartRate = heartRate;
	}

	/**
	 * @return the weightInLbs
	 */
	public double getWeightInLbs() {
		return weightInLbs;
	}

	/**
	 * @param weightInLbs the weightInLbs to set
	 */
	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	/**
	 * @return the heightInInches
	 */
	public double getHeightInInches() {
		return heightInInches;
	}

	/**
	 * @param heightInInches the heightInInches to set
	 */
	public void setHeightInInches(double heightInInches) {
		this.heightInInches = heightInInches;
	}

	/**
	 * @return the familyHistory
	 */
	public String getFamilyHistory() {
		return familyHistory;
	}

	/**
	 * @param familyHistory the familyHistory to set
	 */
	public void setFamilyHistory(String familyHistory) {
		this.familyHistory = familyHistory;
	}

	/**
	 * @return the currentIllness
	 */
	public String getCurrentIllness() {
		return currentIllness;
	}

	/**
	 * @param currentIllness the currentIllness to set
	 */
	public void setCurrentIllness(String currentIllness) {
		this.currentIllness = currentIllness;
	}

	/**
	 * @return the allergies
	 */
	public String getAllergies() {
		return allergies;
	}

	/**
	 * @param allergies the allergies to set
	 */
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	} 
	
	/**
	 * adds a prescription to the patients activePrescriptions array 
	 * and increments the numOfPrescriptions instance variable by 1
	 * @param newPrescription = the new prescription to add
	 */
	public void addPrescription(Medication newPrescription) {
		activePrescriptions[numOfPrescriptions++] = newPrescription;
	} // end of addPrescription method
	
	/**
	 * Logs the most recent time a dose of medication was given 
	 * @param medication = the medication that was given
	 * @param timeStamp = the time the most recent dose was given
	 */
	public void logMostRecentDose(Medication medication, Calendar timeStamp) {
		// add code
	} // end of logMostRecentDose method
	
} // end of Patient class
