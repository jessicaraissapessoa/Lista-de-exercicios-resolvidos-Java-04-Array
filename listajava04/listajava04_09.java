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
		

int [] vetorA = new int [6];
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
	
for (int lista : vetorB) {
	System.out.println(lista);
}	

teclado.close();

	}

}