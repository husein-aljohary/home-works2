/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author 140083
 */
public class compositepicture extends picture{

    public compositepicture(String name) {
        super(name);
    }
    
    private List<picture> pic=new ArrayList<picture>();
    
    //public  void draw(){
    //pic.draw(pic);
    
    //}
    @Override
    public String getpic(){
    StringBuilder sb=new StringBuilder(""+gename());
    for(picture pi: pic){
    sb.append(pi.getpic());
    }
    sb.append("");
    return sb.toString();
    
    }
    
    
}
