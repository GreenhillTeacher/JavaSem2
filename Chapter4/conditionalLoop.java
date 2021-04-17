/*
Learning about while loops
reviewing Methods
practice if statements
MAria Suarez
02/22/2021
*/
import java.io.PrintStream;
import java.util.*;

public class conditionalLoop {
    private static PrintStream printf;
	public static void main(String [] args){
       boolean test= lessUseless(8,"Grade");
       uselessMethod(2,"Peter", test); //  is static void method (it has not object reference)
                                        // void methos (it does not return values)
        
    }
    public static boolean lessUseless(int num, String name){
        if (num > 7 && name.equalsIgnoreCase("grade")){
            return true;
        }
        return false;
    }
    private static void uselessMethod(int num, String name, boolean test ){
        //check for condition first
        while(test){
            System.out.println("I am useless");
            num ++;
            if(num > 5){
                test = false;
            }
        }
        // run the program once before it checks condition
        do{
            System.out.println("I am who I am");
            num--;
        }
        while(num >9);
        int randomNum= (int)(Math.random()*10000);// give you 0 - 1
        System.out.println(randomNum);

         Random randy = new Random();//creat the Random object
        int num1 = randy.nextInt(100)+1;
         double num2 = randy.nextDouble();
        System.out.println(num1);
        System.out.printf("%.2 ",(num2*100));

    }
        
    
}
