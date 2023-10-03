import java.util.Scanner;
public class DataTypeSize {
    
    public static void main(String[] Args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your data type");
        String input = scan.nextLine();
        switch(input){
        case "integer":
            System.out.println(4);
            break;

        case "long":
            System.out.println(8);     
            break;   

        case "float":
            System.out.println(4);     
            break;  
            
        case "double":
            System.out.println(8);     
            break;  
            
        case "character":
            System.out.println(1);     
            break;   
        
        default:
            System.out.println("All letter should be in lowercase with correct data type");                
    }
    


}
}