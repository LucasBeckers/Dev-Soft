import java.util.Scanner;

public class QuestQuatro {

	public static void main(String[] args) {
		int n1, n2, n3, r;
		Scanner scan= new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero:");
		n1= scan.nextInt();
		System.out.println("Insira o segundo n�mero:");
		n2= scan.nextInt();
		System.out.println("Insira o terceiro n�mero:");
		n3= scan.nextInt();
		
		r= (n1+n2+n3)/3;
		System.out.println("A m�dia aritm�tica dos tr�s valores �:" +r);
		scan.close();
	}

}
