//Author: Grayce Stalowsk
//5/29/14
//Description: Reading a file using a buffered reader and showing try, catch, and finally blocks

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class FileBufferReadExceptions
{
  public static void main(String[]args)
  {
    
    BufferedReader br = null; //sets up variable name so it isn't stuck only in try block
    String fileName = "out.txt";
   
    try //put code here that throws an exception. You try this and if it doesn't work it runs the catch
    {
      String line;
      //can't directly pass the file name so use FileReader to do so
       br = new BufferedReader(new FileReader(fileName));
       
       //while the string is passed a line from that file that isn't null
       while ((line = br.readLine()) !=null)
       {
         System.out.println(line);
       }
    }//end try block
    
    catch (IOException e) 
    {
      e.printStackTrace();//helps identify where the exception occured
      System.out.println("Error opening the file " + fileName);
    } 
    
    finally //always runs when try exits
    {
      try //see if the file was read successfully and close if it was 
      {
        if (br != null)
          br.close();
      } 
      catch (IOException ex) //if not read successfully print the stackTrace
      {
        ex.printStackTrace();
      }
    }//end finally
    
  }//end main
}//end class