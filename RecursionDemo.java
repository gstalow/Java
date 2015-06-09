//Author: Grayce Stalowski
//Date 5/30/14
//Description: Recurion Demo
//Recursion is when the method calls itself so it repeats until a condition is met that stops the call (base case)

class RecursionDemo
{
 public static void main(String[]args)
 {
   System.out.println("Recursion Demo");
   countDown(5);//calls the recursive method
 }//end main
 
 public static void countDown(int num) //make method
 {
   if (num<=0) //base case
   {System.out.println();} //when <=0 it just prints a new line and ends recursive call
   else//if above 0 it prints and calls again
   {
     System.out.print(num + " ");
     countDown(num-1);//calls methos again-recursive part
   }//end else
 }//end recursive method
 
}//end class