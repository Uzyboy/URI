/*
|>Objetivos:
1)- Leia a hora inicial e a hora final de um jogo; 
2)- A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora
e máxima de 24 horas.  

 ............................................................................................................................................
  
   Condições:
   
   1)- A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

   2)- Apresente a duração do jogo conforme exemplo abaixo.

   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |      16  2          |O JOGO DUROU 10 HORA(S) |
          |---------------------|------------------------|
          |      0   0          |O JOGO DUROU 24 HORA(S) |
          |---------------------|------------------------|
          |      2  16          |O JOGO DUROU 14 HORA(S) |
          |_____________________|________________________|          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1046_Tempo_de_Jogo {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
		   
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------           
//1)- Leia a hora inicial e a hora final de um jogo;
           int INICIO = entrada.nextInt(),
        		  FIM = entrada.nextInt();

//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------           
//2)- A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora
//e máxima de 24 horas.          
           int DURACAO;

           if(INICIO == FIM){ // tendo uma duração mínima de 1 hora nunca sera possivel começar e terminar na mesma hora do mesmo dia
        		    
        	   DURACAO = 24;
        	   
           }else {
        	   if(INICIO > 12 ) {

        		   INICIO = 24 - INICIO;
        		   	
        	   }else {
        		   	
        		   INICIO = INICIO + 12 ;
        		   INICIO = 24 - INICIO;
        	   }
         
           if(FIM > 12 ){
        	   
        	   FIM = FIM - 12;
           }
        	
           DURACAO = INICIO + FIM;
           
           }
//--------------------------------------------------------------------------------------------------------------------------------
           System.out.printf("O JOGO DUROU %d HORA(S)\n", DURACAO);
           
//---------------------------------------------------------------------------------------------------------------------------------           
           entrada.close();
		
	}

}

