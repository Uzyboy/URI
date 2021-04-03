/*
|>Objetivos: Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever 
a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Consi-
dere que a senha correta é o valor 2002.
....................................................................................................................................................   
  
   Condições:
   
   1)- A entrada é composta por vários casos de testes contendo valores inteiros.
  
   2)- Para cada valor lido mostre a mensagem correspondente à descrição do problema.
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
		  |	2200 				|	Senha Invalida       |
		  | 1020 				|	Senha Invalida		 |
		  |	2022 				|	Senha Invalida		 |
		  |	2002 				|	Acesso Permitido     |     
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1114_Senha_Fixa {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
     
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1) Leia um inteiro Senha e analise se ele é a senha 2002, caso sim, imprim "Acesso Permitido", caso não imprima "Senha Invalida"
		int senha = entrada.nextInt(),
			verificador = 0;
		
		while(verificador == 0) {
			if(senha == 2002) {
				System.out.println("Acesso Permitido");
				verificador = 1;
			}else {
				System.out.println("Senha Invalida");
			}
			senha = entrada.nextInt();
		}
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

