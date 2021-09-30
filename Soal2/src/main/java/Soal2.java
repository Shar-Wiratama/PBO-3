import java.util.Scanner;
//import java.io.PrintStream;  

public class Soal2 {
    static public void main(String [] args){
        Scanner k = new Scanner(System.in);
        String[] alfabet = new String[3];
        int[] numeric = new int [3];
        
        for(int i=0; i < alfabet.length; i++){
            alfabet[i] = k.next();
            numeric[i] = k.nextInt();
        }
        System.out.println("====================");
        for(int j=0; j<alfabet.length; j++){
            System.out.printf("%-14s   %03d\n", alfabet[j], numeric[j]);
        }
        System.out.println("====================");
    } 
}
