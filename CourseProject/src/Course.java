
public class Course {
	
	private String courseName;
	private int duration;
	private Instructor instructor;

	
	
	//CONSTRUCTOR
	
	public Course(String courseName, int duration, Instructor instructor) {
		setCourseName(courseName); 
		setDuration(duration);
		setInstructor(instructor);
	}
	
	
	
	//GETTER
	
	/*
	 * @ return courseName
	 */
	public String getCourseName() {
		return courseName;
	}
	/*
	 * @ return duration
	 */
	public int getDuration() {
		return duration;
	}
	/*
	 * @ return instructor
	 */
	public Instructor getInstructor() {
		return instructor;
	}
	
	
	
	// SETTER
	
	/*
	 * @ param courseName
	 */
	public void setCourseName(String courseName) {
		if (!courseName.isEmpty() && !courseName.equalsIgnoreCase(null)) {
			this.courseName = courseName;
		} else {
			this.courseName = "Unknown";
		}	
	}
	/*
	 * @ param duration
	 */
	public void setDuration(int duration) {
		if (duration > 4) {
			this.duration = duration;
		} else {
			this.duration = 4;
		}		
	}
	/*
	 * @ param instructor
	 */
	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}
}
