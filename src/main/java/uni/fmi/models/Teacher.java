package uni.fmi.models;

public class Teacher extends User {

    public Teacher()
   {
    }

    private int teacherId;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacher(int teacherId) {
    this.teacherId = teacherId;
    }

    public int deleteMark(int studentId, int markNumber) {
        // TODO implement here
        return 0;
    }

    public int addMark(int studentId, int markNumber) {
        // TODO implement here
        return 0;
    }

    public int updateMark(int studentId, int markNumber) {
        // TODO implement here
        return 0;
    }
}