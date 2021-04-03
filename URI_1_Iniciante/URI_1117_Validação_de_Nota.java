/*
|>Objetivos:  

1)- Faça um programa que leia as notas referentes às duas avaliações de um aluno. 
2)- Calcule e imprima a média semestral. 
3)- Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao intervalo [0,10]).
Cada nota deve ser validada separadamente.

............................................................................................................................
  
   Condições:
   
   1)- A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas;
   
   2)- 
   a) Se uma nota inválida for lida, deve ser impressa a mensagem "nota invalida";
   b) Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo;
   c) O valor deve ser apresentado com duas casas após o ponto decimal;
   
   3)- Não esqueça de imprimir o fim de linha após a saida, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
   
   ...................................................................................................................................   
           ______________________________________________
          | Exemplo de Entrada  |    Exemplos de Saída   |
          |       -3.5          |     nota invalida      |
          |---------------------|------------------------|
          |        3.5          |     nota invalida      |
          |---------------------|------------------------|
          |       11.0          |						 |
          |---------------------|     media = 6.75       |
          |       10.0          |        		         |
          |---------------------|------------------------|

_____________________________________________________________________________________________________________________________________
*/
package URI_1_Iniciante;

import java.util.Scanner;
import java.text.DecimalFormat;

public class URI_1117_Validação_de_Nota {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat saidaFormatada = new DecimalFormat("0.00");
		      
//Objetivo 1 ----------------------------------------------------------------------------------------------------------------------------------
//1)- A entrada contém vários valores reais, positivos ou negativos. O programa deve ser encerrado quando forem lidas duas notas válidas;
				   
		double nota1 = 0,				//Primeira nota a ser lida
			   nota2 = 0,				//Segunda nota a ser lida
			   media;				    //Media das duas notas
		boolean verNotas = false,       //Essa variavel será responsavel por verificar se 2 notas validas jã foram lidas;
				ver1 = true,   	        //Essa variavel será responsavel por verificar se a 1° nota é invalida;
				ver2 = true;		    //Essa variavel será responsavem por verificar se a 2° nota é invalida;
//Objetivo 2 ----------------------------------------------------------------------------------------------------------------------------------
//2)- 
//a) Se uma nota inválida for lida, deve ser impressa a mensagem "nota invalida";
//b) Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = " seguido do valor do cálculo;
//c) O valor deve ser apresentado com duas casas após o ponto decimal;
		while(verNotas == false) {							//Quando for verdade, duas notas lidas foram consideradas validas;

			while(ver1 == true) {							//Enquanto for verdade a nota é invalida;
				nota1 = entrada.nextDouble();
				if (nota1 < 0 || nota1 >10) {				//Isso verifica se a nota é invalida, caso seja, uma nova nota será lida;
					System.out.println("nota invalida");
				}else {
					ver1 = false;							//Caso ela esteja dentro do intervalo ela é considerada valida;
				}
			}
			
			while(ver2 == true) {							//Enquanto for verdade a nota é invalida;
				nota2 = entrada.nextDouble();
				if (nota2 < 0 || nota2 >10) {				//Isso verifica se a nota é invalida, caso seja, uma nova nota sera lida;
					System.out.println("nota invalida");	
				}else {
					ver2 = false;							//Caso ela esteja dentro do intervalo será considerada valida;
				}
			}
			
			verNotas = true;
		}
			media = (nota1 + nota2)/2;
			
			System.out.println("media = " + saidaFormatada.format(media));		
		   
//---------------------------------------------------------------------------------------------------------------------------------------
		   entrada.close();
		   
	}
}

