import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
       Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
      for(int i = 0;i<= arr_size - 1;i++)
      {
        arr[i] = in.nextInt();
      }
      int max_no = arr[0];
      for(int i = 1;i <= arr_size - 1;i++)
      {
        if(max_no<arr[i])
        {
          max_no = arr[i];
          
        }
      }
     System.out.println(max_no);
      }
      
    }
