public class OneOfEach {
public static void main(String[] args) 
{
boolean g = false;
boolean b = false;
double bORg = (double) ((Math.random () * (1-0))+0);

int countChild = 0;
while (g==false || b==false)
{
	if (bORg<0.5)
		{g = true;
		System.out.print(" g ");}
	if (bORg>=0.5 && bORg<1 )
		{b = true;
		System.out.print(" b ");}

		countChild++;
		bORg = (double) ((Math.random () * (1-0))+0);
}
	System.out.println ("you made it ... and you have " + countChild + " children");
	}
	}