/*
|> -Objetivo-  

  1)- Leia 3 valores inteiros;
  
  3)- Ordene-os em ordem crescente. 
  
  3)- No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.
  
   Condições:
   
   1)- A entrada contem três números inteiros;
   
   2)- Imprima a saída conforme foi especificado.
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         7           |         -14            |
          |        21           |           7            |
          |       -14           |          21            |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1042_Sort_Simples {

	public static void main(String[] args) {
		   
		   Scanner entrada = new Scanner(System.in);
//Objetivo 1 ------------------------------------------------------------------------------------------------------------------------------		   
//1)- Leia 3 valores inteiros;
		   int valor1 = entrada.nextInt(),
			   valor2 = entrada.nextInt(),
			   valor3 = entrada.nextInt();
		   
//Objetivo 2 ------------------------------------------------------------------------------------------------------------------------------		   
//2)- Ordene-os em ordem crescente;
		   int primeiro = 0,
		       segundo = 0,
		       terceiro = 0;
		   
		   if (valor1 < valor2 && valor1 < valor3 ) {
			   primeiro = valor1;
			   if(valor2 < valor3) {
				segundo  = valor2;
			    terceiro = valor3;
			   }else {
				   segundo  = valor3;
				   terceiro = valor2;
			   }
		   
		   }else if (valor2 < valor1 && valor2 < valor3 ) {
			   primeiro = valor2;
			   if(valor1 < valor3) {
				segundo  = valor1;
			    terceiro = valor3;
			   }else {
				   segundo  = valor3;
				   terceiro = valor1;
			   }
		   }else if (valor3 < valor1 && valor3 < valor1 ) {
			   primeiro = valor3;
			   if(valor1 < valor2) {
				segundo  = valor1;
			    terceiro = valor2;
			   }else {
				   segundo  = valor2;
				   terceiro = valor1;
			   }
		   }
		   
//Objetivo 3 ------------------------------------------------------------------------------------------------------------------------------		   
//3)- No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.		   
	
		   System.out.println(primeiro);
		   System.out.println(segundo);
		   System.out.println(terceiro);
		   System.out.println();
		   System.out.println(valor1);
		   System.out.println(valor2);
		   System.out.println(valor3);
   
//------------------------------------------------------------------------------------------------------------------------------------------		   
		   entrada.close();
		
	}

}

