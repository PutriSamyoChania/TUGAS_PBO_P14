import java.util.ArrayList;
import java.util.Scanner;


public class Main_Data_WargaCbn {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer pilihan = 0;
        
        System.out.println("====================================");
        System.out.println("Pendataan dan Pembayaran Iuran Warga");
        System.out.println("====================================");
        System.out.println("1. Input Data Warga");
        System.out.println("2. Input Iuran Warga");
        System.out.println();
        System.out.print("PILIHAN MENU : ");
        pilihan = sc.nextInt();
        System.out.println();
        
        DataWargaCbn k = new DataWargaCbn();
        
        if (pilihan == 1){
            k.warga1();
            //}else if(pilihan == 2){
            k.warga2();
            }
        }
    }