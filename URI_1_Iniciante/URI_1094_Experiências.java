/*
|>Objetivos: Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para organizar os experimentos de 
um laboratório o qual ela é responsável. Ela quer saber no final do ano, quantas cobaias foram utilizadas no laboratório e o percentual de ca-
da tipo de cobaia utilizada.

Este laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas informações, ela sabe exatamente o número 
de experimentos que foram realizados, o tipo de cobaia utilizada e a quantidade de cobaias utilizadas em cada experimento.


1)- Leia um interio N que indica a quantidade de casos testes que vem a seguir;

2)- Leia um inteiro Quantia que representa a quantidade de cobaias utilizadas seguido de um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo 
de cobaia (R:Rato S:Sapo C:Coelho). OBS.: ambos na mesma linha;

3)- Mostre o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de 
cobaias utilizadas;

................................................................................................................................................
  
   Condições:
   
   1)-A primeira linha de entrada contém um valor inteiro N que indica os vários casos de teste que vem a seguir. 
   Cada caso de teste contém um inteiro Quantia (1 ≤ Quantia ≤ 15) que representa a quantidade de cobaias utilizadas 
   e um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo de cobaia (R:Rato S:Sapo C:Coelho).
   
   2)-Apresente o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de 
   cobaias utilizadas, sendo que o percentual deve ser apresentado com dois dígitos após o ponto.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error�?.
   
................................................................................................................................................   
           ____________________________________________________
          | Exemplo de Entrada  |      Exemplos de Saída       |
          |       10            |Total: 92 cobaias             |
          |       10 C          |Total de coelhos: 29          |
          |       6 R           |Total de ratos: 40            |
          |       15 S			|Total de sapos: 23            |
          |       5 C	 		|Percentual de coelhos: 31.52 %|
          |		  14 R			|Percentual de ratos: 43.48 %  |
          |		  9 C           |Percentual de sapos: 25.00 %  |
          |		  6 R           |							   |
          |		  8 S           |             				   |
          |		  5 C           |                              |
          |       14 R          |						       |
          |---------------------|------------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1094_Experiências {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.00");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um interio N que indica a quantidade de casos testes que vem a seguir;
		int N      = entrada.nextInt(),
			total  = 0,							//Quantidade total de cobaias;
			quant  = 0,							//Quantidade de cobaias;
		    quantC = 0,							//Quantidade de Coelhos;
		    quantR = 0,							//Quantidade de Ratos;
		    quantS = 0;							//Quantidade de Sapos;		
		char tipo;							    //Tipo de cobaia;
			
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Leia um inteiro Quantia que representa a quantidade de cobaias utilizadas seguido de um caractere Tipo ('C', 'R' ou 'S'), indicando o tipo 
//de cobaia (R:Rato S:Sapo C:Coelho). OBS.: ambos na mesma linha;
		for(int i=0; i<N; i++) {
			
			quant = entrada.nextInt();
			tipo  = entrada.next().charAt(0);
			
			if(tipo == 'C') {									//NOTE que usamos aspas simples ao comparar char;
				quantC = quantC + quant;						//Ao final da execução, isso terá o total de coelhos;
				total  = total + quant;
			}
			if(tipo == 'R') {
				quantR = quantR + quant;						//Ao final da execução, isso terá o total de ratos;
				total  = total + quant;
			}	
			if(tipo == 'S') {
				quantS = quantS + quant;						//Ao final da execução, isso terá o total de sapos;
				total  = total + quant;
			}	
		}
			
//Objetivo 3 ----------------------------------------------------------------------------------------------------------------------------------
//3)- Mostre o total de cobaias utilizadas, o total de cada tipo de cobaia utilizada e o percentual de cada uma em relação ao total de 
//cobaias utilizadas;	
			  		
		System.out.println("Total: " + total + " cobaias" );
		System.out.println("Total de coelhos: " + quantC);
		System.out.println("Total de ratos: " + quantR);
		System.out.println("Total de sapos: " + quantS);
		
//--------------------------------------------------------------------------------------------------------------------------------------------
		double perC = 0,
			   perR = 0,
			   perS = 0;
				
		perC = (double)((quantC * 100)) / total;
		perR = (double)((quantR * 100)) / total;
		perS = (double)((quantS * 100)) / total;

		System.out.println("Percentual de coelhos: "+ saidaFormatada.format(perC) + " %");
		System.out.println("Percentual de ratos: "  + saidaFormatada.format(perR) + " %");
		System.out.println("Percentual de sapos: "  + saidaFormatada.format(perS) + " %");


//---------------------------------------------------------------------------------------------------------------------------------------------
			   
		//System.out.println("" + saidaFormatada.format());
		   entrada.close();
		   
	}
}

