/* MAria Suarez
02/08/2021
We are going to learn how to use the Scanner for user input
if/else statements 
BMI 
*/
import java.util.*;
 public class conditional_Scanner{

    //String  reference to the object
    //Math    collection of static methods Math.sqr
    //Scanner reference to object
    //Random  reference to object'

     public static void main(String [] args){
       
     Scanner keyboard= new Scanner(System.in);
     System.out.print("Give me a word  ");
     String word = keyboard.nextLine();
    if (word.length()%2 == 0){
        evenWordMethod(word);
    }
    else{
        oddWordMethod(word);
    }

}
public static void evenWordMethod(String evenWord){
//   "01234567"    8 letter
//    examples
String temp="";
for (int even=0; even < evenWord.length(); even+= 2){
temp = temp + evenWord.charAt(even+1)+ evenWord.charAt(even);
}
System.out.println(temp);
}
public static void oddWordMethod(String oddWord){

}
 }
