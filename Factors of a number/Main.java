import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner s=new Scanner(System.in);
      int num =s.nextInt();
      for(int f=1;f<=num;f++)
      {
        if(num % f==0)
       System.out.println(f);
      }
	}
}