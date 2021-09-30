import java.util.Scanner;
//import java.util.StringTokenizer;

public class Soal1 {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan kalimat: ");
        String S = keyboard.nextLine();
        
        String[] strings = S.split("[ '!?,._@]+");
        System.out.println(strings.length);
        for (String str : strings)System.out.println(str);
      }
       
    }

