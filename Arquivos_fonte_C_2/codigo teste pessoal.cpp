#include <conio.h>
#include <stdio.h>

main()
{
	int numero,i;
	float multiplicado;
	
	printf("Digite um numero multiplicador = ");
	scanf("%d",&multiplicado);
	for (i=0;i<1000;)
	{
	printf("Digite o numero a ser calculado = ");
	scanf("%d",&numero);
	if  ((numero < 0) || (numero > 1000))
	   printf("Digite um numero valido = ");
	   i--;

}
    multiplicado = multiplicado * numero;
    printf("O resultado da multiplicacao = %d",multiplicado);
    getch();
	}
