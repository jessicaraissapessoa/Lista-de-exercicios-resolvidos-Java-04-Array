package listajava04;

import java.util.Scanner;

public class listajava04_05 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 05. Fa�a um programa para gerar um array de 30 elementos, onde cada elemento corresponde ao quadrado de sua posi��o.
 * Depois imprima os elementos resultantes. */
		
	double [] vetor = new double [30];
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		vetor[indice] = Math.pow(indice, 2);
	}
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		System.out.println(vetor[indice]);
	}
	
	
	
teclado.close();

	}

}