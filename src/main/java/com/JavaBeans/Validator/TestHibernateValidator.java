package com.JavaBeans.Validator;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class TestHibernateValidator {


    public static void main(String[] args) {

        // Create ValidatoryFactory which return the validator
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

        //it validates bean instance //
        Validator validator = factory.getValidator(); // building the validator with the factory

        User user = new User(null,"1","abc@gmail.com");

        // What is the DataType? -> User
        // What is the name of the set? -> constraintViolations
        // what is the use of validator here // -> to validate
        // from where the validator is comming // ->
        // who is building the validator// -> Validator Factory
        // why there is a small "user" in the - validate ARG? -> object of class
        Set<ConstraintViolation<User>> constraintViolations = validator.validate(user);


        // show the errros //
        if(constraintViolations.size() >0 ){
            for(ConstraintViolation<User> violation : constraintViolations){
                System.out.println(violation.getMessage());
            }
        }else {
            System.out.println("Valid Object");
        }

    }

}
