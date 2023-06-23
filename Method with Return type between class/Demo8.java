class Sector
{
static double area()
{
 final double t=30.5;
 final double a=1/2.0;
       int r=10;
       double result=a*r*r*t;
       return result;
       }
       }
       class Demo8
       {
       public static void main(String[] args)
       {
       double x=Sector.area();
       System.out.println(x);
       }
       }