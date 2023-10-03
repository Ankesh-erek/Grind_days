import java.util.Scanner;
public class AreaOfCircRect {
    
    public static void main(String[] Args){
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your option , press 1 or 2 ");
        int option = Scan.nextInt() ;

        switch(option){
            case 1 :
            System.out.println("Enter the length of radius");
            int radius = Scan.nextInt();
            double area = 3.14 * radius;
            System.out.println("Area of circle = " +  area);
            break;
            case 2 :
            System.out.println("Enter the parameter of rectangle");
            int parameter[] = new int [4];
            for (int i = 0 ; i<2 ; i++){
                parameter[i] = Scan.nextInt();             
            }  
            int Area = parameter[1]*parameter[0];
            System.out.println("Aream of rectangle = " + Area);
        }
    }
}
