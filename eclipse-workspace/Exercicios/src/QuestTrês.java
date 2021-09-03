import java.util.Scanner;

public class QuestTrês {

	public static void main(String[] args) {

		int n1, n2, r;
		Scanner scan= new Scanner(System.in);
		System.out.println("Insira o primeiro número:");
		n1= scan.nextInt();
		System.out.println("Insira o segundo número:");
		n2= scan.nextInt();
		
		r= n1*n2;
		System.out.println("O resultado da multiplicação é:" +r);
		
		scan.close();
	}

}
