package tester;

import patientprocessing.Patient;
import users.Administrator;
import users.Doctor;
import gui.Gui;
import static javafx.application.Application.launch;
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


public class HealthFirstTester {

	public static void main(String[] args) {
		Administrator admin = new Administrator("John");
		System.out.println(admin);
		Doctor doc = new Doctor("Eddy");
		System.out.println(doc);
		Patient steve = new Patient();
		doc.prescribeMedication("drug A", steve);
                Gui.graphics();
		
	}

}
