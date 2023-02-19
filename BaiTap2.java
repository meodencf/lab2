package baiap2;
 
import java.util.Scanner;
public class BaiTap2 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {       
        System.out.print("Nh?p a, a = ");
        float a = BaiTap2.scanner.nextFloat();
        System.out.print("Nh?p b, b = ");
        float b = BaiTap2.scanner.nextFloat();
        System.out.print("Nh?p c, c = ");
        float c = scanner.nextFloat();
        BaiTap2.giaiPTBac2(a, b, c);
    }  
    public static void giaiPTBac2(float a, float b, float c) {      
        if (a == 0) {          
             if(c==0){
                 if(b==0){
                    System.out.println("PT v� s? nghi?m");
                          }
                    else {
                            System.out.println("ph��ng tr?nh v� nghi?m");
                         } 
                         }        
                     else {
                     System.out.println("nghi?p ph��ng tr?nh l�:" + "x =" + (-b/c));
                     }
       }
        else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Ph��ng tr?nh c� 2 nghi?m l�: " + "x1 = " + x1 + " v� x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Ph��ng tr?nh c� nghi?m k�p: "  + "x1 = x2 = " + x1);
        } else {
            System.out.println("Ph��ng tr?nh v� nghi?m!");
        }
        }
}
}
       