class Sample
{
double area()
{
 final double a=1/2.0;
        int b=4;
	int h=6;
	double result=a*b*h;
	return result;
	}
	}
	class Demo
	{
	public static void main(String[] args)
	{
	Sample S1=new Sample();
	double x=S1.area();
	System.out.println(x);
	}
	}

