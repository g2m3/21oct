package monitorias;
import java.util.Scanner;

public class Monitoria {
    
    public static void main(String[] args) {
        System.out.println("Info");
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese A:");
        int a = sc.nextInt();
        System.out.println("Ingrese B:");
        int b = sc.nextInt();
        System.out.println("Ingrese C:");
        int c = sc.nextInt();
        System.out.println("Ingrese D:");
        int d = sc.nextInt();

        //double a = Math.pow(2,8);
        
        if(b>c&&d>a&&(c+d)>(a+b)&&c>0&&d>0&&a%2==0){
            System.out.println("Valores aceptados");
        } else {
            System.out.println("Valores no aceptados");
        }            
        
        //Math.sqrt(x);
    }    
}
