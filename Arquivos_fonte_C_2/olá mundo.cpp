#include <stdio.h>

main()
{
	int contador;
	char msg[100];
	contador = 0;
    do
	{ 
    printf("\nDigite o nome = ");
    scanf("%s",&msg);
        printf(msg);
    contador = contador + 1;
    }
    while (contador <= 20);
}
