package Soal5;

import java.util.Scanner;


public class Soal5 {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        String a, b, c, d;
        
        System.out.println("Masukkan plat kesatu: ");
        a= keyboard.nextLine();
        
        System.out.println("Masukkan plat kedua: ");
        b= keyboard.nextLine();
        
        System.out.println("Masukkan plat ketiga: ");
        c= keyboard.nextLine();
        
        System.out.println("Masukkan plat keempat: ");
        d= keyboard.nextLine();
        
        //int total = Integer.valueOf(String.valueOf(a) + String.valueOf(b)+String.valueOf(c) + String.valueOf(d));
        //int all = total - 999999;
        //int mod = all % 5;
        String united= a+b+c+d;
        long all = Long.parseLong(united);
        
        Long lastOP = (all-999999)%5;
        
        if(lastOP == 0){
            System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
        
    }
}
