#include <conio.h>
#include <stdio.h>

main()
{
	int numero_inicial,numero_final,numeros_pares,numeros_impares,i;
	numeros_pares = 0;
	numeros_impares = 0;
	printf("Digite o numero incial = ");
	scanf("%d",&numero_inicial);
	i = numero_inicial;
	printf("Digite um numero final = ");
	scanf("%d",&numero_final);
	while (i <= numero_final)
    {
    	if (i % 2 == 0)
    	numeros_pares++;
    	else
    	numeros_impares++;
    	i++;
	}
	printf("Entre o numero %d e o numero %d existem %d pares e %d impares",numero_inicial,numero_final,numeros_pares,numeros_impares);
	getch();
}
