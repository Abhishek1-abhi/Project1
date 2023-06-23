class Trapezoid
{
static double area()
{
 final double r=1/2.0;
       int a=4;
       int b=6;
       int h=8;
       double result=r*(a+b)*h;
       return result;
       }
       }
       class Demo5
       {
       public static void main(String[] args)
       {
       double x=Trapezoid.area();
       System.out.println(x);
       }
       }
