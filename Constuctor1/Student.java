class Student
{
int Std_id;
double Std_marks;
Student (int a,double b)
{
  Std_id=a;
  Std_marks=b;
  return;
  }
  public static void main(String[] args)
  {
  Student S1=new Student(123,44.6);
  System.out.println(S1.Std_id);
  System.out.println(S1.Std_marks);
  }
  }


