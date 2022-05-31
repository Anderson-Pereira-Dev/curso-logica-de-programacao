import java.util.Scanner;

public class TipoLogico {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalsa = false;
		System.out.println("Variável false: " + variavelFalsa);
		
		System.out.println("--------------------------------------");
		
						
		System.out.print("Digite o nome ");
		String nome = scanner.nextLine();
			
		System.out.print("Digite o sobrenome ");
		String sobrenome = scanner.nextLine();
		
		System.out.print("Digite a nota do aluno: ");
		Double nota = scanner.nextDouble();
		
	
		Boolean passoudeano = nota >= 7;
		
		// System.out.println("Pode tirar cariterira? " + podeTirarCarteira);
		
		if (passoudeano) {
			System.out.println(  nome + " " + sobrenome + " Passou ");
		} else {
			System.out.println(  nome + " " + sobrenome + " Não passou ");
		}
	}
	
}