package baiap2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("+----------+");
        System.out.println("nhap 1 để giải PT bậc 1");
        System.out.println("nhập 2 để giải PT bậc 2");
        System.out.println(" nhập 3 để Tinh tien dien");
        System.out.println("Ket thuc");
        System.out.println("+----------+");
        System.out.println("chon chuc nang");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Giai phuong trinh bac 1");
                GiaiPhuongTrinhBac1();
                menu();
                break;
            case 2:
                System.out.println("Giai phuong trinh bac 2");
                GiaiPhuongTrinhBac2();
                menu();
                break;
            case 3:
                System.out.println("Tinh tien dien");
                TinhTienDien();
                menu();
                break;
            case 4:
                System.out.println("Ket thuc");
                System.exit(0);
                break;
        }

    }

    public static void GiaiPhuongTrinhBac1() {
        float a, b, x;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a:");
        a = sc.nextFloat();
        System.out.println("nhap b");
        b = sc.nextFloat();
        if (a == 0) {
            if (b == 0) {
                System.out.println("vô số nghiệm");
            } else {
                System.out.println("vô nghiệm");
            }
        } else {
            x = -b / a;
            System.out.println("nghiệm của phương trình:" + x);
        }

    }

    public static void GiaiPhuongTrinhBac2() {
        double a, b, c, x, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");
        a = sc.nextDouble();
        System.out.println("nhap b:");
        b = sc.nextDouble();
        System.out.println("nhap c:");
        c = sc.nextDouble();
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("vo so nghiem");
                } else {
                    System.out.println("vo nghiem");
                }
            } else {
                x = -c / b;
                System.out.println("nghiem cua phuong trinh" + x);
            }
        } else {
            delta = b * b - 4 * a * c;
            if (delta <= 0) {
                if (delta < 0) {
                    System.out.println("vo nghiem");
                } else {
                    System.out.println("co nghiem kep");
                    x = -b / (2 * a);
                    System.out.println("x:" + x);
                }
            } else {
                System.out.println("co 2 nghiem phan biet");
                x1 = ((-b) + Math.sqrt(delta) / (2 * a));
                System.out.println("x1:" + x1);
                x2 = ((-b) - Math.sqrt(delta) / (2 * a));
                System.out.println("X2:" + x2);
            }

        }

    }

    public static void TinhTienDien() {
        double soDien, tienDien;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so dien:");
        soDien = sc.nextDouble();
        if (soDien < 50) {
            tienDien = soDien * 1000;
            System.out.println("tien dien trong thang:" + tienDien);

        } else {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
            System.out.println("tien dien trong thang:" + tienDien);
        }
    }
}

