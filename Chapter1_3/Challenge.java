public class Challenge{
    public static final int SIZE=16;
    public static void main(String []args){
        dashline();
        TOP();
        LOW();
    }
    public static void dashline(){
        System.out.print("#");
        for (int dash=1; dash <= SIZE*4; dash ++){
            System.out.print("=");
        }
        System.out.println("#");  
    }
    public static void TOP(){
        for (int line = 1; line <= SIZE; line++){
            System.out.print("|");    
            spaceTop(line);
            System.out.print("<>");
            for(int dots=1; dots <=4*line-4; dots++){
                System.out.print(".");
           } 
           System.out.print("<>");
           spaceTop(line);
           System.out.println("|");
    }
    }
     public static void spaceTop(int line){
        for(int space=1; space <=-2*line+2*SIZE; space++){
            System.out.print(" ");
       }
     }
    public static void LOW(){
        for (int line = 1; line <= SIZE; line++){
            System.out.print("|");    
            spaceLow(line);
            System.out.print("<>");
            for(int dots=1; dots <=-4*line+4*SIZE; dots++){
                System.out.print(".");
           } 
           System.out.print("<>");
           spaceLow(line);
           System.out.println("|");
    }
    }
    public static void spaceLow(int line){
        for(int space=1; space <=2*line-2; space++){
            System.out.print(" ");
       }
     }
}