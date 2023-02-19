package baiap2;
import java.util.Scanner;
public class bai3 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("nhap n");
            n=sc.nextInt();
        }while(n<0);
        int giaiThua=1;
        if(n==0 || n==1){
            System.out.println("khong co gia tri");
        }else{
            for(int i=2;i<=n;i++){
                giaiThua*=i;
                System.out.println(n + "! = " + giaiThua);
            }
        }   
    }
}