
public class father
{
private void atm()
{
System.out.println("dad ka atmuuu");
}
 void car()
 {
 System.out.println("dad ka caruuu");
 }
 protected void bike()
 {
 System.out.println("dad ka bikuu");
 }
 public void cycle()
 {
 System.out.println("dad ka cycle");
 }
}
public class Son
	{
	public static void main(String [] args)
		{
		father f1=new father();
		f1.car();
		f1.bike();
		f1.cycle();
		}
	}
