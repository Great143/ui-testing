package ui.testing.model;

import lombok.*;

@Getter
@Setter
//@RequiredArgsConstructor
@AllArgsConstructor
// @Data //Дата это сборник, анотация внутри сбея, содержит "Геттеры, сеттеры, тостринг, иквалс, хешкод" (лучше не использовать, не очень хорошая практика использовать из-а хешкод и иквалс)
public class Student {

    private final String firstName;
    private final String lastName;
    private final String email;
    private final String phone;
    private final String address;
    private final Gender gender;
    private final String birthDate;
    private final State state;
    private final City city;

}
