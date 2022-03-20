import java.util.*;
abstract class shape{
double x,y;
shape(double a,double b)
{
x=a;
y=b;
}
shape(double a)
{
x=a;
}
abstract double printarea();
}
class rectangle extends shape{
rectangle(double a,double b)
{
super(a,b);
}
double printarea()
{
double c = x*y;
return c;
} 
}
class triangle extends shape{
triangle(double a,double b)
{
super(a,b);
}
double printarea()
{
double d = 0.5*x*y;
return d; 	
}
}
class circle extends shape{
circle(double a)
{
super(a);
}
double printarea()
{
double z = 3.1412*x*x;
return z;	
}
}
class lab4{
public static void main(String args[]) {
shape r;
rectangle r1 = new rectangle(20,20);
triangle r2 = new triangle(10,20);
circle r3 = new circle(10);
r=r1;
System.out.println("area of rectangle"+" "+r1.printarea());
r=r2;
System.out.println("area of triangle"+" "+r2.printarea());
r=r3;
System.out.println("area of circle"+" "+r3.printarea());
}
}