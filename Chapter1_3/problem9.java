public class problem9 {
    public static final int SIZE=80;  // final means is a constant static constant global
    public static void main(String [] args){
       topline();
       printWierd();
       printNumbers();
       topline();
        }

public static void topline () {  
    for(int dots=1; dots<= SIZE; dots++){
        System.out.print("-");
    }
    System.out.println();
}
public static void printWierd() {
    for(int i=1; i<= SIZE/4; i++){
        System.out.print("_-^-");

    }
    System.out.println();   
}
public static void printNumbers(){
for (int i =1; i<SIZE/2; i++){
    System.out.print(i%10);
    System.out.print(i%10);
}
}
public static void backDots (int line) {
    for(int dots=1; dots <= line-1; dots++){
        System.out.print(".");
    }
    
}
}
