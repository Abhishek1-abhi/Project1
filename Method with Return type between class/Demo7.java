class Ellipse
{
static double area()
{
 final double pi=3.142;
        int a=4;
	int b=6;
	double result=pi*a*b;
	return result;
	}
	}
	class Demo7
	{
	public static void main(String[] args)
	{
	double x=Ellipse.area();
	System.out.println(x);
	}
	}