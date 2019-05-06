import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int f_digi=n/100;
    int s_digi=((n/10)%10);
    int last_digi=n%10;
    int reverse=(last_digi*100+s_digi*10+f_digi);
    System.out.println(reverse);
    //Type your code here
  }
}