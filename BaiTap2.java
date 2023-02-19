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
                    System.out.println("PT vô s? nghi?m");
                          }
                    else {
                            System.out.println("phýõng tr?nh vô nghi?m");
                         } 
                         }        
                     else {
                     System.out.println("nghi?p phýõng tr?nh là:" + "x =" + (-b/c));
                     }
       }
        else {
            float delta = b*b - 4*a*c;
            float x1;
            float x2;
            if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phýõng tr?nh có 2 nghi?m là: " + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phýõng tr?nh có nghi?m kép: "  + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phýõng tr?nh vô nghi?m!");
        }
        }
}
}
       