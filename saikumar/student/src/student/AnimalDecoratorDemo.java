package student;


interface Animal 
{
public void describe();
}
class Deer implements Animal 
{
public void describe() 
{
System.out.println("\nI am Deer.");
}
}
class Parrot implements Animal 
{
public void describe() 
{
System.out.println("\nI am Parrot.");
}
}
class Snake implements Animal 
{
public void describe() 
{
System.out.println("\nI am Snake.");
}
}
abstract class AnimalDecorator implements Animal 
{
Animal animal;
public AnimalDecorator(Animal animal) 
{
this.animal = animal;
}
public void describe() 
{
animal.describe( );
}
}
class LegDecorator extends AnimalDecorator
{
public LegDecorator(Animal animal) 
{
super(animal);
}
public void describe() 
{
animal.describe();
System.out.println("I have legs.");
dance();
}
public void dance() 
{
System.out.println("I can dance.");
}
}
class WingDecorator extends AnimalDecorator 
{
public WingDecorator(Animal animal) 
{
super(animal);
}
public void describe() 
{
animal.describe();
System.out.println("I have wings.");
fly();
}
public void fly() 
{
System.out.println("I can fly.");
}
}
class CrawlDecorator extends AnimalDecorator 
{
public CrawlDecorator(Animal animal) 
{
super(animal);
}
public void describe() 
{
animal.describe();
System.out.println("I will Crawl.");
crawl();
}
public void crawl() 
{
System.out.println("I can move.");
}
}
public class AnimalDecoratorDemo 
{
public static void main(String[] args) 
{
Animal animal;
animal = new LegDecorator(new Deer( ));
animal.describe();
animal = new WingDecorator(new Parrot( ));
animal.describe();
animal = new CrawlDecorator(new Snake( ));
animal.describe();
}
}
