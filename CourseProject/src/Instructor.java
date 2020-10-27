
public class Instructor {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private int experiencedYear;
	
	
	
	//CONSTRUCTOR
	
	public Instructor(String firstName, String lastName, String phoneNumber, int experiencedYear) {
		setFirstName(firstName);
		setLastName(lastName);
		setPhoneNumber(phoneNumber);
		setExperiencedYear(experiencedYear);
	}
	
	/*
	 * 	getStatus () (With switch and case)————>
	 *  if Experience year < 2 we have Junior Instructor 
     *  If Experience year is between 2 and 4 we have 
     *  Intermediate Instructor
     *  More than 4 we have Senior Instructor 
	 */
	
	public String getStatus() {
//		if (experiencedYear < 2) {
//			return "Junior Instructor";
//		} else if (experiencedYear <= 2 && experiencedYear >= 4) {
//			return "Intermediate Instructor";
//		} else {
//			return "Senior Instructor";
//		}
		switch (experiencedYear) {
			case 1:
				return "Junior Instructor";
			case 2: case 3: case 4:
				return "Intermediate Instructor";
			default:
				return "Senior Instructor";
		}
	}
	
	//GETTER
	
	/*
	 * @ return firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/*
	 * @ return lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/*
	 * @ return phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/*
	 * @ return experiencedYear
	 */
	public int getExperiencedYear() {
		return experiencedYear;
	}
	
	
	
	// SETTER
	
	/*
	 * @ param firstName
	 */
	public void setFirstName(String firstName) {
		if (!firstName.isEmpty() && !firstName.equalsIgnoreCase(null)) {
			this.firstName = firstName;
		} else {
			this.firstName = "Unknown";
		}
		
	}
	/*
	 * @ param lastName
	 */
	public void setLastName(String lastName) {
		if (!lastName.isEmpty() && !lastName.equalsIgnoreCase(null)) {
			this.lastName = lastName;
		} else {
			this.lastName = "Unknown";
		}
	}
	/*
	 * @ param phoneNumber
	 */
	public void setPhoneNumber(String phoneNumber) {
		if (!phoneNumber.isEmpty() && !phoneNumber.equalsIgnoreCase(null)) {
			this.phoneNumber = phoneNumber;
		} else {
			this.phoneNumber = "Unknown";
		}
	}
	/*
	 * @ param experiencedYear
	 */
	public void setExperiencedYear(int experiencedYear) {
		if (experiencedYear < 1) {
			this.experiencedYear = 1;
		} else {
			this.experiencedYear = experiencedYear;
		}		
	}		
}
