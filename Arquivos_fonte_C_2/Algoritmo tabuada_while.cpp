#include <conio.h>
#include <stdio.h>

main()
{
	int numero, i;
	printf("Digite um numero = ");
	scanf("%d",&numero);
	i = 1;
	while(i <= 10)
	{
		printf("\n%d x %d = %d",numero,i,(numero * i));
		i++;
	}
getch();
}

