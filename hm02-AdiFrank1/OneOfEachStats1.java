public class OneOfEachStats1 {
public static void main(String[] args) 
{
boolean g = false;
boolean b = false;
double num = Double.parseDouble(args[0]);
double bORg = (double) ((Math.random () * (1-0))+0);
double countChild = 0;
int current=0;
int family2=0;
int family3=0;
int family4=0;

for (int i=0;i<=num;i++)
{
	while (g==false || b==false)
{
	if (bORg<0.5)
		{g = true;
		System.out.print(" g ");}
	if (bORg>=0.5 && bORg<1 )
		{b = true;
		System.out.print(" b ");}

		current++;
		countChild++;
		bORg = (double) ((Math.random () * (1-0))+0);
	}


		if (current==2)
			family2++;
		if (current==3)
			family3++;
		if (current>=4)
			family4++;

		g = false;
		b = false;
		current = 0;
}

System.out.println(" ");
double avg = countChild/num;
System.out.println("Average: " +avg+ " children  get at least one of each gender.");
System.out.println("number of families with 2 childern: " + family2);
System.out.println("number of families with 3 childern: " + family3);
System.out.println("number of families with 4 or more children: " + family4);

if ((family2>family4) && (family2>family3))
	System.out.println ("the most common number of children is 2.");
else
	if ((family3>family4) && (family3>family2))
	System.out.println ("the most common number of children is 3.");
else
	System.out.println ("the most common number of children is 4 or more.");


}
}
