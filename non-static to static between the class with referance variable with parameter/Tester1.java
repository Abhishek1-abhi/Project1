class Sample
{
void area(int b,int h)
{
final double a=1/2.0;
      double result=a*b*h;
      System.out.println(result);
      }
      }
      class Tester1
      {
      public static void main(String[] args)
      {
      Sample S1=new Sample();
      S1.area(2,4);
      }
      }
