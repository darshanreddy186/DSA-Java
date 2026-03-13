import java.util.*;
import javax.sound.sampled.SourceDataLine;
public class SelectionSorting {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array :");

        int n = sc.nextInt();

        System.out.println("Enter " + n + " values for an array :");

        int[] arr = new int[n];

        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i < n - 1;i++){

            int minindex = i;

            
            for(int j = i + 1; j < n;j++ ){

                if(arr[j] < arr[minindex]){
                    minindex = j;
                }
                
            }

            int temp = arr[i];
            arr[i] = arr[minindex];
            arr[minindex] = temp;    
        }

        

         System.out.println("This is the Sorted arry using Selection sorting technique :");  
         
         for(int i = 0; i < n; i++){

            System.out.println(arr[i]);

         }



        
    }

        

        
}

    

