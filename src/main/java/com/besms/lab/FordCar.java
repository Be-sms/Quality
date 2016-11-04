/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besms.lab;


import javax.enterprise.context.RequestScoped;


@RequestScoped
public class FordCar implements VoitureLux{
    
    private String brand=" Ford ";
    private String speed= "230 km/h";


    @Override
    public String displayInfo() {
          return "Ford Info :"+this.brand +" : "+this.getSpeed();
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
