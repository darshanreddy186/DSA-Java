import java.util.Scanner;

public class FrequencyofElementsinanArray {

    
public static void main(String []args){
    
    Scanner  sc = new Scanner(System.in);


    System.out.println("Enter the size of the array :");

    int num = sc.nextInt();

    System.out.println("From 0 till where does the numbers be added in the array :");

    int n = sc.nextInt();



     int[] arr= new int[num];


     System.out.println("Enter"+ num + "numbers into the array one by one :");

     for(int i = 0;i <num; i++){
        arr[i] =  sc.nextInt();
     }

     System.out.println("The original array entered :");

     for(int i = 0;i < num; i++){
        System.out.println(arr[i]);
     }


     int[] tem= new int[n + 1];

     for(int i = 0;i <num; i++){
        tem[arr[i]]++;
     }

     
     System.out.println("numbers in the array :");


     for(int i = 0;i <= n; i++){
        System.out.println("No of" + i + "s in the entered array are " + tem[i]);
     }

        

}
    
}
