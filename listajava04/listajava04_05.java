package listajava04;

import java.util.Scanner;

public class listajava04_05 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 04. Declarar e ler um vetor de 5 n�meros inteiro e, ap�s, exibir o vetor na ordem inversa dos elementos digitados. */
		
	int [] vetor = new int [5];
	
	
	for (int indice = 0; indice < vetor.length; indice++) 
	{
		
		System.out.println("Informe o elemento de �ndice " + indice + " do vetor: ");
		vetor[indice] = teclado.nextInt();
		
	}
	
	
	for (int indice = 4; indice >= 0; indice--)
	{
		
		System.out.println("vetor[" + indice + "] = " + vetor[indice]);
		
	}
	
	
teclado.close();

	}

}