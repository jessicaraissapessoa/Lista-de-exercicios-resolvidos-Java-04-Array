package listajava04;

import java.util.Scanner;

public class listajava04_07 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 07. Criar um vetor A com 10 elementos inteiros.
 * Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B dever� ser o respectivo elemento do vetor A multiplicado pelo �ndice.
 * Ou seja, vetorB[indice] = vetorA[indice] * indice.
 * Exiba os elementos do vetor A e do vetor B. */
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [10];
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		
		System.out.println("Defina vetorA[" + indice + "]: ");
		vetorA[indice] = teclado.nextInt();
		
		vetorB[indice] = vetorA[indice] * indice;
		
	}
	
	
for (int indice = 0; indice < 10; indice++)
{
	
	System.out.println("vetorA[" + indice + "] = " + vetorA[indice]);
	
}
	

System.out.println("\n");


for (int indice = 0; indice < 10; indice++)
{
	
	System.out.println("vetorB[" + indice + "] = " + vetorB[indice]);
	
}
	

teclado.close();

	}

}