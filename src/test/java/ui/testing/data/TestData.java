package ui.testing.data;

import ui.testing.model.City;
import ui.testing.model.Gender;
import ui.testing.model.State;
import ui.testing.model.Student;

public class TestData {

    public static Student defaultStudent() {
        return new Student("Вадим", "Иванов", "sdgsdg@mail.com", "1343523535", "something Street", Gender.MALE, "14 May,2022", State.NCR, City.DELHI);
    }
}
