#include <stdio.h>
#include <conio.h>

main()
{
		int numero_inicial,numero_final,numeros_pares,numeros_impares,i;
	numeros_pares = 0;
	numeros_impares = 0;
	numero_final = 0;
	printf("Digite o numero incial = ");
	scanf("%d",&numero_inicial);
	i = numero_inicial;
	do
	{
		printf("Digite o numero final maior que %d = ",numero_inicial);
		scanf("%d",&numero_final);
		if (numero_final < numero_inicial)
		printf("Numero final invalido,deve ser maior que o inicial\n");
	}
	    while (numero_final < numero_inicial);
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
