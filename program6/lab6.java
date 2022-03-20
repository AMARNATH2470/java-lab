import cie.*;
import see.*;
import java.util.Scanner;
class lab6{
public static void main(String args[])
{
int i,j,n;
Scanner sc = new Scanner(System.in);
int total[] = new int[3];
System.out.println("enter number of students:");
n=sc.nextInt();
cie.students s[] = new cie.students[n];
cie.internals ci[] = new cie.internals[n];
see.externals se[] = new see.externals[n];
for(i=0;i<n;i++)
{
System.out.println("enter student"+(i+1)+"details");
s[i] = new cie.students();
s[i].accept();
ci[i] = new cie.internals();
ci[i].accept();
se[i] = new see.externals();
se[i].accept();
}
for(i=0;i<n;i++)
{
System.out.println("details of student"+(i+1));
s[i].display();
for(j=0;j<3;j++)
{
total[j] = ci[i].ciem[j]+se[i].seem[j];
System.out.println("total marks in subject"+(j+1)+":"+total[j]);
}
System.out.println();
}
}
}
