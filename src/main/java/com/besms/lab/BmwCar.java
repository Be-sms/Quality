/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besms.lab;

import javax.enterprise.context.RequestScoped;

/**
 *
 * @author kyrmann
 */
@Bmw
@RequestScoped
public class BmwCar implements Voiture{
    
    private String brand=" BMW";
    private String speed= "220 km/h";


    @Override
    public String displayInfo() {
          return "BMW Info :"+this.brand +" : "+this.getSpeed();
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }
    
    
    
    
}
