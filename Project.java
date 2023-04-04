/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.io.IOException; 
import java.util.Scanner; 
/**
 *
 * @author balso
 */
public class Project {

    /**
     * @param args the command line arguments
     */
 
  
    public static void main(String[] args) throws IOException { 
    Scanner keybored = new Scanner(System.in);  
    System.out.println("                                              <<<Welcome to Jeddah Season>>>          \n"); 
    System.out.printf("          -----------------------------------------------------------------------------------------------------------\n"); 
    System.out.println("          Under the slogan \" Our Lovely Days \" " 
            + "the Jeddah Season 2022 will offer a packed schedule of 2,800 events\n" 
            + "          reflecting Jeddah\'s rich culture and heritage, " 
            + "as well as its growing status as a major regional " 
            + "tourist \n          destination. Furthermore, the program took " 
            + "inspiration from the city\'s coastal identity."); 
    System.out.println("          -----------------------------------------------------------------------------------------------------------\n"); 
     
      System.out.print("Please enter your name:"); 
      String cName = keybored.nextLine(); 
      System.out.print("Please enter your phone number:"); 
      String cPhoneNumber= keybored.nextLine(); 
      
      

    menu(); 
    int choice = keybored.nextInt(); 
       Customer c1 = new Customer(cName,cPhoneNumber); 
       Events e1 = new Events(); 
       Bill b1=new Bill(c1,e1); 
   // c1.fileRead(); for reading info from the file
      c1.filePrint(); 
    
        
      switch(choice){ 
          case 1 -> { 
              System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                       City Walk\n          -----------------------------------------------------------------------------------------------------------\n"); 
              
              e1.cityWalk(); 
             b1.calculateTotal(); 
            
              System.out.println(b1+"\n"); 
              
            } 
          case 2 -> { 
               System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                       Jeddah Pier\n          -----------------------------------------------------------------------------------------------------------\n"); 
              e1.jeddahPier(); 
               b1.calculateTotal(); 
              System.out.println(b1); 
            } 
          case 3 -> { 
              System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                       Jeddah Art Promenade\n          -----------------------------------------------------------------------------------------------------------\n"); 
              e1.jeddahArtPromenade(); 
              
              System.out.println(b1); 
               
            } 
          case 4 -> { 
              System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                       Jeddah Jungle\n          -----------------------------------------------------------------------------------------------------------\n"); 
              e1.jeddahJungle(); 
            b1.calculateTotal(); 
              System.out.println(b1); 
            } 
          case 5 -> { 
              System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+


"                                                       Jeddah Superdome\n          -----------------------------------------------------------------------------------------------------------\n"); 
              e1.jeddahSuperdome(); 
              b1.calculateTotal(); 
              System.out.println(b1); 
            } 
          case 6 -> { 
              System.out.println( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                       Jeddah Yacht Club\n          -----------------------------------------------------------------------------------------------------------\n"); 
              e1.jeddahYachtClub(); 
              b1.calculateTotal(); 
              System.out.println(b1); 
            } 
          default -> System.out.println("wrong choice!! , please try again "); 
     } 
    
}
    public static void menu(){ 
  System.out.print( "\n          -----------------------------------------------------------------------------------------------------------\n"+ 
                      "                                                         Menu\n          -----------------------------------------------------------------------------------------------------------\n"); 
    System.out.println("This are the events available at the moment"); 
    //System.out.println("To book an event, enter the event number from the list below:"); 
    System.out.println("1- City Walk"); 
    System.out.println("2- Jeddah Pier "); 
    System.out.println("3- Jeddah Art Promenade"); 
    System.out.println("4- Jeddah Jungle"); 
    System.out.println("5- Jeddah Superdome "); 
    System.out.println("6- Jeddah Yacht Club"); 
    System.out.println("To book an event, enter the event number from the list:"); 
    }
    }
    

