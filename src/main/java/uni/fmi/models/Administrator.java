package uni.fmi.models;

public class Administrator extends User {

 
    public Administrator() {
    }

    private int adminId;

    public int getAdminId() {
        return adminId;
    }
    
    public void setAdminId(int adminId) {
      this.adminId = adminId;
    }

    public boolean updateClass(int classId) {
        // TODO implement here
        return false;
    }

    public boolean addClass(int classId, String className) {
        // TODO implement here
        return false;
    }

    public String searchClass(String className) {
        // TODO implement here
        return "";
    }

    public boolean deleteClass(String className) {
        // TODO implement here
        return false;
    }

    public boolean addStudent(int studentId, String className) {
        // TODO implement here
        return false;
    }

    public boolean deleteStudent(int studentId) {
        // TODO implement here
        return false;
    }

    public boolean updateStudent(int studentId) {
        // TODO implement here
        return false;
    }

    public int searchStudent(int studentId) {
        // TODO implement here
        return 0;
    }

    public boolean addTeacher(int teacherId) {
        // TODO implement here
        return false;
    }

    public boolean deleteTeacher(int teacherId) {
        // TODO implement here
        return false;
    }

    public boolean updateTeacher(int teacherId) {
        // TODO implement here
        return false;
    }

    public int searchTeacher(int teacherId) {
        // TODO implement here
        return 0;
    }

    public boolean addParent(int parentId) {
        // TODO implement here
        return false;
    }

    public boolean deleteParent(int parentId) {
        // TODO implement here
        return false;
    }

    public boolean updateParent(int parentId) {
        // TODO implement here
        return false;
    }

    public int searchParent(int parentId) {
        // TODO implement here
        return 0;
    }


}