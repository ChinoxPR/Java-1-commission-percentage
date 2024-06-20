/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment.pkg2part2;
//import so program can use input in my Program
import javax.swing.JOptionPane;
/**
 *
 * @author johnc
 */
public class Assignment2part2 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      //DECLARING VARIABLES
      int shares;
      float price;
      int commissionPercent;
      
      //Create STRING FOR JOPTIONPANE TO RECYCLE
      String str;
      
      //INPUT
      // ASSIGNING VARIBALES WITH JOPTIONPANE
      str = JOptionPane.showInputDialog("How much shares did you buy?");
      // CONVERT STRING str TO INT shares 
      shares = Integer.parseInt(str);
      
      //STRING str IS REYCLED FOR NEW INPUT
      str = JOptionPane.showInputDialog("How much was the price per share?");
      //CONVERT STRING str TO float price
      price = Float.parseFloat(str);
      
      //String str IS RECYCLE FOR NEW INPUT
      str = JOptionPane.showInputDialog("What was the commission percentage? please place whole number");
      //CONVERT STRING str TO INT commissionPercent
      commissionPercent = Integer.parseInt(str);
      
      //MATH CALCULATIONS FOR OUTPUT
      float totalStockPrice = shares*price;
      float commissionAmount = commissionPercent*totalStockPrice/100;
      float totalAmount = totalStockPrice+commissionAmount;
      
      // OUTPUT
      //String Concatenation
      System.out.println("Kathryn brought "+ shares + " shares of stock at a price "+ price + " per share.\n"+
                         "She must pay her stock-broker a "+commissionPercent+" percent commission for the transaction.\n"+
                         "Write a program that calculate and display the following.\n");
      System.out.println("The amount paid for the stock alone (without the commision): " + totalStockPrice + "\n" );
      System.out.println("The amount of commision : "+ commissionAmount +"\n");
      System.out.println(" The total amount paid (for the stock plus the commision) : "+ totalAmount +"\n");
      
    }
    
}
