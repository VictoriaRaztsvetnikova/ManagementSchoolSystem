package uni.fmi.markForm.ui.models;

public class MarkForm {
	
	private int studentId;
	private int markNumber;
	private String message;
	
	public void addStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void addMarkNumber(int markNumber) {
		this.markNumber = markNumber;
	}
	
	
	public String getMessage() {
		return message;
	}
	
	public void ClickAddMarkButton() {
		
		boolean isStudentIdNotValid = studentId == 0;
		boolean isMarkNumberNotValid = markNumber == 0 || markNumber < 1 || markNumber > 7;
		
		
		if(isStudentIdNotValid || isMarkNumberNotValid){			
			message = "Моля въведете валидни данни!";
		}
		
		else{
		message = "Вие успешно въведохте оценка!";
	
		
	}
  }
}
