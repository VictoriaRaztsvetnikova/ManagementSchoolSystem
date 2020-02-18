package uni.fmi.models;

public class Mark {

    public Mark() {
    }

    private int markId;
    private int markNumber;

 
    public int getMarkNumber() {
        return markNumber;
    }
    public void setMarkNumber(int markNumber) {
    	this.markId = markNumber;
    }

    public int getMarkId() {
        return markId;
    }

	public void setMarkId(int markId) {
		this.markId = markId;
	}

}