/*
|>Objetivos: 
  Em ano de Copa do Mundo de Futebol, o álbum de figurinhas oficial é sempre um grande sucesso entre crianças e também entre adultos. Para quem 
não conhece, o álbum contém espaços numerados de 1 a N para colar as figurinhas; cada figurinha, também numerada de 1 a N, é uma pequena foto de
um jogador de uma das seleções que jogará a Copa do Mundo. O objetivo é colar todas as figurinhas nos respectivos espaços no álbum, de modo a 
completar o álbum (ou seja, não deixar nenhum espaço sem a correspondente figurinha).

  As figurinhas são vendidas em envelopes fechados, de forma que o comprador não sabe quais figurinhas está comprando, e pode ocorrer de comprar 
uma figurinha que ele já tenha colado no álbum.

  Para ajudar os usuários, a empresa responsável pela venda do álbum e das figurinhas quer criar um aplicativo que permita gerenciar facilmente 
as figurinhas que faltam para completar o álbum e está solicitando a sua ajuda.

  Dados o número total de espaços e figurinhas do álbum, e uma lista das figurinhas já compradas (que pode conter figurinhas repetidas), sua ta-
refa é determinar quantas figurinhas faltam para completar o álbum.
....................................................................................................................................................   
  
   Condições:
   
   1)- A primeira linha contém um inteiro N (1 ≤ N ≤ 100) indicando o número total de figurinhas e espaços no álbum. A segunda linha contém um
   inteiro M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas. Cada uma das M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N)
   indicando uma figurinha já comprada.
   
   2)- Seu programa deve produzir uma única linha contendo um inteiro representando o número de figurinhas que falta para completar o álbum.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |	10					|	 7					 |
		  | 3					|						 |
		  |	5					|						 |
		  |	8					|						 |
		  |	3					|						 |
          |---------------------|------------------------|
          |	5					|	 3					 |
		  |	6					|						 |
		  | 3					|						 |
		  |	3					|						 |
		  |	2					|						 |
		  |	3					|						 |
		  |	3					|						 |
		  | 3					|						 |
		  |---------------------|------------------------|
		  |	3					|	 0					 |
		  |	4					|						 |
		  | 3					|						 |
		  |	1					|						 |
		  |	3					|						 |
		  |	3					|						 |
		  |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.util.HashSet;																			//NEW!!!

public class URI_2779_Álbum_da_Copa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
 		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N (1 ≤ N ≤ 100) indicando o número total de figurinhas e espaços no álbum.
    	int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia um inteiro M (1 ≤ M ≤ 300) indicando o número de figurinhas já compradas. 
    	int M = entrada.nextInt();
    	
    	    	   
    	//2.1)- Cada uma das M linhas seguintes contém um número inteiro X (1 ≤ X ≤ N) indicando uma figurinha já comprada.
    	
    	//Isso cria uma coleção de dados,
    	//     "Integer" siginifica que ela será uma coleção de inteiros;
    	//		compradas é o Identificador;
    	//		new HashSet<Integer>(); é o instaciamenteo;
    	//Nesse metodo especial, você pode adicionar items a uma lista com " add.-Identificador- ( o que quer add);
    	//Porêm, para esse probblema, a sacada é que, se você add um elemento que já está na coleção, ele será descartado;
    	HashSet<Integer> figCompradas = new HashSet<Integer>(); 
    	
    	for(int i=0; i<M; i++) {
    		figCompradas.add(entrada.nextInt()); //Isso adiciona items da entrada a coleção "figCompradas", porem se o elemento for uma
    											 //duplicata ele será descartado.
    	}
    
    	//Use ".size();" para saber o tamanho de uma coleção
    	
    	int figFaltam = N - figCompradas.size();
 
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3) Imprima a quantidade de figurinhas que faltam
    	System.out.println(figFaltam);    	
    	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
	
}

