/*
|>Objetivos: O professor Genesio recebeu várias camisetas da OBI (Organização dos Bacharéis Intelectuais) para doar a seus alunos de Ciência da
Computação. Para fazer a distribuição destas camisetas ele organizou os alunos de cada turma do curso em pequenos grupos (de no máximo 10 pessoas)
e definiu que faria o sorteio de uma camiseta para cada um dos grupos. Como Genesio não quer perder muito tempo com este sorteio, ele pediu que vo-
cê o ajudasse com um programa que determinasse quem foi o aluno ganhador de acordo com a seguinte regra: O primeiro de cada grupo a acertar um nú-
mero escolhido pelo professor obviamente ganha a camiseta, mas se ninguém acertar este número, ganha a camiseta o primeiro que chegar o mais pró-
ximo deste número.

Não faz diferença quem do grupo o professor escolhe para tentar iniciar a adivinhação. Este sempre será o aluno número 1, e assim sucessivamente.
....................................................................................................................................................   
  
   Condições:
   
   1)- A primeira linha de entrada contém um inteiro N que determina a quantidade de casos de teste, ou de camisetas que serão sorteadas. Cada caso
   de teste é composto por duas linhas. A primeira linha contém dois valores inteiros QT (4 ≤ QT ≤ 10) e S (1 ≤ S ≤ 100) separados por um espaço, que
   indicam respectivamente a quantidade de alunos do grupo e o número secreto que deve ser adivinhado. A segunda linha contém cada um dos QT valores,
   separados por um espaço.
   
   2)- Para cada caso de teste, seu programa deve imprimir um número inteiro que indica a posição do ganhador da camiseta, conforme as regras descri-
   tas acima.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           __________________________________________________
          |     Exemplo de Entrada     | Exemplos de Saída   |
          | 3						   |					 |
		  | 7 35					   |					 |
		  | 8 26 30 43 36 17 7		   |    5				 |	
          | 4 16					   |    				 |
          | 12 16 3 16				   |    2				 |
          | 10 48					   |    				 |
          | 3 7 27 9 50 49 16 47 63 1  |    6				 |				
          |----------------------------|---------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_1547_Advinha {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N que determina a quantidade de casos de teste, ou de camisetas que serão sorteadas. 
    	int N    = entrada.nextInt();
    	int cont = 0;
    	int posicao  = 0;
		int vencedor = 0; 
    	
    	while(cont<N) {
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Leia dois valores inteiros QT (4 ≤ QT ≤ 10) e S (1 ≤ S ≤ 100) separados por um espaço,que indicam respectivamente a quantidade de alunos do 
//grupo e o número secreto que deve ser adivinhado.
    		int QT = entrada.nextInt();
    		System.out.println();
    		int S  = entrada.nextInt();
       		int menorDiferença    = S;
       		
       		//2.1)- Defina uma variável para receber o número vencedor e uma para determinar a posição desse número vencedor;
    		posicao  = 0;
    		vencedor = 0;
    	
    		//2.2)- Leia cada número de cada QT aluno
    		for(int i=0; i<QT; i++) {
    			
    			int NUM = entrada.nextInt();
    		
    			
    			//2.3)- Calcule a diferença do número atual com o sorteado, o primeiro que obter a menor ou diferença nula é o vencedor;
    			    			
    		
    			int diferençaAtual = Math.abs(S - NUM);//Valor absoluto para caso o número dado pelo aluno seja maior que o sorteado;
    			
//    			System.out.println("-----------------------------------");//DEBUG
//    			System.out.println("Número Atual = " + NUM);
//    			System.out.println("Diferença Atual = " + S + "-" + NUM + " = " + diferençaAtual);//DEBUG
//    			System.out.println("Menor Diferença = " + menorDiferença);
//    			System.out.println("-----------------------------------");//BEBUG
    			
    			if(diferençaAtual < menorDiferença && NUM != vencedor) {
    				
    				menorDiferença = diferençaAtual;
    				posicao  = i;
    				vencedor =  NUM;
    				
    			}
    				
    		}
    		System.out.print(posicao + 1);
    		System.out.println();
    		cont++;
    	}
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		
		NÃO RESOLVIDO!!!!!!!!!!!
		   		
	}
}

