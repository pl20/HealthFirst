package view;

import tester.HealthFirstTester;
import javafx.fxml.FXML;

public class LoginScreenController extends HealthFirstTester {

	public HealthFirstTester healthFirstTester;
	public String user = "";
	 
	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param HealthFirstTester
     */
    public void setMainApp(HealthFirstTester HealthFirstTester) {
        this.healthFirstTester = HealthFirstTester;
        }   
    
    
    @FXML
    private void handleUser() { 
    	user = userType.getName();
    	System.out.println("User Type is :"+user);
    	if(user == "Doctor")
    		HealthFirstTester.showDoctor();
    	if(user == "Nurse")
    		HealthFirstTester.showNurse();
    	if(user == "Admin")
    		HealthFirstTester.showAdmin();
    	if(user == "Pharma")
    		HealthFirstTester.showPharmacist();	
    }
    @FXML
    private void handleUserSelect() {
    	
    }
    
    @FXML
    private void handleDoctor() {
    	userType.setName("Doctor");
    	System.out.print("doctor selected");
    }
    
    @FXML
    private void handleNurse() {
    	userType.setName("Nurse");
    	System.out.print("nurse selected");
    }
    
    @FXML
    private void handlePharmacist() {
    	userType.setName("Pharma");
    	System.out.print("phama selected");
    }
    
    @FXML
    private void handleAdministrator() {
    	userType.setName("Admin");
    	System.out.print("admin selected");
    
    }
    
    @FXML
    private void handlePatientSelect() {

    }
	
    
}
