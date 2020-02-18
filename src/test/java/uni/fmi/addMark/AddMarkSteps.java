package uni.fmi.addMark;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.markForm.ui.models.MarkForm;

public class AddMarkSteps {
	MarkForm form;



@Given("^потребителя отваря страницата за въвеждане на оценки$")
public void openMarkFormPage() throws Throwable {
    form = new MarkForm();
    
}

@Given("^натиска върху бутона за въвеждане на оценка$")
public void clickMarkFormAddMarkButton() throws Throwable {
      form.ClickAddMarkButton();
}

@Given("^визуализира се форма за въвеждане на оценка$")
public void PresentTheMarkForm() throws Throwable {
    assertNotNull(form);
}

@When("^въведе валидна оценка$")
public void addMarkNumber() throws Throwable {
   form.addMarkNumber(3);
}

@When("^въведе валиден ученически номер$")
public void addStudentId() throws Throwable {
    form.addStudentId(1701321099);
}

@When("^натисне бутона за въвеждане на оценка$")
public void ClickAddMarkButtonFormButton() throws Throwable {
   form.ClickAddMarkButton();
}

@Then("^вижда съобщение с текст \"([^\"]*)\"$")
public void checkAddMarkMessage(String expectedMessage) throws Throwable {
	assertEquals(expectedMessage, form.getMessage());
}

@When("^въведе грешен ученически номер$")
public void addWrongStudentId() throws Throwable {
	form.addStudentId(0);
}

@When("^въведе грешна оценка$")
public void AddWrongMarkNumber() throws Throwable {
    form.addMarkNumber(0);
}

@When("^не въвежда оценка$")
public void DontAddMarkNumber() throws Throwable {
    form.ClickAddMarkButton();
}

@When("^не въвежда ученически номер$")
public void DontAddStudentId() throws Throwable {
	form.ClickAddMarkButton();
   }

}
