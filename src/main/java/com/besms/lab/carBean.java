/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.besms.lab;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author kyrmann
 * 
 * Dans cet example l interface est implementat par 2 sous classes
 * Toyota et BMW
 * Par defaut le contenaeur sait identifier seulement le la classe unique qui la implementer.
 * Si nous voulons que l interface puise  etre implement par 2 classe different et etre en mesure de call le objets de ces classes,
 * il faut utiliser les qualifiait
 * 
 * un qualifiat Toyota et l autre Bmw
 * ensuite 2 interfce implementant l interface.
 * chaque interface doit porter la mention du qualifiant durant l implementation  de l interface
 * ensuite l injection peut se faire sans soucis .
 * 
 */
@Named
@SessionScoped
public class carBean  implements Serializable{
    
    @Bmw   // ici on inject un bean de type voiture mais qualifiant seulement les types BMW
    @Inject 
    Voiture voiture_1;   // Voiture etant une interface Voiture_1 est un objet de type Voiture  mais  qualifiant le modele BMW a cause de @BMW
    
    
    @Toyota
    @Inject 
    Voiture voiture_2; 
    
    
    
  //  @Inject
  //  Voiture bmw; 
    
    
    
    public String  display(){
        return voiture_1.displayInfo()+ " ----\n====\n "+  voiture_2.displayInfo();
    }
    
    
}
