/*
|> Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do 
aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 
0 até 10.0, sempre com uma casa decimal.


   Condições:
   
   1)-O arquivo de entrada contém 2 valores com uma casa decimal cada um;
   
   2)- IImprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em 
   branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double);
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

          | Exemplos de Entrada | Exemplos de Saída |
          |         5,0                             |
          |         7,1         | MEDIA = 6.43182   |
          |-----------------------------------------|                
          |         0,0                             |
          |         7,1         | MEDIA = 4.84091   |
          |-----------------------------------------|
          |         10.0                            |
          |         10.0        | MEDIA = 10.00000  |
          |_________________________________________|


______________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante;

import java.util.Scanner;  //Invocação da Classe Sccaner

public class URI_1005_Média_1 {

	public static void main(String[] args) {
		
		double A,   //Declaração de variavel do tipo ponto flutuante de dupla prescisão(double)
               B;   //Declaração de variavel do tipo ponto flutuante de dupla prescisão(double)
		
		Scanner entrada = new Scanner(System.in);
		
		A = entrada.nextDouble();
		B = entrada.nextDouble();
		
		double MEDIA = ((A * 3.5) + (B * 7.5)) / 11.00;
		
		System.out.printf("MEDIA = %.5f ", MEDIA);

		entrada.close();

	}

}
