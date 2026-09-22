package ui.testing.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ui.testing.BaseTest;
import ui.testing.modal.SubmitFormModal;
import ui.testing.model.Gender;
import ui.testing.page.PracticeFormPage;
import ui.testing.data.TestData;
import ui.testing.model.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PracticeFormTest extends BaseTest {

    @Test
    void showSubmitPracticeForm() {
        Student student = TestData.defaultStudent();
        PracticeFormPage formPage = new PracticeFormPage(getDriver());
        SubmitFormModal modalForm = formPage
                .open()
                .fieldFirstName(student.getFirstName())
                .fieldLastName(student.getLastName())
                .fieldEmail(student.getEmail())
                .selectGender(student.getGender())
                .fieldMobileNumber(student.getPhone())
                .fieldCurrentAddress(student.getAddress())
                .clickDropdownState(student.getState().getDisplayName())
                .clickDropdownCity(student.getCity().getDisplayName())
                .openDateOfBirth("May", "2022", "14")
                .clickSubmitButton();
        Assertions.assertAll(
                () -> assertEquals("Thanks for submitting the form", modalForm.getSuccessfulText()),
                () -> assertEquals(student.getFirstName() + " " + student.getLastName(), modalForm.getStudentName()),
                () -> assertEquals(student.getEmail(), modalForm.getEmail()),
                () -> assertEquals(student.getGender().getNameGender(), modalForm.getGender()),
                () -> assertEquals(student.getPhone(), modalForm.getMobile()),
                () -> assertEquals(student.getAddress(), modalForm.getAddress()),
                () -> assertEquals(student.getState().getDisplayName() + " " + student.getCity().getDisplayName(), modalForm.getStateAndCity()),
                () -> assertEquals(student.getBirthDate(), modalForm.getBirthDate())
        );
    }
}
