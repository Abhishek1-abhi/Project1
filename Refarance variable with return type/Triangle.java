class Triangle
{
double area()
{
final double a=1/2.0;
        int b=4;
	int h=6;
	double result=a*b*h;
	return result;
	}
	public static void main(String[] args)
	{
	Triangle T1=new Triangle();
	double x=T1.area();
	System.out.println(x);
	}
	}