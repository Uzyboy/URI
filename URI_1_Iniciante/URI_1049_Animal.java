/*
|>Objetivos: 

1)- Leia 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita;

2)- Em seguida conclua qual dos animais seguintes foi escolhido, através das três palavras fornecidas.
.............................................................................................................................

	                        carnivoro --------------------aguia 	
                        ave{ 
 		                    onivoro ----------------------pomba
			vertebrado{
                                 onivoro -----------------homem
	                    mamifero{
		                         herbivoro ---------------vaca
		                         

              		           hematofago ----------------pulga	
                        inseto{ 
 		                       herbivoro -----------------lagarta
          invertebrado{
                                 hematofago --------------sangue-suga
                        anelideo{
		                         minhoca -----------------minhoca


  
   Condições:
   
   1)- A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o animal segundo a figura acima, com todas as letras 
   minúsculas.
   
   2)- Imprima o nome do animal correspondente à entrada fornecida.

   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
	      |  	vertebrado      |         homem          |
		  |		mamifero        |                        |
	      | 	onivoro         |                        |
          |---------------------|------------------------|
          |     vertebrado      |    	  aguia          |
		  |		ave             |                        |
		  |		carnivoro       |                        |
 		  |---------------------|------------------------|
          |     invertebrado    |         minhoca        |
          |     anelideo        |						 |
          |     onivoro         |	 				     |
          |---------------------|------------------------|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1049_Animal {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia 3 palavras que definem o tipo de animal possível segundo o esquema abaixo, da esquerda para a direita;
		String tipo1 = entrada.next(), tipo2 = entrada.next(), tipo3 = entrada.next(); 		   
		
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Imprima o nome do animal correspondente à entrada fornecida;
//Use o objeto -identifcador-.equal(); para comparar Strings
		if (tipo1.equals("vertebrado")) {

			if(tipo2.equals("ave")) {
			
				if(tipo3.equals("carnivoro")) {
					System.out.println("aguia");
				
				}else if(tipo3.equals("onivoro")){
					System.out.println("pomba");
				}
		
			}else if(tipo2.equals("mamifero")) {
				
				if(tipo3.equals("onivoro")) {
					System.out.println("homem");
				
				}else if(tipo3.equals("herbivoro")) {
					System.out.println("vaca");
				
				}
			}
		}else if(tipo1.equals("invertebrado")) {
			
			if(tipo2.equals("inseto")) {
				
				if(tipo3.equals("hematofago")) {
					System.out.println("pulga");
					
				}else if(tipo3.equals("herbivoro")) {
					System.out.println("lagarta");
					
				}
			}else if(tipo2.equals("anelideo")) {
				
				if(tipo3.equals("hematofago")) {
					System.out.println("sanguessuga");
					
				}else if(tipo3.equals("onivoro")) {
					System.out.println("minhoca");
					
				}
			}
		}
		   
//Objetivo 3 ---------------------------------------------------------------------------------------------------------------------------------
//			   
		   
		   entrada.close();
		   
	}
}

