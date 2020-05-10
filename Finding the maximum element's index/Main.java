import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int list[] = new int[n];
    
    for(int index = 0;index<n;index++)
    {
      list[index] = in.nextInt();
    }
    int max_idx = 0;
    for(int idx = 1;idx<=n-1;idx++)
    {
      if(list[max_idx] < list[idx])
      {
        max_idx=idx;
      }
      
    }
    System.out.println(max_idx);
  }
}