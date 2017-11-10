package users;

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
File Name: User.java
*/

public class User {

	private String name = "";

	/**
	 * Default constructor for the User class
	 */
	public User() {
		setName("");
	} // end of default constructor
	
	/**
	 * Parameterized constructor for the User class
	 * @param name = The name of the user
	 */
	public User(String name) {
		setName(name);
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [name = " + getName() + "]";
	}
	
} // end of User class
