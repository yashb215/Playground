import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in = new Scanner(System.in);
      int base = in.nextInt();
      int exponent = in.nextInt();
      System.out.print(power_of_number(base,exponent));
    }
  public static int power_of_number(int base,int exponent)
  {
    int power = 1;
    while(exponent >= 1)
    {
      power = power*base;
        exponent--;
    }
    return power;
  }
}