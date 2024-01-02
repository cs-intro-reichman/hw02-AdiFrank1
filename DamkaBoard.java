public class DamkaBoard {
public static void main(String[] args) 
{
int num = Integer.parseInt(args[0]);
int i=0;

while (i<num)
{
	int r = 0;
	while (r<num)
	{
	if (i%2 !=0 && r== num-1)
	{	
		System.out.print ("*");
}
	else 
{	
	System.out.print ("* ");
}
	r++;
}

	if (i%2==0)
	{	
		System.out.println();
		System.out.print(" ");
	}
	else
	{
		System.out.println ();
	}

	i++;
	}
}
}

	
