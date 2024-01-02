public class Reverse {
public static void main(String[] args) 
{
String a = (args[0]);
String z = "";
int n = a.length();
int mid = a.length()/2;

for (int i=n-1; i>=0; i--)
	 {char c = a.charAt(i);
		z=z+c;
	}

		System.out.println (z);
		System.out.println ("The middle character is " + z.charAt(mid));

}

	}

  