package baiap2;
import java.util.Scanner;
public class bai1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap n");
        n=sc.nextInt();
        float kq=(float)Math.sqrt(n);
        if(kq==(int)kq){
            System.out.println("la so chinh phuong");
        }else{
            System.out.println("khong la so chinh phuong");
        }  
    }     
}