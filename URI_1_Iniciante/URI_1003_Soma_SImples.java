/*|>Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA.
A seguir escrever o valor desta variável.
   
  Condições:
  1)- O arquivo de entrada contém 2 valores inteiro;
  
  2)- Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido 
  pelo valor correspondente à soma de A e B. 

  3)- Como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, 
  caso contrário, você receberá "Presentation Error".

          | Exemplos de Entrada | Exemplos de Saída |
          |        30                               |
          |        10           |    SOMA = 40      |
          |-----------------------------------------|                
          |       -30                               |
          |        10           |    SOMA =-20      | 
          |-----------------------------------------|
          |         0                               |
          |         0           |    SOMA = 0       |
          |-----------------------------------------|


___________________________________________________________________________________________________________________________________
*/

package URI_1_Iniciante; //Declaração de Pacote

import java.util.Scanner; //Invocação da clase Scanner

public class URI_1003_Soma_SImples { //Declaração da Classe "SomaSimples"

	public static void main(String[] args) { //Inicio do Método Principal
		
		int A; //Declaração da variável "A" do tipo Inteiro(Int);
		int B; //Declaração da variável "B" do tipo Inteiro(Int);
		
	  //Scanner nomePersonalizado¹ = new Scanner(System.in);
		Scanner entrada = new Scanner(System.in);

      //Variavel = nomePersonalizado¹.next-Tipo_de_dado_da_entrada-();
		A = entrada.nextInt();
		B= entrada.nextInt();
		
		int SOMA; 
		
		SOMA = A + B ;
		
		System.out.println("SOMA = "+ SOMA);
		
		entrada.close();

	}

}
