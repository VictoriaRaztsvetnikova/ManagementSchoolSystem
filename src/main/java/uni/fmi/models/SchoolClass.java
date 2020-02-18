package uni.fmi.models;

import java.util.List;

public class SchoolClass {

 
    public SchoolClass() 
    {
    }


    private int classId;
    private String className;
    private List<Subject> subject;
    private List<Student> student;
    
    public int getClassId() {
        return classId;
    }

    public String getClassName() {
    	return className;
    }

    public List<Subject> getSubject() {
        return subject;
    }

    public List<Student> getStudent() {
       
        return student;
    }

    public void setId(int classId) {
     this.classId = classId;
    }

    public void setName(String className) {
    	this.className = className;

    }

    public List<Subject> setSubject(List<Subject> subject) {
        return subject;
    }
    
    public List<Student> setStudent(List<Student> student) {
        return student;
    }

}