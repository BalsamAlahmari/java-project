/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.io.*; 
import java.util.Scanner; 
/**
 *
 * @author balso
 */


public class Customer  { 
    private String customerName; 
    private String phoneNumber; 

   
     
    public Customer(){ 
    
    } 
 
    public Customer(String customerName, String phoneNumber) { 
        this.customerName = customerName; 
        this.phoneNumber = phoneNumber; 
    
        
    } 
    
     
    public void setName(String name){ 
        customerName=name; 
     
    } 
            
    public void setPhoneNumber(String phoneN){ 
        phoneNumber=phoneN; 
    }        
    public String getName(){ 
        return customerName; 
    } 
          
    public String getPhoneNumber(){ 
        return phoneNumber; 
    }  
    

        public void filePrint() throws IOException{ 
 FileWriter  file=new FileWriter("Customer.txt",true); 
        PrintWriter output=new PrintWriter(file); 
output.print(this.customerName+"    "+this.phoneNumber+"\n"); 
output.close(); 
} 
        
public void fileRead() throws IOException{ 
File file = new File ("customer.txt"); 
Scanner read = new Scanner(file); 
int num=1;
while (read.hasNext()){ 
String line = read.nextLine(); 
System.out.println(num+"-"+line);
num++;
}
} 
 
    @Override 
    public String toString() { 
        return "[Name:"+getName()+"   Phone Number:"+getPhoneNumber()+"]"; 
    } 
 
}
