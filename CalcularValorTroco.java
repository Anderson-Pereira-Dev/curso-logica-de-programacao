import java.util.Scanner;

public class CalcularValorTroco {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Quantidade Comprado pelo cliente: ");
		Double quantidadeCompradoPeloCliente = scanner.nextDouble();
				
		System.out.println("Valor total da Compra: " + valorProduto*quantidadeCompradoPeloCliente);	
		
		System.out.print("Valor Recebido do cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();
		
		System.out.print("Percentual de Desconto: ");
		Double percentualDescontoCliente = scanner.nextDouble();
		
				
		Double total = valorProduto *quantidadeCompradoPeloCliente;
		
		Double desconto = total*percentualDescontoCliente/100;
		
		System.out.println("Valor do Desconto: " + desconto);	
		
		Double troco = (valorPassadoPeloCliente -total) + desconto;
		
		
		System.out.println("Troco: " + troco);
		
		scanner.close();
		
	}
	
}