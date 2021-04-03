/*
|>Objetivos: 
	Péricles é um rapaz que tem um interesse único por história. Utilizando seu atualizadíssimo navegador de internet rapoza croma
da, conheceu até os sitios mais remotos e obscuros atrás de informações sobre a mitologia grega.

	Por ironia do destino, o navegador de Péricles acabou sendo infectado por um malware com uma caracterísica peculiar: cada vez 
que Péricles fechava uma aba no seu navegador, outras duas abas apareciam! No entanto, quando Péricles clicou sem querer em uma das
propagandas de uma aba, percebeu que, por um erro do navegador, a aba foi encerrada (sem abrir outras abas). Por causa do malware, 
todas as abas possuem irritantes propagandas.

	Sua tarefa é descobrir com quantas abas que o navegador de Péricles ficou, sabendo o número inicial de abas e a sequência de 
ações de Péricles. As ações podem ser fechou (quando Péricles fechou uma aba) ou clicou (quando Péricles clicou em uma propaganda).

....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada é iniciada por uma linha contendo dois números inteiros positivos, N e M (0 < N, M < 500), representando o número 
   inicial de abas e o número de ações de Péricles. Cada linha subsequente contém uma ação (fechou ou clicou). Naturalmente, o número 
   de abas é sempre maior ou igual a zero.
   
   2)- A saída deve ser uma linha contendo o número final de abas.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 3 5					|	 2					 |
		  |	fechou				|						 |
		  |	fechou				|						 |
		  |	clicou				|						 |
		  |	clicou				|						 |	
		  |	clicou				|						 |	
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;


public class URI_2061_As_Abas_de_Péricles {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia dois números inteiros positivos, N e M (0 < N, M < 500);
    	int N = entrada.nextInt();	//Número de abas abertas iniciais;
    	int M = entrada.nextInt(); 	//Número de ações tomadas;
    	String acao;

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Calcule quantas abas que o navegador de Péricles ficou, sabendo o número inicial de abas(N) e a sequência de ações de Péricles(M). 
//As ações podem ser fechou (quando Péricles fechou uma aba) ou clicou (quando Péricles clicou em uma propaganda).
    	
    	//2.1)- Execute somente M ações
    	int cont = 0;
    	while(cont<M) {
     		cont++;
    		//2.2)- Leia uma string que será a ação;
     			   acao = entrada.nextLine();
    		
    		//2.3)- Se a ação for "fechou", o número de abas aumenta em 2;
    		if(acao.equals("fechou")) {
    			N = N+1;
    		
    		//2.4)- Caso contrário a o número de ações diminui em 1;
    		}else  {
    			N = N-1;
    		
    		}   		
    		
    	}
    	
    	System.out.println(N);
    	
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	

    	entrada.close();
		   		
	}
}

