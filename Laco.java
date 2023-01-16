package Condicional;

import java.util.Scanner;

public class Laco {
	
	public  static  void  principal ( String [] args ) {
		
		Scanner  leia = novo  Scanner ( System . in );
	      int  numero , codigo , quantidade ;
	      float  valor_Total ;
	      
	      
	      Sistema . fora . println ( "\n Digite um numero: " );
	      numero = leia . proximoInt ();
	      
	      se ( número == 0 )
	      {
	          Sistema . fora . println ( "\nPar!" );
	      }
	      outro 

	      if ( numero % 2 == 0 && numero > 0 )

	      {
	          Sistema . fora . println ( "\n Par e Positivo!" );
	      }
	      else  if ( numero % 2 == 1 && numero > 0 )
	      {

	          Sistema . fora . println ( "\nÍmpar e Positivo!" );
	      }
	      if ( numero % 2 == 0 && numero < 0 )

	      {
	          Sistema . fora . println ( "\nPar e Negativo!" );
	      }
	      senão  se ( número < 0 )
	      {   Sistema . fora . println ( "\nÍmpar e Negativo!" );
	      }
	 
	      	
	      
	  		Sistema . fora . println ( "\n\t\t\t Olá,Seja Bem-Vindo ao KL Burgues!" );
	  		Sistema . fora . println ( "\n\n\t\t\t\t Cardápio" );
	  		
	  		Sistema . fora . println ( "\n\n Lanches" );
	  		Sistema . fora . println ( "\n\n 1 - Cachorro Quente - R$10,00" );
	  		Sistema . fora . println ( "\n 2 - X-Salada - R$15,00" );
	  		Sistema . fora . println ( "\n 3 - X-Bacon - R$18,00" );
	  		Sistema . fora . println ( "\n 4 - Bauru - R$12,00" );
	  		Sistema . fora . println ( "\n\n Bebidas" );
	  		Sistema . fora . println ( "\n 5 - Refrigerante - R$8,00" );
	  		Sistema . fora . println ( "\n 6 - Suco de Laranja - R$13,00" );
	  		Sistema . fora . println ( "\n\nDigite aqui o código: " );
	  		código = leia . proximoInt ();
	  		Sistema . fora . println ( "\nDigite a quantidade desse produto: " );
	  		quantidade = leia . proximoInt ();
	  		
	  		interruptor ( código )
	  		{
	  		caso  1 :
			valor_Total = ( float ) ( quantidade * 10 );
			Sistema . fora . printf ( "\nVocê comprou: " + quantidade + " Cachorro Quente e o valor total ficou: R $ " + valor_Total ) ;
			quebrar ;
	  		
			caso  2 :
			valor_Total = ( float ) ( quantidade * 15 );
			Sistema . fora . printf ( "\n Você comprou: " + quantidade + " X-Salada e o valor total ficou: R $ " + valor_Total );
			quebrar ;
			
			caso  3 :
				valor_Total = ( float ) ( quantidade * 18 );
				Sistema . fora . printf ( "\n Você comprou: " + quantidade + " X-Bacon e o valor total ficou: R$ " + valor_Total ) ;
			quebrar ;
				
			caso  4 :
				valor_Total = ( float ) ( quantidade * 12 );
				Sistema . fora . printf ( "\n Você comprou: " + quantidade + " Bauru e o valor total ficou: R $ " + valor_Total );
			quebrar ;
			caso  5 :
				valor_Total = ( float ) ( quantidade * 8 );
				Sistema . fora . printf ( "\n Você comprou: " + quantidade + " Refrigerante e o valor total ficou: R $ " + valor_Total ) ;
			quebrar ;
			caso  6 :
				valor_Total = ( float ) ( quantidade * 13 );
				Sistema . fora . printf ( "\n Você comprou: " + quantidade + " Suco de Laranja e o valor total ficou: R $ " + valor_Total );
			quebrar ;
			
			padrão :
				
				Sistema . fora . println ( "opção Inválida" );
			
			
	  		}
	
	 }
}
