/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.util.*;
/**
 *
 * @author balso
 */

public class Events { 
    Scanner keybored=new Scanner(System.in); 
    private String enter;
    private char day; 
    public  double price; 
    private int ticket=0; 
    private int event; 
  
    public Events(String enter, char day, int price, int event) { 
        this.enter = enter; 
        this.day = day; 
        this.price = price; 
        this.event = event; 
    } 
 
    public Events() { 
    } 
 
    public void setEnter(String enter) { 
        this.enter = enter; 
    } 
 
    public void setDay(char day) { 
        this.day = day; 
    } 
 
    public void setTiket(int tiket) { 
        this.ticket = tiket; 
    } 
 
    public void setPrice(int price) { 
        this.price = price; 
    } 
 
    public void setEvent(int event) { 
        this.event = event; 
    } 
 
    public String getEnter() { 
        return enter; 
    } 
 
    public char getDay() { 
        return day; 
    } 
 
    public int getTiket() { 
        return ticket; 
    } 
 
    public double getPrice() { 
        return price; 
    } 
 
    public int getEvent() { 
        return event; 
    } 
     
     
    
public void cityWalk(){ 
   
  System.out.println("Prices over the WEEK are 50 per person \n"+ 
         "Prices over the WEEKEND are 100 per person \n"+ 
         "CHILDERN aged 12 and under can enter for free on WEEKDAYS "); 
         dayMenu(); 
  
    switch(day){ 
        case 'u': 
        case 'U': 
        case 'M': 
        case 'm': 
        case 'T': 
        case 't': 
        case 'W': 
        case 'w': 
            price=ticket*50; 
            break; 
        default: 
            price=ticket*100;
    } 
    
} 
 
public void dayMenu(){ 
    //check input  
  System.out.println("Please choose the day :"); 
    System.out.println("(U)Sunday,(M)Monday, (T)Tuesday, (W)Wednesday, (R)Thursday,"+ 
            "(F)Friday, (S)Saturday."); 
    enter = keybored.nextLine(); 
    day = enter.charAt(0); 
    while(!Character.toString(day).matches("^[u,s,f,t,r,m,w,F,W,S,R,T,U,M]*$")){ 
    System.out.println("***Please retry entering the day from the menu above***"); 
    enter = keybored.nextLine(); 
    day = enter.charAt(0); 
} 
    System.out.println("Please enter how many tickets you want to book :"); 
    ticket = keybored.nextInt(); 
    while(ticket <1){ 
        System.out.println("***Please enter a valid number for tickets, 1 and up.***"); 
        ticket = keybored.nextInt();
    } 
} 
 
public void jeddahPier(){ 
   
  System.out.println("Prices over the WEEK are 100 per person \n"+ 
         "Prices over the WEEKEND are 150 per person \n"//not include.... 
         + "CHILDERN aged 12 and under can enter for free on WEEKDAYS "); 
         dayMenu(); 
  
    switch(day){ 
        case 'u': 
        case 'U': 
        case 'M': 
        case 'm': 
        case 'T': 
        case 't': 
        case 'W': 
        case 'w': 
            price=ticket*100; 
            break; 
        default: 
            price=ticket*150;      
    } 
 
} 
public void jeddahArtPromenade(){ 
  System.out.println("Free entry for this Event"); 
         dayMenu(); 
     
} 
 
public void jeddahJungle() { 
     System.out.println("Prices over the WEEK are 50 per person \n"+ 
         "Prices over the WEEKEND are 100 per person \n");
     System.out.println("prices for SAFARI jungle trip are 2500 per person." 
             + "\nCHILDERN aged 12 and under can enter for free on WEEKDAYS "  
             + "\nDo you want to upgrade to SAFARI trip? " 
            );

enter = keybored.nextLine(); 
     char saffari = enter.charAt(0); 
     if(saffari=='y'||saffari=='Y'){ 
         dayMenu(); 
         price = ticket*2500;     
     } 
     else{ 
         dayMenu(); 
          
    
    switch(day){ 
        case 'u': 
        case 'U': 
        case 'M': 
        case 'm': 
        case 'T': 
        case 't': 
        case 'W': 
        case 'w': 
            price=ticket*50; 
            break; 
        default: 
            price=ticket*100;      
    } 
     } 
   
} 
     
 
public void jeddahSuperdome() { 
 System.out.printf("          -----------------------------------------------------------------------------------------------------------\n"); 
 System.out.println("          Jeddah Superdome hosts the most prominent socio-cultural, " 
+ "recreational, and sports events,\n          multi-purpose exhibits, " 
+ "specialty shows, and international conferences and more.  "); 
 System.out.printf("          -----------------------------------------------------------------------------------------------------------\n"); 
 System.out.println("The events avaiable in the Superdome "); 
 System.out.println(" 1- Kpop festival \n 2- football game \n 3- Abdulmajed concert "); 
 System.out.println("Please enter 1 to book a ticket in the kpop festival\n" 
         + "Please enter 2 to book a ticket in the football game\n" 
         + "Please enter 3 to book a ticket in abdulmajed concert"); 
    event = keybored.nextInt(); 
      ArrayList<String> enetsSuperDom=new ArrayList<>();
     enetsSuperDom.add("Kpop festival");
     enetsSuperDom.add("football game"); 
     enetsSuperDom.add("abdulmajed concert"); 
     
    switch(event) { 
     case 1: 
          System.out.println("<<your choice is "+enetsSuperDom.get(0)+" event>>");
         System.out.println("the Kapop festival is open on only one day the 28th of march 2023\n" 
                 + "tickets run for 250SAR PER person. "); 
         System.out.println("Please enter how many tickets you want to book :"); 
    ticket = keybored.nextInt(); 
    price = ticket*250; 
          day='t';
         break; 
          
     case 2: 
         System.out.println("<<your choice is "+enetsSuperDom.get(1)+" event>>");
         System.out.println("The football game is on the 28th of february\n" 
                 + "tickets run for 50SAR PER person"); 
         System.out.println("Please enter how many tickets you want to book :"); 
    ticket = keybored.nextInt(); 
    price = ticket*50;
      day='t';
         break; 
          
     case 3: 
         System.out.println("<<your choice is "+enetsSuperDom.get(2)+" event>>");
         System.out.println("abdulmajed concert is on the 3th of march\n" 
                 + "tickets run for 500 PER person"); 
         System.out.println("Please enter how many tickets you want to book :"); 
         ticket = keybored.nextInt(); 
    price = ticket*500; 
            day='f';
         break; 
     default: 
         System.out.println("wrong choice please try again"); 
    } 
  
 
} 
public void jeddahYachtClub() { 
    System.out.println("Prices over the WEEK are 200 per person \n"+ 
         "Prices over the WEEKEND are 250 per person \n"
         + "CHILDERN aged 12 and under can enter for free on WEEKDAYS "); 
         dayMenu(); 
   
    switch(day){ 
        case 'u': 
        case 'U': 
        case 'M': 
        case 'm': 
        case 'T': 
        case 't': 
        case 'W': 
        case 'w': 
            price=ticket*200; 
            break; 
        default: 
            price=ticket*250;      
    } 
    
     
} 
         
 
 
    public String toString(){ 
       
        if(day=='U'||day=='u') 
    return "Day:Sunday"+"  Tiket:"+ticket; 
        else  if(day=='M'||day=='m') 
    return "Day:Monday"+"  Tiket:"+ticket; 
         else   if(day=='T'||day=='t') 
    return "Day:Tuesday"+"  Tiket:"+ticket; 
         else  if(day=='W'||day=='w') 
    return "Day:Wednesday"+"  Tiket:"+ticket; 
            else  if(day=='R'||day=='r') 
    return "Day:Thursday"+"  Tiket:"+ticket; 
               else   if(day=='F'||day=='f') 
    return "Day:Friday"+"  Tiket:"+ticket; 
               else    
    return "Day:Saturday"+"  Tiket:"+ticket; 
      
        }
    } 
 
 

 

