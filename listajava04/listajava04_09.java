package listajava04;

import java.util.Scanner;

public class listajava04_09 {

	public static void main(String[] args) {

//Lista de Exerc�cios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: J�ssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 09. Fa�a um programa para criar um vetor de 20 posi��es: as 10 primeiras s�o n�meros informados pelos usu�rio
 * e as 10 seguintes s�o os mesmos n�meros em ordem inversa. */
		

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
	
//	for (int indice = 0; indice < vetor.length; indice++) 
//	{
//		
//		System.out.println("Informe o elemento de �ndice " + indice + " do vetor: ");
//		vetor[indice] = teclado.nextInt();
//		
//	}
//	
//	
//	for (int indice = 4; indice >= 0; indice--)
//	{
//		
//		System.out.println("vetor[" + indice + "] = " + vetor[indice]);
//		
//	}
	
	

teclado.close();

	}

}