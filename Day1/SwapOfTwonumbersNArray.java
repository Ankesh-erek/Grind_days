import java.util.Scanner;
public class SwapOfTwonumbersNArray {
    public static void main(String[] Args){
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Enter the size of an array");
       int size = scan.nextInt(), i ;
       int Arr[] = new int[size] ;
       for( i= 0; i<size; i++){
        Arr[i] = scan.nextInt();
       }
       //int Arr[] = { 3,4,5,6,7,8};
       int arr[] = new int[Arr.length];
       //int N = Arr.length ;
       int n = Arr.length/2;

       for( i=0; i<n; i++){
        arr[i] = Arr[i];
       }
       for( i=0; i<n; i++){
        Arr[i] = Arr[size-1-i];
       }
       for( i=0; i<n; i++){
        Arr[size-1-i]=arr[i];
       }
       for( i=0; i<size; i++){
         System.out.println(Arr[i]);
        }       


    }
}










//https://www.youtube.com/shorts/aBUHVOzCUVE