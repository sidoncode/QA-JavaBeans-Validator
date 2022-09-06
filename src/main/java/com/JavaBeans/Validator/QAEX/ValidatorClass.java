package com.JavaBeans.Validator.QAEX;
import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;
public class ValidatorClass {
    public static void main(String[] args) {
        ValidatorFactory factory1 = Validation.buildDefaultValidatorFactory();
        Validator validator1 = factory1.getValidator(); // building the validator with the factory
        Profile profile= new Profile("Siddd","Shard","01-01-1888","M","AD");
        Set<ConstraintViolation<Profile>> constraintViolations = validator1.validate(profile);

        if(constraintViolations.size() >0 ){
            for(ConstraintViolation<Profile> violation : constraintViolations){
                System.out.println(violation.getMessage());
            }
        }else {
            System.out.println("Valid Object");
        }
    }
}
