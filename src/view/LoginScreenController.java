package view;

import tester.HealthFirstTester;
import javafx.fxml.FXML;

public class LoginScreenController {

	public HealthFirstTester healthFirstTester;
	public String user = "";
	 
	/**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(HealthFirstTester mainApp) {
        this.healthFirstTester = mainApp;
        }   
    
    
    @FXML
    private void handleUser() { 
    	
    }
    @FXML
    private void handleUserSelect() {
    	
    }
    
    @FXML
    private void handleDoctor() {
    	
    }
    
    @FXML
    private void handleNurse() {
    	
    }
    
    @FXML
    private void handlePharmacist() {
    	
    }
    
    @FXML
    private void handleAdministrator() {
    	
    
    }
    
    @FXML
    private void handlePatientSelect() {
    	
    }
	
    
}
