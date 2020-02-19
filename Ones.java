
import java.util.Scanner;

public class Ones{
public static void main(String[] args)
{
int count = 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 1st num ");
int num1=sc.nextInt();
System.out.println("enter 2nd num ");
int num2=sc.nextInt();
    for(int i = num1; i<=num2; i++)
    {
        String number = String.valueOf(i);
        while(number.contains("1"))
        {
            number= number.substring(number.indexOf("1")+1);
            count++;
        }
    }
    System.out.println(count);
}
}

