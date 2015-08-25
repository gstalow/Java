//Author: Grayce Stalowski
//Date: August 2015
//Reversing a Linked List

import java.util.*;

public class LinkedListReversal{
  
  public static void main(String []args){
  
    //Create 2 linked lists to test, one with many elements, one that only has 1
    LinkedList<String> myList = new LinkedList<String>();
    LinkedList<String> myListZ = new LinkedList<String>(); 
    
    //Add to the list
    myList.add("Apple");
    myList.add("Banana");
    myList.add("Carrot");
    myList.add("Strawberry");
    myList.add("Watermelon");
    
    //Print original and then reversed list
    System.out.println("Old: " + myList);
    System.out.println("Reversed: " + reverseList(myList));
    
    //Add to and then print reversed list
    myListZ.add("Z");
    System.out.println("Z Reversed: " + reverseList(myListZ));
  }//end main
  
  //Method to reverse linked list
  public static LinkedList<String> reverseList(LinkedList<String> myList)
    { 
      //get number of elements in list
      int size=myList.size();
      
      //if list has 0 or 1 elements, no reversal needed
      if(size==0 || size==1)
      {}//do nothing
      else{
        //loop through each element in the list
        for(int count=0;count<size;count++)
        {
          //remove the last element in the list and put it at the current counter position
          //ex: last element goes at 0, 2nd to last at 1,  etx
          myList.add(count,myList.removeLast());
          //System.out.println("Current: " + myList);
        }//end for
      }//end else
      //return the reversed list
      return myList;
    }//end method
  
}//end class