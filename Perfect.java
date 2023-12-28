public class perfect {
public static void main(String[] args) 
{
int a = Integer.parseInt(args[0]);
String s = " ";
int sum = 0;
for(int i=1; i<a; i++)
{
	if(a % i == 0)
		{sum += +i;
	 	if (i==1)
	 		{
	 			s += i;
	 		}

	 	else 
	 		{
	 			s += " + " + i;
	 		}
	 	}
}

if (sum == a)	
		{System.out.println(a + " is a perfect number since " + a + " = " + s);
	}
else
		{	System.out.println(a + " is not a perfect number");
	}

}
}