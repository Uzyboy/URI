/*
! A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

|> Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

   Condições:
   1)-A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.
   
   2)-Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo, com 4 casas após o ponto decimal. 
   Utilize variáveis de dupla precisão (double). Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado,
    caso contrário, você receberá "Presentation Error".
    
    | Exemplos de Entrada | Exemplos de Saída |
    |        2.00         |   A=12.5664       |
    |        100.64       |   A=31819.3103    |
    |        150.00       |   A=70685.7750    |
    -------------------------------------------
___________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante; //Declaração de Pacote

import java.util.Scanner;  //Invocação da Classe Sccaner

public class URI_1002_Área_do_Circulo {  //Declaração da Classe �?rea do Circulo

	public static void main(String[] args) { //Inicio do Método Principal
		
		//Scanner nomePersonalizado = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);
		
		 double raio,          //Declaração de variavel do tipo ponto flutuante de dupla prescisão(double)
	            r = 3.14159;   //Declaração de variavel do tipo ponto flutuante de dupla prescisão(double)
		
		 raio = entrada.nextDouble();//Isso atribui o prox. valor de entrada para a variavel "raio"
		 
		 double Area;
		 
		 Area = (raio * raio ) * r;
		 
		 System.out.printf("A=%.4f \n", Area,"\n");
		 System.out.println(); 	 		 

		entrada.close();//finaliza o uso do Sccaner
	}

}
