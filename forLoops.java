public class forLoops {
    public static final int SIZE=5;  // final means is a constant static constant global
    public static void main(String [] args){
        for(int line= 1; line <=SIZE; line++){ // line is a local variable
            frontDots(line);
            System.out.print(line);
            backDots(line);
            System.out.println();
        }
 
}

public static void frontDots (int line) {  // a method with a parameter
    for(int dots=1; dots<= -line+SIZE; dots++){
        System.out.print(".");
    }
}
public static void backDots (int line) {
    for(int dots=1; dots <= line-1; dots++){
        System.out.print(".");
    }
    
}
}
