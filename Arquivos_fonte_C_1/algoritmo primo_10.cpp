#include <conio.h>
#include <stdio.h>

main()
{
	int numero,i,contador,conta_primos;
	numero = 1;
	conta_primos = 0;
	while (conta_primos < 10)
	{
		contador = 0;
		numero++;
		i = 2;
	while ((i <= (numero / 2)) && (contador == 0))
	{
		  if (numero % i == 0)
		  contador = contador + 1;
	   	  i = i + 1;
     } 
	if (contador == 0)
	{
		conta_primos++;
		printf("\nO numero %d e o %d primo",numero,conta_primos);
	}
	}
	
	printf("\n\n\n>>>>FIM<<<<");
	getch();	
		
}
