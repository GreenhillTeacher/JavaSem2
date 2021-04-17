import java.util.*;
import java.io.*;
public class ReadingFiles {
    public static void main(String [] args) throws FileNotFoundException{
        File myFile= new File("C:\\Users\\suarezm\\Documents\\Java\\JavaSem2\\weather.txt");
        Scanner input = new Scanner(myFile);
        double temp1=0;
        if(input.hasNextDouble()){
             temp1=input.nextDouble();
        }
        double temp2=0;
        double change=0;
        PrintStream output= new PrintStream(new File("testinFile.txt"));//myFile2
        while (input.hasNext()){
            // Scanner line = new Scanner(input.nextLine());
                if(input.hasNextDouble()){
                     temp2= input.nextDouble();
                     change =temp2-temp1;
                     output.printf("%.1f  to  %.1f , change =  %.1f \n",temp1,temp2,change);
                     temp1=temp2;
                }
                else{
                    String trash = input.next();
                }
            
            }
            input.close();
            //File myFile2= new File("testing2.txt");

        }

    }
    

