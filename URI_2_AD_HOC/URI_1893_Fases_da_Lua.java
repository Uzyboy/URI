/*
|>Objetivos: 
	Jade ganhou de presente de aniversário um telescópio e ficou muito feliz, pois adora olhar a lua à noite. Ela sempre foi uma estudante muito boa,
e só analizando a lua por duas noites seguidas, já consegue identificar as mudanças que ocorreram na iluminação e o percentual aproximado da lua que
está iluminada.
	Você, que é amigo da Jade e estuda Computação, resolveu fazer um pequeno programa que, baseado nesta avaliação que ela fez nas duas últimas noi-
tes, informa a fase na qual a lua se encontra. Se a porção visível da lua no momento estiver entre 0 e 2%, por exemplo, é lua nova, se for entre 3 e 
96% é lua crescente, se for entre 97 e 100% é lua cheia e se for entre 96 e 3% (diminuindo) é lua minguante.

....................................................................................................................................................   
  
   Condições:a
   
   1)- A entrada é composta por uma única linha contendo dois valores inteiros. O primeiro valor corresponde ao percentual observado por Jade na no-
   ite de dois dias atrás. O segundo valor corresponde ao percentual observado por jade na noite anterior.
	   
   2)-Baseado nos dois percentuais observados por Jade, imprima na tela a fase na qual a lua se encontrava na noite anterior, conforme o exemplo aba-
   ixo. 
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
....................................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          | 0 2                 |    nova			     |
          |---------------------|------------------------|
          | 2 3                 |    crescente			 |
          |---------------------|------------------------|
          | 99 97			    |    cheia				 |
          |---------------------|------------------------|
          | 97 94 				|    minguante			 |
          |---------------------|------------------------|
          | 30 35			    |	 crescente			 |
          |---------------------|------------------------|
____________________________________________________________________________________________________________________________________________________
*/
package URI_2_AD_HOC;

import java.util.Scanner;

public class URI_1893_Fases_da_Lua {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in); 
		
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------------		
//1)- Entre com  dois valores inteiros. O primeiro valor corresponde ao percentual observado por Jade na noite de dois dias atrás. O segundo valor 
//corresponde ao percentual observado por jade na noite anterior.
    	int percent_1 = entrada.nextInt();
    	int percent_2 = entrada.nextInt();
	
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------------		
//2)- Se a porção visível da lua no momento estiver entre:
    	
    	//2.1)- Defina se a Lua está "aparecendo" ou "sumindo";
    	if(percent_1 <= percent_2) {//Ela está aparecendo
    		
    	//Entre 0 e 2%, é lua nova;
    		if(percent_1 >= 0 && percent_2 <=2) {
    			System.out.println("nova");
    		
    		//Se for entre 3 e 96%, é lua crescente;
    		}else if(percent_2 <=96 ) {
    			System.out.println("crescente");
    		 
    		//se for entre 97 e 100% é lua cheia
    		}else if(percent_2 <= 100) {
    			System.out.println("cheia");
    		}    	
    		
    	}else if(percent_2 <= percent_1) {//Ela está sumindo
    	//se for entre 97 e 100% é lua cheia
    		if(percent_1 <= 100 && percent_2 >= 97) {
    			System.out.println("cheia");   
    		
    		//se for entre 96 e 3% (diminuindo) é lua minguante	
    		}else if(percent_2 <= 96 && percent_2 >= 3 && percent_1 > 3) {
    			System.out.println("minguante");
    		
    		//Entre 0 e 2%, é lua nova;
    		}else if(percent_2 <= 2) {
    			System.out.println("nova");
    		}    	
    		
    	}
    	
//--------------------------------------------------------------------------------------------------------------------------------------------------	
		entrada.close();
	}		   			
}


