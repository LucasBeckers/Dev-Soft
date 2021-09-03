import java.util.Scanner;

public class QuestQuatro {

	public static void main(String[] args) {
		int n1, n2, n3, r;
		Scanner scan= new Scanner(System.in);
		System.out.println("Insira o primeiro número:");
		n1= scan.nextInt();
		System.out.println("Insira o segundo número:");
		n2= scan.nextInt();
		System.out.println("Insira o terceiro número:");
		n3= scan.nextInt();
		
		r= (n1+n2+n3)/3;
		System.out.println("A média aritmética dos três valores é:" +r);
		scan.close();
	}

}
