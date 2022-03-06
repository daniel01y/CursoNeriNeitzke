#include <conio.h>
#include <stdio.h>

main()
{
	int numero,i,contador;
	contador = 0;
	i = 2;
	printf("Digite um numero = ");
	scanf("%d",&numero);
	while ((i <= (numero / 2)) && (contador == 0))
	{
		printf("%d",i);
		if (numero % i == 0)
		contador = contador + 1;
	i = i + 1;
     } 
	if (contador > 0)
	printf("\nO numero %d nao e primo",numero);
	else
	printf("\nO numero %d e primo",numero);
	
	printf("\n\n\n>>>>FIM<<<<");
	getch();	
		
}
