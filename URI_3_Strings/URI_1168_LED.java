/*
|>Objetivos: JoÃ£o quer montar um painel de leds contendo diversos nÃºmeros. Ele nÃ£o possui muitos leds, e nÃ£o tem certeza se conseguirÃ¡ montar o 
nÃºmero desejado. Considerando a configuraÃ§Ã£o dos leds dos nÃºmeros abaixo, faÃ§a um algoritmo que ajude JoÃ£o a descobrir a quantidade de leds neces
sÃ¡rio para montar o valor.

//1: 2 LEDs;
//2: 5 LEDs;
//3: 5 LEDs;
//4: 4 LEDs;
//5: 5 LEDs;
//6: 6 LEDs;
//7: 3 LEDs;
//8: 7 LEDs;
//9: 6 LEDs;
//0: 6 LEDS;

....................................................................................................................................................   
  
   CondiÃ§Ãµes:
   
   1)- A entrada contÃ©m um inteiro N, (1 â‰¤ N â‰¤ 1000) correspondente ao nÃºmero de casos de teste, seguido de N linhas, cada linha contendo um nÃº-
   mero (1 â‰¤ V â‰¤ 10^100) correspondente ao valor que JoÃ£o quer montar com os leds.
   
   2)- Para cada caso de teste, imprima uma linha contendo o nÃºmero de leds que JoÃ£o precisa para montar o valor desejado, seguido da palavra 
   "leds".
   
   3)- NÃ£o esqueÃ§a de imprimir o fim de linha apÃ³s a saida, caso contrÃ¡rio seu programa apresentarÃ¡ a mensagem: â€œPresentation Errorâ€�.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de SaÃ­da   |
          | 3					|						 |
		  | 115380				| 27 leds				 |
		  |	2819311				| 29 leds				 |
		  |	23456				| 25 leds				 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_3_Strings;

import java.util.Scanner;

public class URI_1168_LED {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Leia um inteiro N, (1 â‰¤ N â‰¤ 1000) correspondente ao nÃºmero de casos de teste;
		int N = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Em cada N linha seguinte, leia um nÃºmero inteiro V na forma de String,(1 â‰¤ V â‰¤ 10^100) correspondente ao valor que JoÃ£o quer montar com os leds.
		for(int i=0; i<N; i++) {
			
			//2.1 Leia uma String V,que contem nÃºmeros inteiros correspondente ao valor que JoÃ£o quer montar com LEDs
			String V = entrada.next();
			
			//2.2 Declare um contador de LEDs
			int contLEDs = 0;
			
			//2.3 Ponha uma condiÃ§Ã£o de incremento de LED pra cada nÃºmero, cada nÃºmero gasta um nÃºmero especifico de LEDs;
			for(int j=0; j<V.length(); j++) {
				//1: 2 LEDs;
				if(V.charAt(j) == '1') {
					contLEDs += 2;
				}
				//2: 5 LEDs;
				if(V.charAt(j) == '2') {
					contLEDs += 5;
				}
				//3: 5 LEDs;
				if(V.charAt(j) == '3') {
					contLEDs += 5;
				}
				//4: 4 LEDs;
				if(V.charAt(j) == '4') {
					contLEDs += 4;
				}
				//5: 5 LEDs;
				if(V.charAt(j) == '5') {
					contLEDs += 5;
				}
				//6: 6 LEDs;
				if(V.charAt(j) == '6') {
					contLEDs += 6;
				}
				//7: 3 LEDs;
				if(V.charAt(j) == '7') {
					contLEDs += 3;
				}
				//8: 7 LEDs;
				if(V.charAt(j) == '8') {
					contLEDs += 7;
				}
				//9: 6 LEDs;
				if(V.charAt(j) == '9') {
					contLEDs += 6;
				}
				//0: 6 LEDS;
				if(V.charAt(j) == '0') {
					contLEDs += 6;
				}
			}
			System.out.println(contLEDs + " leds");
		}
		
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
		   		
	}
}

