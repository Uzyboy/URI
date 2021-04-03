/*
|>- Objetivos:

1)- Leia um número inteiro que representa um código de DDD para discagem interurbana;

2)- Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

  		   ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |         61          |       Brasilia         |
          |---------------------|------------------------|
          |         71          |       Salvador         |
          |---------------------|------------------------|
          |         11          |       Sao Paulo        |
          |---------------------|------------------------|
          |         21          |       Rio de Janeiro   |
          |---------------------|------------------------|
          |         32          |       Juiz de Fora     |
          |---------------------|------------------------|
          |         19          |       Campinas         |
          |---------------------|------------------------|
          |         27          |       Vitoria          |
          |---------------------|------------------------|
          |         31          |       Belo Horizonte   |
          |_____________________|________________________|

3)- Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar: DDD nao cadastrado
  
   Condições:
   
   1)- A entrada consiste de um único valor inteiro;  
   
   2)- Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
   
   3)-Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |          11         |        Sao Paulo       |
          |_____________________|________________________|
_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;

public class URI_1050_DDD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- Leia um número inteiro que representa um código de DDD para discagem interurbana;
		
		int DDD = entrada.nextInt();	   

//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- Em seguida, informe à qual cidade o DDD pertence, considerando a tabela listada na area de objetivos:
		if ( DDD == 61 ) {
			
			System.out.println("Brasilia");
			}else if ( DDD == 71 ) {
				
					System.out.println("Salvador");
				}else if ( DDD == 11 ) {
					
					System.out.println("Sao Paulo");
						}else if ( DDD == 21 ) {
							
							System.out.println("Rio de Janeiro");
							}else if ( DDD == 32 ) {
								
								System.out.println("Juiz de Fora");
								}else if ( DDD == 19 ) {
									
									System.out.println("Campinas");
									}else if ( DDD == 27 ) {
										
										System.out.println("Vitoria");
										}else if ( DDD == 31 ) {
											
											System.out.println("Belo Horizonte");
											}else {
												System.out.println("DDD nao cadastrado");
												
												}

//-----------------------------------------------------------------------------------------------------------------------------------------
	   
		   entrada.close();
		   
	}
}

