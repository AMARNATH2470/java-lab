import java.lang.*;
import java.util.*;
class Score{
     String usn;
     String name;
    int n;
    int totalcredits=0;
    int credits[];
    double marks[];
    double sgpa = 0;
    Scanner sc = new Scanner(System.in);
    
    void accept()
    {
        System.out.println("enter usn:");
        usn=sc.nextLine();
        System.out.println("enter name:");
        name=sc.nextLine();
        System.out.println("enter no. of subjects:");
        n=sc.nextInt();
        credits=new int[n];
        marks=new double[n];
        System.out.println("enter details of subjects:");
        for(int i=0;i<n;i++)
        {
            System.out.println("enter credits of subject:"+(i+1));
            credits[i]=sc.nextInt();
            System.out.println("enter marks of subjects:"+(i+1));
            marks[i]=sc.nextDouble();
            cal(credits[i],marks[i],i);
        }
}
        void cal(int c,double m,int a)
        {
            totalcredits+=c;
            if(m>90 && m<=100)
            sgpa = sgpa+(10*c);
            else if(m>80 && m<=90)
            sgpa = sgpa+(9*c);
            else if(m>70 && m<=80)
            sgpa = sgpa+(8*c);
            else if(m>60 && m<=70)
            sgpa = sgpa+(7*c);
            else if(m>50 && m<=60)
            sgpa = sgpa+(6*c);
            else
            System.out.println("failed in subject"+(a+1));
        }
        
        void display()
        {
            System.out.println("usn "+usn);
            System.out.println("name "+name);
            System.out.println("SGPA "+(sgpa/totalcredits));
        }
    }

class lab2{
    public static void main(String args[])
    {
        Score s1 = new Score();
        s1.accept();
        s1.display();
    }
}