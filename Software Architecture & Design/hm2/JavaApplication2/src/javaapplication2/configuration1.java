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
public class configuration1 implements configurationfactory{

    @Override
    public hand creatHand() {
return new handcompanyX();
    }

    @Override
    public head creatHead() {
return new headcompanyX();
    }

    @Override
    public leg creatLeg() {
return new legcompanyY();
    }
    
}
