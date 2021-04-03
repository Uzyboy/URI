/*
|>Objetivos:  

	O professor Arquimedes precisa da sua ajuda para descobrir qual é a nota mais frequente entre as notas que os alunos dele tiraram na última pro-
va. A turma tem N alunos e seu programa deve imprimir a nota que aparece mais vezes na lista de N notas. Se houver mais de uma nota mais frequente,
você deve imprimir a maior delas! Por exemplo, se a turma tiver N = 10 alunos e as notas forem [20, 25, 85, 40, 25, 90, 25, 40, 55, 40], as notas ma
is frequentes são 25 e 40, ocorrendo três vezes cada. Seu programa, então, deve imprimir 40.
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada consiste de duas linhas. A primeira linha contém um número inteiro N, o número de alunos na turma.
   
   2)- A segunda linha contém N inteiros, que é a lista de notas dos alunos.
   
   3)- Seu programa deve imprimir apenas uma linha contendo apenas um número, a nota mais frequente da lista.
   
   4)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           _____________________________________________________
          | Exemplo de Entrada  		  | Exemplos de Saída   |
   		  |     	10                    |          40         |
   		  |20 25 85 40 25 90 25 40 55 40  |                     |
   		  |-------------------------------|---------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_2469_Notas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um número inteiro N, o número de alunos na turma.
		int N             = entrada.nextInt(); //Define a quantidade de notas;
		int notas[] 	  = new int[N];		   //Armazena as notas na entrada;
		int frequencias[] = new int[N];		   //Armazena a frequencia na mesma posição que sua nota correspondente no vetor notas[N];
		int maior[]       = new int[N];		   //Armazena a(s) nota(s) que aparece(m) na maior frequencia
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- A prox linha contém N inteiros, que é a lista de notas dos alunos.
		for(int i=0; i<notas.length; i++) {
			notas[i] = entrada.nextInt();
		}
	
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//2.1)- Obtenha a frência de cada nota no vetor notas[N];
		for(int j=0; j<notas.length; j++) {						
		
			int frequencia = 0;
			
			for(int k=0; k<notas.length; k++) {		//No final desse "loop k" você terá a frequencia da nota atual do "loop j".
				
				if(notas[j] == notas[k]) {
					frequencia++;
				}
			}
			frequencias[j] = frequencia;
		}
		
		//-----------------------------------------------------------------------------------------------------------------------------------------
		//2.2)- Obtenha a maior frequencia;
		int maiorFreq = 0;
		for(int l=0; l<frequencias.length; l++) {
				
			if(frequencias[l] > maiorFreq) {		//Isso vai te dar a maior frequencia;
				maiorFreq = frequencias[l];
			}			
				
		}
		//------------------------------------------------------------------------------------------------------------------------------------------
		//2.3)- Obtenha a(s) nota(s) que se repete(m) na maior frequencia;
		for(int m=0; m<maior.length; m++) {
			
			if(frequencias[m] == maiorFreq) {
				maior[m] = notas[m]; 
			}
		}
		//2.4)- Para caso haja mais de uma nota que atenda a maior frequencia, determine qual delas tem valor maior e imprima essa;
		int maiorNum = 0;
		for(int n=0; n<maior.length; n++) {
			
			if(maior[n] > maiorNum) {		//Isso vai te dar a maior numero com a maior frequencia;
				maiorNum = maior[n];
			}		
		}
		
//Objetivo 3---------------------------------------------------------------------------------------------------------------------------------------
//3)- Seu programa deve imprimir apenas uma linha contendo apenas um número, a nota mais frequente da lista.
//Caso ocorra de duas notas aparecerem na mesma frequência, imprima a maior;
		System.out.println(maiorNum);

//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}

