/*Author: Grayce Stalowski
Date: 2015
Description: 
Makes a random choice based on the items entered by the user.
The user enters items one at a time(can be multiple words) and types "end" to finish.
The program picks one of the items and displays it to the user.
*/
import java.util.Scanner;
import java.util.*;
public class randomChoice
{
  public static void main(String[]args)
  {

    Vector choices = new Vector(2,1); //Vector that has an initial capacity of 2 and then increases by 1 when it is reached
    System.out.println("Welcome to Grayce's Chooser");
    System.out.println("Enter choices, hitting enter between each one");
    System.out.println("Type \"end\" when you are finished");
    
    Scanner scan = new Scanner(System.in);
    String input=scan.nextLine(); //Get first user input
    
    //While loop to make sure the user enters a valid choice before ending
    while(input.equalsIgnoreCase("end"))
    {
       System.out.println("Enter at least one choice"); 
       input=scan.nextLine();
    }
     
    //Adds the users input to the vector until "end" is typed
    //Vectors are dynamic and work a lot better than arrays since here we do not know how much input to expect
    while(!input.equalsIgnoreCase("end"))
    {
      choices.add(input);
      input=scan.nextLine();
    }
    
    //Makes a random number, multiplies it by the size of the vector, and makes it an int to be used to retrieve the value at that position
    int ranNum= (int)(Math.random() * choices.size());
    System.out.println("You should choose \"" + choices.elementAt(ranNum)+"\"");
    
  }//end main
}//end class