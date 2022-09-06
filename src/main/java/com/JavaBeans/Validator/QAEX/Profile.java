package com.JavaBeans.Validator.QAEX;

import javax.validation.constraints.*;

public class Profile {

    @Size(max = 20, min = 3, message = "{profile.forename.invalid}")
    private String forename;

    @Size(max = 20, min = 3, message = "{profile.forename.invalid}")
    private String surname;

    @Pattern(regexp = "^(0[1-9]|[12][0-9]|3[01])-(0[1-9]|1[0-2])-\\d{4}$", message="{profile.dateOfBirth.invalid}")
    private String DateofBirth;

    private String Gender;

    @NotEmpty
    private String Ethnicity;

    public Profile(String forename, String surname, String DateofBirth, String Gender, String Ethnicity){
        this.forename = forename;
        this.surname = surname;
        this.DateofBirth = DateofBirth;
        this.Gender = Gender;
        this.Ethnicity = Ethnicity;
    }

}
