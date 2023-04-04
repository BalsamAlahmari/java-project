/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.io.*; 
import java.util.ArrayList;
import java.util.Scanner; 
import java.util.*; 
/** 
 * 
 * @author balso 
 */ 
public class Bill { 
    private final double TAX=0.15;
    private double total; 
    private Customer customer; 
    private Events events; 
    private  int ticketNum;
       
    public Bill(Customer c,Events e){ 
         
     customer=c;
     events=e; 
      
    } 
 
    public Bill() { 
    } 
 
 
    public void setCustomer(Customer customer) { 
        this.customer = customer; 
    } 
 
    public void setEvents(Events events) { 
        this.events = events; 
    } 
 
 
    public Customer getCustomer() { 
        return customer; 
    } 

    public int getTicketNum() {
        return ticketNum;
    }
 
 
 
    public Events getEvents() { 
        return events; 
    } 
    public double calculateTotal(){ 
    total=(events.price*TAX)+events.price; 
    return total; 
    } 

    public  String toString(){ 
        if(total==0)
            return "\n          -----------------------------------------------------------------------------------------------------------\n                                                       Order Information\n         "+ 
             " -----------------------------------------------------------------------------------------------------------\n"+ 
             "\t  |   "+customer+"\n"+"\t  |   "+events+"\n\n"+ 
             "***Thank You for Choosing Jeddah Season*** \n";
        else
     return "\n          -----------------------------------------------------------------------------------------------------------\n                                                       Order Information\n         "+ 
             " -----------------------------------------------------------------------------------------------------------\n"+ 
             "\t  |   "+customer+"\n"+"\t  |   "+events+"\n"+"\t  |   "+"Total:"+total+"\n\n***You can pay when you arrive at the event location***\n"+ 
             "***Thank You for Choosing Jeddah Season*** \n";
      
    } 
}

