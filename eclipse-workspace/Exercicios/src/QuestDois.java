import java.util.Scanner;

public class QuestDois {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String usuário=" ";
		
		System.out.println("Insira nome de usuário:");
		 usuário= scan.nextLine();
		
		System.out.printf("Seu nome de usuário é: " + usuário);
	}

}
