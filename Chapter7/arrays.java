import java.util.*;

public class arrays{
    public static void main(String [] args){
        Scanner input= new Scanner(System.in);
        System.out.print("How many number are you giving me? ");
        int size =  input.nextInt();
        int [] numbers= new int[size];
        int sum=0;
        for(int i=0; i<size; i++){
            //How do we go about asking the user for each value?
            System.out.print("What is the number you are giving me? ");
            numbers[i] = input.nextInt();
            sum = sum+numbers[i];
        }
        String arrays= Arrays.toString(numbers);
        System.out.println(arrays);
        int [] otherNumber= Arrays.copyOf(numbers, size);
        //Arrays.fill(otherNumber, 7);
        Arrays.sort(otherNumber);
        System.out.println(Arrays.toString(otherNumber));
        if(Arrays.equals(numbers, otherNumber)){
          System.out.println("THey are the same array");
        }
        else{
          System.out.println("THey are NOT the same array");
        }
        if(Arrays.binarySearch(otherNumber,54) <0){
          System.out.println("The number is not in the Array");
        }
     
      //   double average = (double)sum/size;
      // for(int j =0; j< numbers.length; j++){  // another way to get the sixe of your array
      //   System.out.print(numbers[j]+ ",");
      // }
      // System.out.println("The average is "+ average);


    }
}