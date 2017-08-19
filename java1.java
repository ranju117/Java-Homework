import java.util.Scanner;
public class HelloWorld{

     public static void main(String []args)
     {
         int r1,r2,c1,c2;
        System.out.println("Enter coeff for real and imag for 1");
        Scanner s=new Scanner(System.in);
        r1=s.nextInt();
        c1=s.nextInt();
        Complex a=new Complex(r1,c1);
        
        System.out.println("Enter coeff for real and imag for 1");
        r2=s.nextInt();
        c2=s.nextInt();
        Complex b=new Complex(r2,c2);
        
        Complex c=new Complex();
        c.add(r1,r2,c1,c2);
        Complex d=new Complex();
        d.subtract(r1,r2,c1,c2);
        
        System.out.println(c);
        System.out.println(d);
     }
}
