package see;
import cie.*;
import java.util.Scanner;
public class externals extends cie.students{
Scanner sc = new Scanner(System.in);
public int seem[]=new int[3];
public void accept()
{
for(int i=0;i<3;i++)
{
System.out.println("enter see marks of subject"+(i+1));
seem[i] = sc.nextInt();
}
}
}