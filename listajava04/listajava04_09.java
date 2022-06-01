package listajava04;

import java.util.Scanner;

public class listajava04_09 {

	public static void main(String[] args) {

//Lista de Exercícios de Java 04 - Array
//Organizador / Professor: Junio Figueiredo
//Revisora / Diagramadora / Aluna: Jéssica Raissa Pessoa
		
Scanner teclado = new Scanner (System.in);
				
/* 09. Faça um programa para criar um vetor de 20 posições: as 10 primeiras são números informados pelos usuário
 * e as 10 seguintes são os mesmos números em ordem inversa. */
		

int [] vetorA = new int [6];
int [] vetorB = new int [vetorA.length];
int [] vetorfinal = new int [vetorA.length + vetorB.length];


//10 primeiros valores (ordem padrão):

for (int iA = 0; iA < vetorA.length; iA++)
{
	System.out.println("Informe o " + (iA + 1) + "º número: ");
	vetorA[iA] = teclado.nextInt();
}


//10 últimos valores (ordem inversa):

int inicializacao = (vetorA.length - 1);

for (int iA = 0; iA < vetorA.length; iA++)
{
	int iB = inicializacao;
	vetorB[iB] = vetorA[iA];
	inicializacao--;
}


//inserindo os valores em ordem padrão e os em ordem inversa:
	
for (int lista : vetorB) {
	System.out.println(lista);
}	

teclado.close();

	}

}