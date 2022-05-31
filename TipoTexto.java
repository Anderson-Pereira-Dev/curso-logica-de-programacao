import java.util.Scanner;

public class TipoTexto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite o nome ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o sobrenome ");
		String sobrenome = scanner.nextLine();
		
		System.out.printf("Ola " + nome   + " " + sobrenome + "!");
		scanner.close();
		
		
	}

}