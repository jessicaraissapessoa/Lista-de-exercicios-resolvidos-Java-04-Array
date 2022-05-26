package listajava04;

import java.util.Scanner;

public class listajava04_03 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 03. Escreva um programa que receba um vetor de 5 elementos e, em seguida,
 * multiplique os elementos pares por 3 e adicionando 1 aos elementos ímpares.
 * Mostre o vetor alterado. */
		
	int [] vetor = new int [5];
	
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		System.out.println("Informe o elemento de índice " + indice + " do vetor: ");
		vetor[indice] = teclado.nextInt();
		
	}
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		if (vetor[indice] %2 == 0) System.out.println(vetor[indice] * 3);
		else System.out.println(vetor[indice] + 1);		
		
	}
	
	
teclado.close();

	}

}