package baiap2;

import java.util.Arrays;

import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap so luong phan tu: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("nhap phan tu: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        } 
        System.out.print("Nhap x de xoa: ");
        int x = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
        }    
        Arrays.sort(arr);       
        System.out.print("mang sau khi xoa" + x );
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}