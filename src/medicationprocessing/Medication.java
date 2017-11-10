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
File Name: Medication.java
*/

public class Medication {
	
	private String name = "";
	private String description = "";
	private int dosageInMg = 0;
	private int minDosageTimeHours = 0;
	private int maxDosageTimeHours = 0;
	private boolean isNarcotic = false;
	private boolean isOverTheCounter = false;
	private boolean isAntibiotic = false;
	private boolean isAntiInflamitory = false;
	
	/**
	 * Default constructor for the Medication class
	 */
	public Medication() {
		setName("");
		setDescription("");
		setDosageInMg(0);
		setMinDosageTimeHours(0);
		setMaxDosageTimeHours(0);
		setNarcotic(false);
		setOverTheCounter(false);
		setAntibiotic(false);
		setAntiInflamitory(false);
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the Medication class
	 * @param name = The name of the Medication
	 * @param description = The description of the Medication
	 * @param dosageInMg = The dosage size in Mg of the Medication
	 * @param minDosageTimeHours = The lower end of the dosage time in hours of the Medication
	 * @param maxDosageTimeHours = The upper ed of the dosage time in hours of the Medication
	 * @param isNarcotic = If the Medication is a Narcotic
	 * @param isOverTheCounter = If the Medication is an over the counter medicine
	 * @param isAntibiotic = If the Medication is an antibiotic
	 * @param isAntiInflamitory = If the Medication is an anti-inflamitory
	 */
	public Medication(String name, String description, int dosageInMg, int minDosageTimeHours,
			int maxDosageTimeHours, boolean isNarcotic, boolean isOverTheCounter, boolean isAntibiotic, 
			boolean isAntiInflamitory) {
		setName(name);
		setDescription(description);
		setDosageInMg(dosageInMg);
		setMinDosageTimeHours(minDosageTimeHours);
		setMaxDosageTimeHours(maxDosageTimeHours);
		setNarcotic(isNarcotic);
		setOverTheCounter(isOverTheCounter);
		setAntibiotic(isAntibiotic);
		setAntiInflamitory(isAntiInflamitory);
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
	 * @return the discription
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param discription the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the dosageInMg
	 */
	public int getDosageInMg() {
		return dosageInMg;
	}

	/**
	 * @param dosageInMg the dosageInMg to set
	 */
	public void setDosageInMg(int dosageInMg) {
		this.dosageInMg = dosageInMg;
	}

	/**
	 * @return the minDosageTimeHours
	 */
	public int getMinDosageTimeHours() {
		return minDosageTimeHours;
	}

	/**
	 * @param minDosageTimeHours the minDosageTimeHours to set
	 */
	public void setMinDosageTimeHours(int minDosageTimeHours) {
		this.minDosageTimeHours = minDosageTimeHours;
	}

	/**
	 * @return the maxDosageTimeHours
	 */
	public int getMaxDosageTimeHours() {
		return maxDosageTimeHours;
	}

	/**
	 * @param maxDosageTimeHours the maxDosageTimeHours to set
	 */
	public void setMaxDosageTimeHours(int maxDosageTimeHours) {
		this.maxDosageTimeHours = maxDosageTimeHours;
	}

	/**
	 * @return the isNarcotic
	 */
	public boolean isNarcotic() {
		return isNarcotic;
	}

	/**
	 * @param isNarcotic the isNarcotic to set
	 */
	public void setNarcotic(boolean isNarcotic) {
		this.isNarcotic = isNarcotic;
	}

	/**
	 * @return the isOverTheCounter
	 */
	public boolean isOverTheCounter() {
		return isOverTheCounter;
	}

	/**
	 * @param isOverTheCounter the isOverTheCounter to set
	 */
	public void setOverTheCounter(boolean isOverTheCounter) {
		this.isOverTheCounter = isOverTheCounter;
	}

	/**
	 * @return the isAntibiotic
	 */
	public boolean isAntibiotic() {
		return isAntibiotic;
	}

	/**
	 * @param isAntibiotic the isAntibiotic to set
	 */
	public void setAntibiotic(boolean isAntibiotic) {
		this.isAntibiotic = isAntibiotic;
	}

	/**
	 * @return the isAntiInflamitory
	 */
	public boolean isAntiInflamitory() {
		return isAntiInflamitory;
	}

	/**
	 * @param isAntiInflamitory the isAntiInflamitory to set
	 */
	public void setAntiInflamitory(boolean isAntiInflamitory) {
		this.isAntiInflamitory = isAntiInflamitory;
	}
	
} // end of Medication class
