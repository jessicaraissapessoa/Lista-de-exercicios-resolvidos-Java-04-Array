package listajava04;

import java.util.Scanner;

public class listajava04_10 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 10. Crie dois vetores (A e B). A com 10 n�meros inteiros e B com 15 n�meros inteiros. 
 * Em seguida, crie um terceiro vetor (C), que dever� ser a jun��o dos dois primeiros vetores (A e B). 
 * Exiba os vetores criados. */
		
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
	

teclado.close();

	}

}