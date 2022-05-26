package listajava04;

import java.util.Scanner;
import java.text.DecimalFormat;

public class listajava04_02 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
DecimalFormat nota = new DecimalFormat ("##0.00"); 
				
/* 02. Escreva um programa que leia 3 notas, calcule a média e, ao final, exiba as três notas e a média. */
		
	double [] notas = new double [3];
	
	
	for (int indice = 0; indice < 3; indice++)
	{
		System.out.println("Informe a " + (indice + 1) + "ª nota: ");
		notas[indice] = teclado.nextDouble();
	}
	
	
	
	double soma = 0;
	
	for (int indice = 0; indice < 3; indice++)
	{
		soma = soma + notas[indice];
	}
	
	double media = soma / notas.length;
	
	
	
	for (int indice = 0; indice < 3; indice++)
	{
		
		if (indice == 0) System.out.print("Suas notas são: " + nota.format(notas[indice]) + "/ ");
		else if (indice < (notas.length - 1)) System.out.print(nota.format(notas[indice]) + "/ ");
		else System.out.print(nota.format(notas[indice]) + ".");
		
	}
	
	System.out.println("\nSua média é: " + nota.format(media));
	
	
teclado.close();

	}

}