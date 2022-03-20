package cie;
import java.util.Scanner;
public class students{
Scanner sc = new Scanner(System.in);
public String usn,name;
public int sem;
public void accept(){
System.out.println("enter usn:");
usn = sc.nextLine();
System.out.println("enter your name:");
name = sc.nextLine();
System.out.println("enter sem:");
sem = sc.nextInt();
}
public void display(){
System.out.println("Name:"+name);
System.out.println("usn:"+usn);
System.out.println("sem:"+sem);
}
}