//Author: Grayce Stalowski
//Date: 5/27/14
//Desctiption: Stack creation and implementation
import java.util.*;

class StackDemo
{
public static void main(String[] args)
{
  //stack has the FIFO methodology push puts something at top, pop removes the most recent off top
  Stack<Integer> myStack = new Stack<Integer>();
  
  myStack.push(8);//add to the stack
  myStack.push(40);//add on top of 8
  myStack.push(80);
  myStack.push(88);
  
  System.out.println("Pop: " + myStack.pop());//take most recent push off the top of the stack
  System.out.println("Peek: " + myStack.peek()); //returns top of stack but keeps it there
  System.out.println("Pop: " + myStack.pop());//take most recent push off the top of the stack
  myStack.push(400);//add to top of stack
  System.out.println("Pop: " + myStack.pop());//take most recent push off the top of the stack
  
}//end main
}//end class

//More info- http://docs.oracle.com/javase/7/docs/api/java/util/Stack.html