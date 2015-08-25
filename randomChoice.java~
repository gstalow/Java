/*Author: Grayce Stalowski
Date: 2015
Description: 
Makes a random choice based on the items entered by the user.
The user enters items one at a time(can be multiple words) and types "end" to finish.
The program picks one of the items and displays it to the user.
*/
import java.util.Scanner;
public class randomChoice
{
  public static void main(String[]args)
  {
    int size=100; //Change this number to change the max number of choices someone can enter
    int x=0; //Variable to keep track of the array position

    String[] choices = new String[size]; //The array
    System.out.println("Welcome to Grayce's Chooser");
    System.out.println("Enter up to " + size + " choices, hitting enter between each one");
    System.out.println("Type \"end\" when you are finished");
   
    Scanner scan = new Scanner(System.in);
    String input=scan.nextLine(); //Get first user input
    
    //While loop to make sure the user enters a valid choice before ending
    while(input.equalsIgnoreCase("end"))
    {
       System.out.println("Enter at least one choice"); 
       input=scan.nextLine();
    }
     
    //Adds the users input to the array until "end" is typed
    while(!input.equalsIgnoreCase("end"))
    {
      choices[x]=input;
      input=scan.nextLine();
      x++;
    }
    
    //Makes a random number, multiplies it by the size of the array, and makes it an int to be used to retrieve the value at that array position
    int ranNum= (int)(Math.random() * x);
    System.out.println("You should choose \"" + choices[ranNum]+"\"");
    
  }//end main
}//end class