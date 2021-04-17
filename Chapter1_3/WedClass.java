public class WedClass {
    public static void main(String [] args){ 
        boolean testing= conditionalLoop.lessUseless(9, "p");
        System.out.println("This is tetsting  "+ testing);
       String anothereNAme="Percent";
        String name="MAria Suarez"; //name is a String object
    char letter= name.charAt(3);
    System.out.println(letter);
    int index=anothereNAme.indexOf("e");
    System.out.println(index);
    String temp= anothereNAme.substring(index+1);
    System.out.println(temp);
    int tempIdx=temp.indexOf("e")+1;
    tempIdx= tempIdx+index;
    System.out.println(tempIdx);
    int num =31;
    double result = Math.sqrt(num);
    System.out.printf("The answer is %.2f", result );
    }
}
