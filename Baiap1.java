
package baiap2;
import java.util.Scanner;
    
public class Baiap1 {
    private static Scanner scanner = new Scanner(System.in);   
    
    public static void main(String[] args) {           
        System.out.print("Nh?p h? s? b?c 1, a = ");
        float a = Baiap1.scanner.nextFloat();
        System.out.print("Nh?p h?ng s? t? do, b = ");
        float b = Baiap1.scanner.nextFloat();
        Baiap1.giaiPTbac1(a,b);
    } 
    public static void giaiPTbac1(float a, float b){       
       if(a==0){
           if(b==0){
               System.out.println("PT v� s? nghi?m");
            }
            else {
                System.out.println("Ph��ng tr?nh v� nghi?m");
            } 
       } 
       else {
            System.out.println("nghi?m c?a ph��ng tr?nh l�" + "x =" + (-b/a));
        }
    }
}

    
