package listajava04_visaogeral;

import java.text.DecimalFormat;
import java.util.Scanner;

public class listajava04_visaogeral {

	public static void main(String[] args) {
	
//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
				
Scanner teclado = new Scanner (System.in);
/*


	/* 01. Escreva um programa que leia 04 n�meros e mostra cada um e sua posi��o no array.
		
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
		
		
		
		
	/* 02. Escreva um programa que leia 3 notas, calcule a m�dia e, ao final, exiba as tr�s notas e a m�dia.
		
	double [] notas = new double [3];
	
	
	for (int indice = 0; indice < 3; indice++)
	{
		System.out.println("Informe a " + (indice + 1) + "� nota: ");
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
		
		if (indice == 0) System.out.print("Suas notas s�o: " + nota.format(notas[indice]) + "/ ");
		else if (indice < (notas.length - 1)) System.out.print(nota.format(notas[indice]) + "/ ");
		else System.out.print(nota.format(notas[indice]) + ".");
		
	}
	
	System.out.println("\nSua m�dia �: " + nota.format(media));
		
		
		
		
	/* 03. Escreva um programa que receba um vetor de 5 elementos e, em seguida,
	multiplique os elementos pares por 3 e adicionando 1 aos elementos �mpares.
	Mostre o vetor alterado.
		
	int [] vetor = new int [5];
	
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		System.out.println("Informe o elemento de �ndice " + indice + " do vetor: ");
		vetor[indice] = teclado.nextInt();
		
	}
	
	for (int indice = 0; indice < vetor.length; indice++)
	{
		
		if (vetor[indice] %2 == 0) System.out.println(vetor[indice] * 3);
		else System.out.println(vetor[indice] + 1);		
		
	}
		
		
		
		
	/* 04. Declarar e ler um vetor de 5 n�meros inteiro e, ap�s, exibir o vetor na ordem inversa dos elementos digitados.
		
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

		
		
		
	//* 05. Fa�a um programa para gerar um array de 30 elementos, onde cada elemento corresponde ao quadrado de sua posi��o.
	Depois imprima os elementos resultantes.
		
	double [] vetor = new double [30];
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		vetor[indice] = Math.pow(indice, 2);
	}
	
	
	for (int indice = 0; indice < 30; indice++)
	{
		System.out.println(vetor[indice]);
	}
		
		
		
		
	/* 06. Criar um vetor A com 5 elementos inteiros e um vetor B com mesmo tipo, tamanho e elementos do vetor A.
		
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
		
		
		
		
	/* 07. Criar um vetor A com 10 elementos inteiros.
	Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B dever� ser o respectivo elemento do vetor A multiplicado pelo �ndice.
	Ou seja, vetorB[indice] = vetorA[indice] * indice.
	Exiba os elementos do vetor A e do vetor B.
		
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
		
		
		
		
	/* 08. Criar dois vetores (A e B), cada um com 10 elementos inteiros.
	Ap�s, construir um vetor C, no qual cada elemento � o resultado da multiplica��o dos respectivos elementos em A e B.
	Ou seja, C[indice] = A[indice] * B[indice].
		
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
	
		
		
		
	/* 09. Fa�a um programa para criar um vetor de 20 posi��es: as 10 primeiras s�o n�meros informados pelos usu�rio
	e as 10 seguintes s�o os mesmos n�meros em ordem inversa.
		

	int [] vetorA = new int [10];
	int [] vetorB = new int [vetorA.length];
	int [] vetorfinal = new int [vetorA.length + vetorB.length];


	//10 primeiros valores (ordem padr�o):

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		System.out.println("Informe o " + (iA + 1) + "� n�mero: ");
		vetorA[iA] = teclado.nextInt();
	}


	//10 �ltimos valores (ordem inversa):

	int inicializacao = (vetorA.length - 1);

	for (int iA = 0; iA < vetorA.length; iA++)
	{
		int iB = inicializacao;
		vetorB[iB] = vetorA[iA];
		inicializacao--;
	}


	//inserindo os valores em ordem padr�o e os em ordem inversa:
	
	for (int iA = 0; iA < vetorA.length; iA++)
	{
		int ifinal = iA;
		vetorfinal[ifinal] = vetorA[iA];
	}

	for (int iB = 0; iB < vetorB.length; iB++)
	{
	int ifinal = iB + 10;
	vetorfinal[ifinal] = vetorB[iB];
	}	


	//exibindo os valores do vetorfinal:

	for (int ifinal = 0; ifinal < (vetorA.length + vetorB.length); ifinal++)
	{
	System.out.println("vetor[" + ifinal + "] = " + vetorfinal[ifinal]);
	}
		
		
		
		
	/* 10. Crie dois vetores (A e B). A com 10 n�meros inteiros e B com 15 n�meros inteiros. 
	Em seguida, crie um terceiro vetor (C), que dever� ser a jun��o dos dois primeiros vetores (A e B). 
	Exiba os vetores criados.
		
	int [] vetorA = new int [10];
	int [] vetorB = new int [15];
	int [] vetorC = new int [vetorA.length + vetorB.length];
	
	for (int ia = 0; ia < vetorA.length; ia++) {
		System.out.println("Informe vetorA[" + ia + "]: ");
		vetorA[ia] = teclado.nextInt();
	}
	
	for (int ib = 0; ib < vetorB.length; ib++) {
		System.out.println("Informe vetorB[" + ib + "]: ");
		vetorB[ib] = teclado.nextInt();
	}
	
	
	
	for (int ia = 0; ia < vetorA.length; ia++) {
		int ic = ia;
		vetorC[ic] = vetorA[ia];
	}
	
	for (int ib = 0; ib < vetorB.length; ib++) {
		int ic = ib + 10;
		vetorC[ic] = vetorB[ib];
	}
	
	
	
	for (int listaA : vetorA) {
		System.out.println("vetorA: " + listaA);
	}
	
	System.out.println("\n");
	
	for (int listaB : vetorB) {
		System.out.println("vetorB: " + listaB);
	}
	
	System.out.println("\n");
	
	for (int listaC : vetorC) {
		System.out.println("vetorC: " + listaC);
	}
				
		
				
		
*/		
teclado.close();		

	}

}
