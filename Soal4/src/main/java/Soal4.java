import java.util.Scanner;

public class Soal4 {
    public static void main (String[] args){
        int n, T1, T2, T3, T4;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Masukkan jumlah item: ");
        n = keyboard.nextInt();
        
        T1 = 500000 - (15-n) * 15 * 50000 / 100;
        T2 = 500000 + n * 10 * 50000 /100;
        T3 = 500000 + n * 25 * 50000 /100;
        T4 = 500000 + n * 35 * 50000 /100;
        
        try{
            if(n >= 0 && n < 15)System.out.println("Total pendapatan agen: Rp " + T1);
            if(n >= 15 && n < 40)System.out.println("Total penjualan agen: Rp " + T2);
            if(n >= 40 && n < 80)System.out.println("Total penjualan agen: Rp " + T3);
            if(n >= 80)System.out.println("Total penjualan agen: Rp " +T4);
        }catch(Exception Outofrange){
            System.out.println("Jumlah tidak valid");
        }
    }
}
