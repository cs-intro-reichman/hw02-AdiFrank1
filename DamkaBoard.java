public class DamkaBoard {
public static void main(String[] args) 
{
int num = Integer.parseInt(args[0]);
String z = "";
for (int i=0;i<num;i++)
	z += "* ";


for (int i=0; i<num;i++)
	if (i%2!=0)
		System.out.println (" "+z);
	else 
		System.out.println (z);

	}
	}