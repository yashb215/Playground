import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int r;
      int sum = 0;
      int m;
      m=n;
      while(n>0)
      {
        r=n%10;
        n=n/10;
        sum = sum + r*r*r;
      }
      if(sum==m)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
        System.out.println("Not a Armstrong Number");
      }
        
	}
}