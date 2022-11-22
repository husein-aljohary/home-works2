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
public class robot {
    private hand hand1;
    private head head1;
    private leg leg1;

    public robot(configurationfactory fct){
    hand1=fct.creatHand();
    head1=fct.creatHead();
    leg1=fct.creatLeg();
    
    }
    
    public String getHand1() {
        return hand1.move();
    }

    public String getHead1() {
        return head1.move();
    }

    public String getLeg1() {
        return leg1.move();
    }

    @Override
    public String toString() {
        return "robot{" + "hand1=" + hand1.move() + ", head1=" + head1.move() + ", leg1=" + leg1.move() + '}';
    }
    
    
    
    
}
