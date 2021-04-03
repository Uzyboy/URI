/*
|> Dois carros (X e Y) partem em uma mesma direção. O carro X sai com velocidade constante de 60 Km/h e o carro Y sai com velocidade 
constante de 90 Km/h;

Em uma hora (60 minutos) o carro Y consegue se distanciar 30 quilômetros do carro X, ou seja, consegue se afastar um quilômetro a ca-
da 2 minutos;

Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o carro Y tomar essa distância do outro carro.
  
   Condições:
   
   1) O arquivo de entrada contém um número inteiro;
  
   2) Imprima o tempo necessário seguido da mensagem "minutos".
   
   3)-Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          30         |         60 minutos     |
          |---------------------|------------------------|
          |         110         |        220 minutos     |
          |---------------------|------------------------|
          |           7         |          14 minutos    |
          |---------------------|------------------------|
          
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1016_Distância {
	

	public static void main(String[] args) {
	    
		Scanner entrada = new Scanner(System.in);
		
		int DIST = entrada.nextInt(),
			MIN;
		//Se em 60min o carro Y está a 30Km do carro X, em quantos minutos ele leva pra estar a DIST Km do carro X?
		//  min        KM                           
		//  60    \/   30
		//  x     /\   DIST
		// 
		// 30x = 60 * DIST => x= 60DIST/30
		
		MIN = (60 * DIST) / 30;
		
		System.out.printf("%d minutos", MIN);		
		
		System.out.println();   		
		
		entrada.close();
	}

}
 