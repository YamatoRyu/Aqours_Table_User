package protection.member.aqours_data.model;

import jakarta.validation.constraints.NotEmpty;

public class AqoursModel {
    @NotEmpty
    private String name;

    @NotEmpty
    private int birthdayDate;

    @NotEmpty
    private String birthdayMonth;

    @NotEmpty
    private String classYear;

    @NotEmpty
    private int age;

    @NotEmpty
    private int height;
}
