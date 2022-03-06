#include <conio.h>
#include <stdio.h>

main()
{
	float vetor5[] = {9,3,-7,8,5};
	float media,soma,iguais_maior,perc_maior,qtd_pos,qtd_neg;
	int i;
	media = 0;
	soma = 0;
	iguais_maior = 0;
	perc_maior = 0;
	qtd_pos = 0;
	qtd_neg = 0;
	for (i=0;i<=4;i++)
	soma = soma + vetor5[i];
	media = soma / 5;
	for (i=0;i<=4;i++)
	{
		if (vetor5[i] >= media)
		iguais_maior = iguais_maior + 1;
		if (vetor5[i] >= 0)
		qtd_pos = qtd_pos + 1;
		else 
		qtd_neg = qtd_neg + 1;
		printf("\nO vetor5[%d] corresponde ao valor = %f",i,vetor5[i]);
	}
	perc_maior = (iguais_maior * 100) / 5;
	printf("\nA soma foi %f",soma);
	printf("\nA media foi %f",media);
	printf("\n%f sao maiores ou iguais a media",iguais_maior);
	printf("\n%f sao positivos",qtd_pos);
	printf("\n%f sao negativos",qtd_neg);
	printf("\n%f%% O percentual de elementos maiores ou igual a media",perc_maior);
	getch();
}
