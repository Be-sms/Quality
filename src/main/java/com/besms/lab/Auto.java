/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besms.lab;

import static java.lang.annotation.ElementType.*;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.inject.Qualifier;



@Qualifier
@Retention(RetentionPolicy.RUNTIME)
@Target({METHOD, TYPE, PARAMETER, FIELD})
public @interface Auto {
    AutoType type() default AutoType.FordCar;
}