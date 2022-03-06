#include <conio.h>
#include <stdio.h>

main()
{
	float calc_media, soma_notas=0;
	int nota,i;
	for (i=1;i<=10;i++)
	{
	printf("Digite a %d. das 100 notas sendo entre 0 e 100 = ",i);
	scanf("%d",&nota);
	if ((nota >= 0) && (nota <= 100))
	soma_notas = soma_notas + nota;
	else
	{
	    printf("\nNota invalida,digite apenas notas de 0 a 10\n");
	    i--;
     }
	}
	calc_media = soma_notas / 10;
	printf("A media geral do 10 alunos = %f",calc_media);
	getch();
	}
