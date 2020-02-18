package uni.fmi.models;

public class Parent extends User {

    public Parent() 
    {
    }

    private int parentId;
 
    public int getParentId() {
        return parentId;
    }

    public void setParent(int parentId) {
     this.parentId = parentId;
    }

    public int searchMark(int studentId) {
        // TODO implement here
        return 0;
    }

}