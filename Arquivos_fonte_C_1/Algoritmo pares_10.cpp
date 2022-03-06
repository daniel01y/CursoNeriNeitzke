#include <conio.h>
#include <stdio.h>

main()
{
	int conta_pares = 0,numero = 1;
	while (conta_pares < 10)
	{
		if (numero % 2 == 0)
		{
		printf("\nO numero %d e par\n",numero);
		conta_pares = conta_pares + 1;
	}
	numero = numero + 1;
	}
	printf("Digite um numero = \n");
	scanf("%d",&numero);
	if (numero % 2 == 0)
	printf("O numero %d e par",numero);
	else
	printf("O numero %d e impar",numero);

    getch();
    }
