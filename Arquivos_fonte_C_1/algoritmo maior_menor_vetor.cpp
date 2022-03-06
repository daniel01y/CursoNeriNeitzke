#include <conio.h>
#include <stdio.h>

main()
{
	int maior_menor[] = {22,3,7,8,15,9,11,7,6,4};
	int i,maior,menor;
	maior = 0;
	menor = 9999999;

	for (i=0;i<=9;i++)
	{
		if (maior_menor[i] > maior)
		maior = maior_menor[i];
 		if (maior_menor[i] < menor)
 		menor = maior_menor[i];
	}
	printf("O maior valor = %d",maior);
	printf("\n\nO menor valor = %d",menor);
	getch();
}
