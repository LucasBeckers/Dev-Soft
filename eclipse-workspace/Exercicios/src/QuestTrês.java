import java.util.Scanner;

public class QuestTr�s {

	public static void main(String[] args) {

		int n1, n2, r;
		Scanner scan= new Scanner(System.in);
		System.out.println("Insira o primeiro n�mero:");
		n1= scan.nextInt();
		System.out.println("Insira o segundo n�mero:");
		n2= scan.nextInt();
		
		r= n1*n2;
		System.out.println("O resultado da multiplica��o �:" +r);
		
		scan.close();
	}

}
