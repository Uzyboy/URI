/*
|>Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de A e B atribuindo o seu resultado na variável X. 
Imprima X conforme exemplo apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo especificado e não 
de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error";

Condições:

  1)-A entrada contém 2 valores inteiros;
  
  2)-Imprima a mensagem "X = " (letra X maiúscula) seguido pelo valor da variável X e pelo final de linha. Cuide para que tenha 
  um espaço antes e depois do sinal de igualdade, conforme o exemplo abaixo.
  
                                                       X = 19

---------------------------------------------------------------------------------------------------------------------------------
*/
package URI_1_Iniciante;  //Declaração de Pacote

import java.util.Scanner;  //Invocação da Classe Sccaner

public class URI_1001_Extremamente_Básico {   //Declaração de Classe

		public static void main(String[] args) {   //Inicio do Método Principal

		  //Scanner NomePersonalizado¹ = new Scanner(System.in);
			Scanner entrada = new Scanner(System.in);
			
			int A; //Declaração de variavel do tipo inteiro(int)
			int B; //Declaração de variavel do tipo inteiro(int)
		
	      //Variavel = nomePersonalizado¹.nextTipodaEntrada();
			A = entrada.nextInt();//Isso atribui o prox. valor de entrada para a variavel A
            B = entrada.nextInt();//Isso atribui o prox. valor de entrada para a variavel A

            int X; 
            
            X = A + B;
            
            System.out.println("X = "+X);
            
            entrada.close();//finaliza o uso do Scanner
	}  //Fim do Método Principal

}   //Fim da Classe SomaInt
