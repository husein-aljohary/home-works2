/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author 140083
 */
public class configuration2 implements configurationfactory{

    @Override
    public hand creatHand() {
return new handcompanyY();
    }

    @Override
    public head creatHead() {
return new headcompanyY();
    }

    @Override
    public leg creatLeg() {
return new legcompanyX();
    }
    
}
