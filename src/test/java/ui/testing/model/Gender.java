package ui.testing.model;

public enum Gender {

    FEMALE("Female"),
    MALE("Male"),
    OTHER("Other");

    String nameGender;

    public String getNameGender() {
        return nameGender;
    }

    Gender(String nameGender) {
        this.nameGender = nameGender;
    }
}
