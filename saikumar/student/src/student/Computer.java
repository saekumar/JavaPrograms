package student;
abstract class Assemle
{
	public void Assembleproced()
	{
		cabin();
		ChooseMotherBoard();
		ChooseProcessor();
		powerSupply();
		
		
	}
	abstract public void ChooseMotherBoard();
	abstract public void ChooseProcessor();
	public void cabin()
	{
		System.out.println("choose a proper cabin\n");
	}
	public void powerSupply()
	{
		System.out.println("choose suitable power supply\n\n");
	}
}
class Lowendcompu extends Assemle
{
	public void ChooseMotherBoard()
	{
		System.out.println("Choose lowend Mother board\n");
	}
	public void ChooseProcessor()
	{
		System.out.println("Choose lowend Processor\n");
	}
}
class Highndcompu extends Assemle
{
	public void ChooseMotherBoard()
	{
		System.out.println("Choose Highend Mother board\n");
	}
	public void ChooseProcessor()
	{
		System.out.println("Choose Highend Processor\n");
	}
}

public class Computer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assemle a;
		a=new Lowendcompu();
		a.Assembleproced();
		
		a=new Highndcompu();
		a.Assembleproced();
			
		
	}

}
