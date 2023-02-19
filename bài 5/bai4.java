package baiap2;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap phan tu: ");
        int n = sc.nextInt(); 
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt(); 
        }
        int x = sc.nextInt(); 
        int[] b = new int[n]; 
        int k = 0; 
        for (int i = 0; i < n; i++) {
            if (a[i] != x) {
                b[k] = a[i]; 
                k++; 
            }
        }
        if (k == 0) { 
            System.out.println("Khong co phan tu nao khac " + x);
        } else { // nếu có phần tử
            System.out.print("Mang sau khi xoa phan tu " + x + " la: ");
            for (int i = 0; i < k; i++) {
                System.out.print(b[i] + " "); 
            }
        }
        sc.close(); 
    }
}
