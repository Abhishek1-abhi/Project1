class Sample2
{
int y=10;
}
class Demo2 extends Sample2
{
void cool()
{
System.out.println("i am cool");
}
}
class Tester2 extends Demo2
{
void cool()
{
System.out.println("i am cool");
}
int x=90;
}
class Mainclass2
{
public static void main(String[] args)
{
Tester2 t1=new Tester2();
System.out.println(t1.x);
System.out.println(t1.y);
t1.cool();
}
}