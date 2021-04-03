/*
|>Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R). A fórmula para calcular o vo-
lume é: (4/3) * pi * R³. Considere (atribua) para pi o valor 3.14159.

Dica: Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois algumas linguagens (dentre elas o C++), assumem que o resultado da
divisão entre dois inteiros é outro inteiro.

   Condições:
   
   1)- O arquivo de entrada contém um valor de ponto flutuante (dupla precisão), correspondente ao raio da esfera.
   
   2)- A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualda-
   de. O valor deverá ser apresentado com 3 casas após o ponto.
      
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   

          | Exemplos de Entrada |    Exemplos de Saída    |
          |        3            |VOLUME = 113.097         | 
          |---------------------|-------------------------|                
          |        15           |VOLUME = 14137.155       |
          |---------------------|-------------------------|
          |        1523         |VOLUME = 14797486501.627 |
          |_____________________|_________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1011_Esfera {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		double RAIO = entrada.nextDouble(),
			   PI   = 3.14159,
			   VOL = (4.0/3.0) * PI * Math.pow(RAIO, 3); //VOLUME
		
		System.out.printf("VOLUME = %.3f", VOL);			
		
		System.out.println();   		
		
		entrada.close();
		
	}

}
