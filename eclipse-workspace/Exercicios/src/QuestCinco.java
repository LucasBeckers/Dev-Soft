import java.util.Scanner;

public class QuestCinco {

	public static void main(String[] args) {
		int n2;
		float n1, r;
		Scanner scan= new Scanner(System.in);
		System.out.println("Digite o preço do produto:");
		n1= scan.nextFloat();
		System.out.println("Insira a quantidade:");
		n2= scan.nextInt();		
		r= n1*n2;
		System.out.println("Valor total é:" +r);
		
		scan.close();
	}

}
