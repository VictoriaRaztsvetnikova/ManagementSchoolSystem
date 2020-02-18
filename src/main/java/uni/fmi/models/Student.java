package uni.fmi.models;

/**
 * 
 */
public class Student extends User {

    /**
     * Default constructor
     */
    public Student() {
    }

    private int studentId;
    public int markId;
    public int markNumber;


    public int takeExam(int studentId) {
        return markNumber;
    
	}
    
    public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

}