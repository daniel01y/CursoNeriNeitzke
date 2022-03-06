#include <conio.h>
#include <stdio.h>

main()
{
	int exerc_matriz[3][3];
	int maior=0,menor=99999;
	for (int l=0;l<=2;l++)
		for (int c=0;c<=2;c++)
			{
				printf("Digite o valor para exerc_matriz [%d,%d] = ",l,c);
				scanf("%d",&exerc_matriz[l][c]);
			}
	printf("\n--------VALORES-ATRIBUIDOS--------\n");	
		for (int l=0;l<=2;l++)
			 	 for (int c=0;c<=2;c++)
			 		 printf("\nO valor de exerc_matriz [%d,%d] e = %d",l,c,exerc_matriz[l][c]);
	for (int l=0;l<=2;l++)
		 for (int c=0;c<=2;c++)
	{ 			 		
	if (exerc_matriz[l][c] > maior)
	maior = exerc_matriz[l][c];
 	if (exerc_matriz[l][c] < menor)
 	menor = exerc_matriz[l][c];
 	}
 	printf("\n--------MAIOR-VALOR--------");
	printf("\nO maior valor da matriz e o valor(%d)",maior);
	printf("\n--------MENOR-VALOR--------");
	printf("\nO menor valor da matriz e o valor(%d)",menor); 		
	getch();
}
