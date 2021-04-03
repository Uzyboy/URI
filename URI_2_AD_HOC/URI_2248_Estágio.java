/*
|>Objetivos:  
	Você conseguiu um estágio para trabalhar como programador na secretaria da sua escola. Como primeira tarefa, Dona Vilma, a coordenadora, solici-
tou que você aprimore um programa que foi desenvolvido pelo estagiário anterior. Esse programa tem como entrada uma lista de nomes e de médias fina-
is dos alunos de uma turma, e determina o aluno com a maior média na turma. Dona Vilma pretende utilizar o programa para premiar o melhor aluno de 
cada turma da escola. O programa desenvolvido pelo estagiário anterior encontra-se nas páginas a seguir (programa Pascal na página 5, programa C na
página 6, programa C++ na página 7).

 	Como você pode verificar, o programa na forma atual tem uma imperfeição: no caso de haver alunos empatados com a melhor média na turma, ele impri
me apenas o primeiro aluno que aparece na lista.

	Dona Vilma deseja que você altere o programa para que ele produza uma lista com todos os alunos da turma que obtiveram a maior média, e não ape-
nas um deles. Você consegue ajudá-la nesta tarefa?
....................................................................................................................................................   
  
   Condições:
   
   1)-A entrada é constituída de vários conjuntos de teste, representando várias turmas. A primeira linha de um conjunto de testes contém um número
   inteiro N (1 <= N <= 1000) que indica o total de alunos na turma. As N linhas seguintes contêm, cada uma, um par de números inteiros 
   C (1 <= C<= 20000) e M (0 <= M <= 100), indicando respectivamente o código e a média de um aluno. 
   -O final da entrada é indicado por uma turma com N = 0.
  
   2)-Para cada turma da entrada seu programa deve produzir três linhas na saída. 
   -A primeira linha deve conter um identificador do conjunto de teste, no formato “Turma n”, onde n é numerado a partir de 1. 
   -A segunda linha deve conter os códigos dos alunos que obtiveram a maior média da turma. Os códigos dos alunos devem aparecer na mesma ordem da 
   entrada, e cada um deve ser seguido de um espaço em branco. 
   -A terceira linha deve ser deixada em branco. O formato mostrado no exemplo de saída abaixo deve ser seguido rigorosamente.


   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |3                    |    Turma 1             |
          |1 85					|	 2                   |
	   	  |2 91					|                        |
          |3 73					|	 Turma 2             |
		  |5					|	 12601 10111 212     |
		  |12300 81				|						 |
		  |12601 99				|						 |
		  |15023 76				|						 |
		  |10111 99             |						 |
		  |212 99               |						 |	
		  |0                    |						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_2248_Estágio {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
//A entrada é constituída de vários conjuntos de teste;
//Esse programa tem como entrada uma lista de nomes e de médias finais dos alunos de uma turma, e determina o aluno com a maior média na turma.			   

//Objetivo 0 ---------------------------------------------------------------------------------------------------------------------------------------
//Contabilize a entada de dados para poder imprimir Turma i;
		int contTurma = 0;	 						//Isso contabiliza a quantidade de turmas entradas para fims de impressão;
		int N = 1;
		
		while(N != 0) {
			contTurma++;
//Objetivo 1 ---------------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha de um conjunto de testes contém um número inteiro N (1 <= N <= 1000) que indica o total de alunos na turma.
			 N = entrada.nextInt();					//Total de alunos na turma;

			
//Objetivo 2 ---------------------------------------------------------------------------------------------------------------------------------------
//2)- As N linhas seguintes contêm, cada uma, um par de números inteiros C (1 <= C<= 20000) e M (0 <= M <= 100), indicando respectivamente o código
//e a média de um aluno.
//- O final da entrada é indicado por uma turma com N = 0, zero alunos.
		
	  //2.1)- Leia os codigos e as medias e armazene esses valores em um vetor;
		int C[] = new int[N];							//Isso vai armazenar os códigos dos N alunos;
		int M[] = new int[N];							//Isso vai armazenar a média dos N alunos;
			
		for(int i=0; i<N; i++) {
			C[i] = entrada.nextInt();					//Leitura dos código do aluno i;
			M[i] = entrada.nextInt();					//Leitura da media do aluno i;			
			
		}
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  //2.2)- Obtenha a maior media;
		int maiorMedia = 0;
		for(int j=0; j<M.length; j++) {
			if( M[j] > maiorMedia ) {
				maiorMedia = M[j];	 
			}
		}
	  
	  //--------------------------------------------------------------------------------------------------------------------------------------------
	  //2.3)- Verifique quais codigos correspondem a maiorMedia
		
		int maioresMedias[]  = new int[N];				//Armazena apenas os códigos que alcançaram a maior média 
			
		for(int k=0; k<maioresMedias.length; k++) {
				
			if(M[k] == maiorMedia) {					//Isso verifica se o numero atual do "loop k" é igual a maior média;
	
				maioresMedias[k] = M[k];				//Isso armazena todas as medias que são iguais a maior media na mesma posição do código cor-
														//respondente;
				
			}
			
		}
		//------------------------------------------------------------------------------------------------------------------------------------------
		//2.4)- Imprima o númeor da turma atual
			System.out.println("Turma " + contTurma);
		//------------------------------------------------------------------------------------------------------------------------------------------
		//2.5)-  Imprima todos os códigos que atingiram a maior média
			for(int l=0; l<N; l++) {
				if(maioresMedias[l] != 0) {
					System.out.print(C[l]+" ");
				}
				
			}
			
			System.out.println("\n");
			
													
//--------------------------------------------------------------------------------------------------------------------------------------------------
		}		   
//--------------------------------------------------------------------------------------------------------------------------------------------------
			   
		   entrada.close();
		   
	}
}


