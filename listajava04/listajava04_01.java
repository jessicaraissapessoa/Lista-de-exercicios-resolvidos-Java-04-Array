package listajava04;

import java.util.Scanner;

public class listajava04_01 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 01. Escreva um programa que leia 04 n�meros e mostra cada um e sua posi��o no array. */
		
	int [] numeros = new int [4];
	

//populando vetor:
	for (int indice = 0; indice < 4; indice++)
	{
		System.out.println("Informe o " + (indice + 1) + "� n�mero: ");
		numeros[indice] = teclado.nextInt();
	}

	
//exibi��o com for:
	for (int indice = 0; indice < 4; indice++)
	{
		System.out.println("numeros[" + indice + "] = " + numeros[indice]);
	}
	
	
//exibi��o com foreach:
	for (int listanumeros : numeros) 
	{
		System.out.println(listanumeros);
	}


//exibi��o com for (na mesma linha):
	
	for (int indice = 0; indice < numeros.length; indice++)
	{
		if (indice < (numeros.length - 1)) System.out.print(numeros[indice] + ", ");
		else System.out.println(numeros[indice] + ".");
	}
	
	
teclado.close();

	}

}