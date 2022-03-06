#include <conio.h>
#include <stdio.h>
#include <stdbool.h>

main()
{
	int numero,i;
	bool contador;
	i = 2;
    contador = true;
	printf("Digite um numero = ");
	scanf("%d",&numero);
	while (i < numero / 2)
	{
		if (numero % i == 0)
		contador = false;
	i = i + 1;
     } 
	if (contador = false)
	printf("O numero %d nao e primo",numero);
	else
	printf("O numero %d e primo",numero);
	
	printf("\n\n\n>>>>FIM<<<<");
	getch();	
		
}
