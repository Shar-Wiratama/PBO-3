package Soal6;

import java.math.BigInteger;
import java.util.Scanner;

class Biginteger {
    public static void main(String[] args){
    BigInteger a, b, plus, multiple;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Masukkan nilai a: ");
    a= keyboard.nextBigInteger();
    
    System.out.println("Masukkan nilai b: ");
    b= keyboard.nextBigInteger();
    
    plus = a.add(b);
    System.out.println("a + b= " +plus);
    multiple = a.multiply(b);
    System.out.println("a * b= " +multiple);
    
    }
}