import java.util.Scanner;

public class OlaMundo3 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 5;
		int[] vet = new int[TAM];
		int soma = 0;
		
		for(int x = 0; x < TAM; x++) {
			System.out.print("Informe um número: ");
			vet[x] = entrada.nextInt();
			soma += vet[x];
		}
		
		float media = (float) soma / TAM;
		
		System.out.print("\nNúmeros inseridos: ");
		for(int x = 0; x < TAM; x++)
			System.out.print(" " + vet[x]);
		System.out.print("\nSoma: " + soma + "\n"
						+ "Média: " + media);
		
		entrada.close();
	}
}