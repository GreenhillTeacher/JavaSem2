/*This is our first program
we will learn how to print using print and println
we will use Srtings
*/

public class PlayingWithNumbers{
    public static final double tax=0.08; //staic constant (final)   global constant
    public static final double tips=20.0/100; //staic constant (final)

    public static void main(String [] args){     //2 args  in  and out
    //   int num1 = 1342791424;
    //   int num2 = 2;
    //   for(int i=0; i<7; i++ ){
    //     System.out.print ("The number is = "+ num1);// it will truncate the decimal part
    //     System.out.println(" The last number is "+ (num1%100));
    //     num1 = num1/100;
    //   }
    //   System.out.println(2+1+ " I am happy "+ 2+3);
    //   System.out.println(2+1+ " I am happy "+ (2+3));
    //   double bill1= 23.89;
    //   double bill2= 34.45;
    //   double bill3= 41.29;
    //   double sum=bill1+bill2+bill3;  //local variables
    //   System.out.println(" The total is  "+ sum);
    //   taxes(sum);    // we can send values to a method
    //   System.out.println(" THe tips:     "+ sum*tips);

    for(int line=1; line <= 5; line++){   // control the number of lines
        
        for(int star=0; star < line; star ++){   // control the number of stars
            System.out.print("*");
        }
        System.out.println();
    }

    }
    public static void taxes(double summer){
        double taxes = summer*tax;
        System.out.println(" THe taxes:    "+ taxes);
    }
}