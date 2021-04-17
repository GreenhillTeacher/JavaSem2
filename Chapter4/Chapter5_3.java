import java.util.*;
public class Chapter5_3 {
    /*
    3. Write a method called toBinary that accepts an integer as a parameter and returns a String containing that
integer’s binary representation. For example, the call of printBinary(44) should return "101100".
44%2 0
22%2 0
11%2 1
5%2 1
2%2 0
1

*/
public static void main(String [] args){
    Scanner keyboard = new Scanner(System.in);
    System.out.println("What is the number to change to Binary ");
    int number = keyboard.nextInt();
    convertToBinary(number);
}
public static void convertToBinary(int num){
    int bin=0;
    
    int factor=1;
    while( num >= 1) {
        int temp  = num%2 * factor;
        num = num /2;
        bin = bin +temp;
        factor *=10;
        System.out.println(num);
    }
    System.out.println (bin);

    }

} 

