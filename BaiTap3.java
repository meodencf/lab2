
package baiap2;
 
import java.util.Scanner;
public class BaiTap3 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {       
        System.out.print("Nh?p s? �i?n = ");
        float dien = BaiTap3.scanner.nextFloat();  
        BaiTap3.TinhTienDien(dien);
    }  
    public static void TinhTienDien(float dien) {      
        if (dien < 50) {    
            System.out.print("s? ti?n �i?n th�ng n�y l�:" + "ti?n=" +(dien*1000));
        }
        else {
            System.out.print("s? ti?n �i?n th�ng n�y l�:" + "ti?n=" + ((dien-50)*1200));
        }       
    }
}
  