import java.util.Scanner;
import java.lang.Math;
class Seconddegres {
	public static void main(String agh[]) {
		System.out.println ("resolution  de l'equation de second degres de la forme ax²+bx+c");
		
		Scanner sc=new Scanner(System.in);
		Scanner rp=new Scanner(System.in);
		char reponse='O';
		
		
		while (reponse=='O')
		{
		System.out.println ("donnez la valeur de a puis appuyez sur entree");
		
		int a=sc.nextInt();
		
		System.out.println ("donnez la valeur de b puis appuyez sur entree");
		
		int b= sc.nextInt();
		
		System.out.println ("donnez la valeur de c puis appuyez sur entree");
		
		int c= sc.nextInt();
		
		System.out.println ("Avec: "+ "a="+a+ " b="+b+ " c="+c);
		
		double delta=(b*b)-(4*a*c);
		
		double rd=Math.sqrt(delta);
		
		System.out.println ("Delta=" + delta);
		
		if (delta>0)
		{
			System.out.println ("RD="+rd);
		}
		
		if (delta==0)
		{
			int x=-b/(2*a);
			System.out.println ("alors x="+x);
		}
		else
		{
			if (delta<0)
			{
				System.out.println ("Il n\'y a pas de solution");
			}
			else
			{				
				
				double x1=(-b-rd)/(2*a);
				double x2=(-b+rd)/(2*a);
				
				System.out.println ("alors x1="+x1+ " et " + "x2="+x2);
			}
		}
		System.out.println ("voulez vous reessayer? O/N");
		reponse=rp.nextLine().charAt(0);
		}
		System.out.println ("Au revoir");	
	}
}