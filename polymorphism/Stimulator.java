class Animal
{
void noise()
{
System.out.println("some noise");
}
}
class Cat extends Animal
{
void noise()
{
System.out.println("mev mev");
}
}
class Dog extends Animal
{
	void noise()
	{
System.out.println("Bow Bow");
}
}
class Snake extends Animal
{
void noise()
{
System.out.println("buss buss");
}
}
class Stimulator
{
static void Ansim(Animal A1)
{
A1.noise();
}
}
class Mainclass
{
public static void main(String[] args)
{
Cat c1=new Cat();
Dog d1=new Dog();
Snake s1=new Snake();
Stimulator.Ansim(c1);
Stimulator.Ansim(d1);
Stimulator.Ansim(s1);
}
}

