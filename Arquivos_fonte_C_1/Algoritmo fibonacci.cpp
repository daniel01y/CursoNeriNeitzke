#include <conio.h>
#include <stdio.h>

main()
{
	int num_anterior,num_atual,novo_numero,i;
	num_anterior = 0;
	num_atual = 1;
	printf("O 1. numero fibonacci e 1\n");
	for(i=2;i<=10;i++)
	{
 	 	    novo_numero = num_atual + num_anterior;
			num_anterior = num_atual;
			 num_atual = novo_numero;
			 printf("\nO %d. numero fibonacci e %d\n",i,novo_numero);
	}	
	getch();
}
