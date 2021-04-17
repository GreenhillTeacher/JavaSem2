public class steps{
        public static final int STEP=5;
        public static void main(String[]args){
            for(int stp=1; stp<=STEP; stp++){
    Head(stp);
    Body(stp);
    Feet(stp);
     
        }
    bottomline();
    }
    public static void Head(int stp) {
        for(int spaces=1; spaces<=-5*stp+5*STEP; spaces++){
            System.out.print(" ");
        }
        System.out.print(" o  ******");
        for(int space2=1; space2<=5*stp-STEP; space2++){
        
            System.out.print(" ");    
    }
        System.out.println("*");   
    }   
    public static void Body(int stp){
        for(int spaces=1; spaces<=-5*stp+5*STEP; spaces++){
            System.out.print(" ");
        }
        System.out.print("/|\\ *");
        for(int space2=1; space2<=5*stp; space2++){
        
            System.out.print(" ");    
    }
    System.out.println("*");
    }
    public static void Feet(int stp){
        for(int space2=1; space2<=-5*stp+5*STEP; space2++){
        
            System.out.print(" ");    
    }
    System.out.print("/ \\ *");
    for(int space2=1; space2<= 5*stp; space2++){
        System.out.print(" ");
    }
     
    System.out.println("*");
     
    }
    public static void bottomline(){
        for(int k=1; k<=STEP*6+1; k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
     
    }