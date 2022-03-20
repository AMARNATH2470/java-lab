package cie;
import java.util.Scanner;
public class internals extends cie.students
{
Scanner sc = new Scanner(System.in);
public int ciem[] = new int[3];
public void accept(){
for(int i=0;i<3;i++){
System.out.println("enter cie marks of student" +(i+1));
ciem[i] = sc.nextInt();
}
}
}