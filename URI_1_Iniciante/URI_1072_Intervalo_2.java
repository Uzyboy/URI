/*
|>Objetivos:  

1)- Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.

2)- Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações.

 ....................................................................................................................................
  
   Condições:
   
   1)- A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste.
   Cada caso de teste a seguir é um valor inteiro X (-107 < X <107);
   
   2)- Para cada caso, imprima quantos números estão dentro (in) e quantos valores estão fora (out) do intervalo;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
......................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |                     |                        |
          |			4           |         2 in           |
		  |		   14           |         2 out          |
		  |		  123           |                        |
          |        10           |                        |
		  | 	  -25           |                        |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1072_Intervalo_2 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A primeira linha da entrada contém um valor inteiro N (N < 10000), que indica o número de casos de teste;
//Cada caso de teste a seguir é um valor inteiro X (-107 < X <107);			   
		int N    = entrada.nextInt(),        
			CASO = 0,						 
			cont = 0,
			in   = 0,
			out  = 0;
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas informações;
//OBS: "[" e "]" significam intervalo fechado, logo seus extremos estão incluidos, nesse caso, 10 e 20;
		
		while(cont < N) {  				    //Isso é para garantir que apenas N numeros sejam lidos;
			CASO = entrada.nextInt();
			if(CASO >= 10 && CASO <= 20) {	//Isso verifica se o CASO está dentro do intervalo;
				in++;  						//Isso contabiliza quantos CASOS estão dentro do intervalo;
			}else {
				out++;						//Isso contabiliza quantos CASOS NÂO estão dentro do intervalo;
			}
			cont++;
		}
		   
		System.out.println(in  + " in");
		System.out.println(out + " out");
		
//---------------------------------------------------------------------------------------------------------------------------------
			   
		entrada.close();
		   
	}
}


