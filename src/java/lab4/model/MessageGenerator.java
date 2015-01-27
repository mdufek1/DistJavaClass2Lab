/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.model;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 *
 * @author Mike
 */
public class MessageGenerator {
    
   private EnumMap<MessageIdentifiers, String> messages = new EnumMap<>(MessageIdentifiers.class);
   
    
    public String generateMessage(String name){
        String message;
        int time = Integer.parseInt(new SimpleDateFormat("HH").format(new Date()));

        if(time >= 5 && time < 12){
            message = "Good Morning, "+name+".";
        }
        else if(time >= 12 && time < 17){
            message = "Good Afternoon, "+name+".";
        }
        else{
            message = "Good Evening, "+name+".";
        }

        return message;
    }
    
    public static void main(String[] args) {
        MessageGenerator mg = new MessageGenerator();
        System.out.println(mg.generateMessage("butts"));
    }
    
}
