/*
|>Objetivos:  
	Tombólia do Oeste e Tombólia do Leste travaram uma guerra durante 50 anos. O motivo da guerra era o tamanho do território de cada país. Pelo bem
da população dos dois países, os governos resolveram fazer um tratado para finalizar a guerra. O tratado consiste em fazer um divisão justa, e certa-
mente contínua, do território. Eles resolveram pedir sua ajuda para calcular o ponto de divisão do território. Depois de tantos anos de guerra, os pa
íses não podem lhe pagar uma viagem para ver previamente o território que será dividido. Ao invés disso, eles prepararam uma lista a1,a2,…,aN de inte
iros que indicam o tamanho de cada seção do território. A seção a1 é vizinha da seção a2 que por sua vez é vizinha da seção a3; e assim por diante.
Os governos querem uma divisão em uma seção k de tal forma que a1 + a2 + … + ak = ak+1 + ak+2 + … + aN.

	Sua tarefa é dada uma lista de inteiros positivos a1, a2,..., aN , determinar a seção k tal que soma dos comprimentos das seções a1 até ak é igual a 
soma dos comprimentos das seções ak+1 até aN

....................................................................................................................................................   
  
   Condições:
   
   1)-A primeira linha da entrada contém um inteiro N (1 <= N <= 105) indicando o número de seções do território. A segunda linha da entrada contém N 
   inteiros a1, a2,..., aN (1 <= ai <= 100, para i = 1, 2, . . . , N.)separados por um único espaço que indicam os comprimentos das seções.
   
   2)-Seu programa deve imprimir uma única linha contendo um inteiro que indica a seção do território onde acontecerá a divisão.(É garantido que sem-
   pre existe uma divisão que satisfaz as condições dos países).
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
       	  |		    4			|			3			 |
          | 	5 3 2 10		|                        |
          |---------------------|------------------------|
          |		    9			|			4			 |
          |   2 8 2 8 4 4 4 4 4	|                        |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_2420_Guerra_por_Território {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N;
		int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia N inteiros;
		int M[] = new int[N];
		for(int i=0; i<N; i++) {
			M[i] = entrada.nextInt();
		}
	
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- Some esses N inteiros;
		int soma1 = 0;
		for(int j=0; j<N; j++) {
		
			soma1 = soma1 + M[j];
			
		}

//Objetivo 4 ----------------------------------------------------------------------------------------------------------------------------------------		
//3)- Ao percorrer o vetor dos N inteiros, some e pare onde a soma for igual a metade da variavel "soma1";
//Pegue o indice de onde vc parou e imprima;
		int soma2 = 0;
		int indice = 0;
		for(int k=0; k<N; k++) {
			soma2 = soma2 + M[k];
			if(soma2 == (soma1 / 2)) {
				indice = k +1 ;				//+1 pelo fato do vetor iniciar da posição 0;
			}		
		}
		
		System.out.println(indice);
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

