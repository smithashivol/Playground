import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc= new Scanner(System.in);
    int num =sc.nextInt();
    int first_dig=num/100;
    int sec_dig=((num/10)%10);
    int last_dig=num%10;
    int reverse=(last_dig*100)+(sec_dig*10)+first_dig;
    System.out.println(reverse);
  }
}