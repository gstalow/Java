//Author: Grayce Stalowski
//Date: August 2015
//Rotation problem as presented by interviewcake.com
//Problem: Array of words in alphabetical order starts mid dictionary word list and eventually goes back to the beginning.
//EX: elephant, fish, gorilla, ape, bear
//find the point where it rotates back to the beginning and return it

public class Rotation{
    public static void main (String []args)
    {
      //make the array
      String[] words = {"ptolemaic","retrograde","supplant","undulate","xenoepist","asymptote"}; 
      //print return from method call, parameters are the array and the starting midpoint
      System.out.println("words is rotated at index: " + findRotationBS(words,words.length/2));
      
      String[] fruit = {"strawberry", "watermelon", "apple", "banana", "carrot", "lemon", "orange"};
      System.out.println("fruit is rotated at index: " + findRotationBS(fruit,fruit.length/2));
      
    }//end main
        
    //method to find the rotation index and return it, binary search like method
    public static int findRotationBS(String[] words, int middle){
      //if current word is above 1st word alphabetically it is still on 1st half
      //else it is 2nd half
      //compare the middle word to the 1st word, <0 means less alphabetically, >0 means greater
      if(words[middle].compareTo(words[1])<0)
      {
        //middle word is less than the 1st so it could be rotation point
          if(words[middle].compareTo(words[middle-1])>0)
            //middle word is greater than the one before it so a word before is rotation point
          {
            //recall the method with a new mid point (search 1st half only)
           return findRotationBS(words,middle/2);
          }
            else
            {}//word before it is greater so the middle word is the rotation point
      }//end if
        else{
          //the middle word is greater than the first word (it is in the 2nd half)
          //recall the method with a new midpoint (search 2nd half only)
           return findRotationBS(words,(middle+words.length)/2);  
         }
      return middle;
    }//end method
        
   
}//end class