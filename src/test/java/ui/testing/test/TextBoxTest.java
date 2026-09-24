package ui.testing.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ui.testing.BaseTest;
import ui.testing.data.TestData;
import ui.testing.data.TextBoxData;
import ui.testing.model.TextData;
import ui.testing.output.TextBoxOutput;
import ui.testing.page.TextBoxPage;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TextBoxTest extends BaseTest {

    @Test
    void fillTextBox() {
        TextData textData = TextBoxData.defaultTextData();
        TextBoxPage textBoxPage = new TextBoxPage(getDriver());
        TextBoxOutput output = textBoxPage
                .open()
                .fieldFullName(textData.getFullName())
                .fieldEmail(textData.getEmail())
                .fieldCurrentAddress(textData.getCurrentAddress())
                .fieldPermanentAddress(textData.getPermanentAddress())
                .clickSubmitButton();
        Assertions.assertAll(
                () -> assertEquals(textData.getFullName(), output.getName()),
                () -> assertEquals(textData.getEmail(), output.getEmail()),
                () -> assertEquals(textData.getCurrentAddress(), output.getCurrentAddress()),
                () -> assertEquals(textData.getPermanentAddress(), output.getPermanentAddress())
        );

    }

}
