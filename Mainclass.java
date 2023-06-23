class Whatsapp
{
	void send(int no)
	{
		System.out.println("The number is"+no);
	}
	void send(String textmsg)
	{
		System.out.println("The text msg is"+textmsg);
	}
	void send(int no,String textmsg)
	{
		System.out.println("The number is"+no+"The msg"+textmsg);
	}
	void send(String textmsg,int no)
	{
		System.out.println("The msg is" +textmsg+ "number is"+no);
	}
}
public class Mainclass
{
	public static void main(String[] args)
	{
		Whatsapp w=new Whatsapp();
		w.send(10);
		w.send("hello");
		w.send(10,"hello");
		w.send("hello",10);
	}

}