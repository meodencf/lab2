package baiap2;

import java.util.Scanner;
public class bai2 {
    public static void main(String[] args) {
        float n;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("nhap so diem n :");
        n=sc.nextFloat();
        }while(n<0);
        
        while(n<5){
            System.out.println("kem");
            System.exit(0);
        }
        while(n>5 && n<7){
            System.out.println("trung binh");
            System.exit(0);
        }
        while(n>7 && n<8){
            System.out.println("kha");
            System.exit(0);
        }
        while(n>8){
            System.out.println("gioi");
            System.exit(0);
        }
    }
}    
         
    
