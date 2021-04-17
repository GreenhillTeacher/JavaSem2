import java.util.*;
import java.io.*;
public class anotherFile {
    public static void main(String [] args) throws FileNotFoundException{
    File myFile= new File("C:\\Users\\suarezm\\Documents\\Java\\JavaSem2\\textFile.txt");
    Scanner input = new Scanner(myFile);
    //Read file and print String per line
    while(input.hasNextLine()) {
        Scanner line= new Scanner(input.nextLine());
        while(line.hasNext()){
            if(line.hasNextDouble()){
                String trash= line.next();
            }
            else{
                System.out.print(line.next()+ "  ");
            }

        }
        System.out.println();

    }
}
}


