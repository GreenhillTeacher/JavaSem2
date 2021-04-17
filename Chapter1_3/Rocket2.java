/*This is our first program
we will learn how to print using print and println
we will use Srtings
*/

public class Rocket2{
    public static void main(String [] args){     //2 args  in  and out
        // print top          
            TOP();
            Vshape();     //  print V shape
             System.out.println();    // Print a blankline
            Vshape();
   
             TOP();      
             System.out.println();
            TOP();
            BOX();  
             System.out.println("|United|");
             System.out.println("|States|");
            BOX();
            TOP();
             }
        //these are the methods we create
        public static void TOP() {
             System.out.println("   /\\");
             System.out.println("  /  \\");       //  TOP()
             System.out.println(" /    \\");
        }
        public static void Vshape() {
             System.out.println(" \\    /");
             System.out.println("  \\  /");
             System.out.println("   \\/");
            
        }
        public static void BOX() 
        {
            System.out.println("+------+");
            System.out.println("|      |");
            System.out.println("|      |");
            System.out.println("+------+"); 
        }
            
}