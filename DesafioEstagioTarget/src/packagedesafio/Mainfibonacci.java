package packagedesafio;
import java.util.Scanner;

public class Mainfibonacci {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
        System.out.println("Informe um número: ");
        int numero = Integer.parseInt(entrada.nextLine());
        
        
        if(pertenceSerieFibonacci(numero)) {
        	System.out.println("Pertence a sequência de Fibonacci!");
        }
        else {
        	System.out.println("Não pertence a sequência de Fibonacci!");
        }
	
	}

	public static boolean pertenceSerieFibonacci(int n) {
		
		int primeiro = 0, segundo = 1, terceiro = 0;
		
		
		while (terceiro < n) {
			terceiro = primeiro + segundo;
			primeiro = segundo;
			segundo = terceiro;
		}
	
		   return terceiro == n;
	}
	
}