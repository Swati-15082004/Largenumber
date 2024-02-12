import java.util.Arrays; 
 

public class largeno {
      
    public static void main(String[] args){ 
        int arr[] = {15, 324, 45, 190, 9858}; 
         
        
          int max = Arrays.stream(arr).max().getAsInt(); 
       
        System.out.println("Largest in given array is " +max); 
    } 
 
} 
