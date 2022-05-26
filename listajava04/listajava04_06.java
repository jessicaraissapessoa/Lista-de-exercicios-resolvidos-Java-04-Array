package listajava04;

import java.util.Scanner;

public class listajava04_06 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 06. Criar um vetor A com 5 elementos inteiros e um vetor B com mesmo tipo, tamanho e elementos do vetor A. */
		
	int [] vetorA = new int [5];
	int [] vetorB = new int [5];
	
	
	for (int indice = 0; indice < 5; indice++)
	{
		
		System.out.println("Defina vetorA[" + indice + "]: ");
		vetorA[indice] = teclado.nextInt();
		
		vetorB[indice] = vetorA[indice];
		
	}
	
	
for (int indice = 0; indice < 5; indice++)
{
	
	System.out.println("vetorA[" + indice + "] = " + vetorA[indice]);
	
}
	

for (int indice = 0; indice < 5; indice++)
{
	
	System.out.println("vetorB[" + indice + "] = " + vetorB[indice]);
	
}
	
	
teclado.close();

	}

}