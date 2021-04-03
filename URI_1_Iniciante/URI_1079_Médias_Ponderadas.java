/*
|>Objetivos:  

1)- Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. 

2)- Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 

3)- Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que:
 	-O primeiro valor tem peso 2,
 	-O segundo valor tem peso 3,
 	-e o terceiro valor tem peso 5;
.....................................................................................................................................
  
   Condições:
   
   1)- O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores 
   com uma casa decimal cada valor;
   
   2)- Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme exemplo abaixo;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
......................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
		  |         3           |     				     |
		  |   6.5 4.3 6.2       |		   5.7           |
		  |   5.1 4.2 8.1       |          6.3           |
		  |   8.0 9.0 10.0      |          9.3           |
		  |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1079_Médias_Ponderadas {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.0");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha a seguir contém um caso de teste com três valores 
//com uma casa decimal cada valor;		
		int N = entrada.nextInt();		
		double v1,v2,v3,media;
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//3)- Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que:
//		-O primeiro valor tem peso 2,
// 		-O segundo valor tem peso 3,
//	 	-e o terceiro valor tem peso 5;	
		   for(int i = 0; i < N; i++) {
			   v1 = entrada.nextDouble();
			   v2 = entrada.nextDouble();
			   v3 = entrada.nextDouble();		   
			   
			   v1 = v1*2;
			   v2 = v2*3;
			   v3 = v3*5;
			   
			   media = (v1 + v2 + v3)/10;
			   
			   System.out.println(saidaFormatada.format(media));
		   }
//---------------------------------------------------------------------------------------------------------------------------------------------
		//System.out.println("" + saidaFormatada.format());
		   entrada.close();
		   
	}
}

