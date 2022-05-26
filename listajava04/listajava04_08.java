package listajava04;

import java.util.Scanner;

public class listajava04_08 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 08. Criar dois vetores (A e B), cada um com 10 elementos inteiros.
 * Após, construir um vetor C, no qual cada elemento é o resultado da multiplicação dos respectivos elementos em A e B.
 * Ou seja, C[indice] = A[indice] * B[indice]. */
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [10];
	int [] vetorC = new int [10];
	
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("Defina vetorA[" + indice + "]:");
		vetorA[indice] = teclado.nextInt();
	}
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("Defina vetorB[" + indice + "]:");
		vetorB[indice] = teclado.nextInt();
	}
	
	
	for (int indice = 0; indice < 10; indice++)
	{
		vetorC[indice] = vetorA[indice] * vetorB[indice];
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
	
	System.out.println("\n");
	
	for (int indice = 0; indice < 10; indice++)
	{
		System.out.println("vetorC[" + indice + "] = " + vetorC[indice]);
	}
	

teclado.close();

	}

}