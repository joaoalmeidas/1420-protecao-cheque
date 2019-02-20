import java.math.BigDecimal;
import java.util.Scanner;

public class Cheque {

	public static void main(String[] args) {
		
		String valor;
		int digitos = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor que será colocado no cheque no formato 1,234.60");
		valor = input.nextLine();
		
		System.out.printf("%n%nImpressão do cheque%n%n");
		
		for(int i = 0; i < 9 - valor.length(); i++) {
			
			System.out.print("*");
			
		}
		
		System.out.println(valor);
		
		System.out.printf("---------%n123456789");

	}

}
