#include <conio.h>
#include <stdio.h>

main()
{
	float nota[5];
 	float calc_media,soma_notas;
	int i,contador;
	contador = 0;
	soma_notas = 0; 
	for (i=0;i<=4;i++)
	{
	printf("Digite a %d. nota = ",i+1);
	scanf("%f",&nota[i]);
	soma_notas = soma_notas + nota[i];
  	}
  	calc_media = soma_notas / 5;
	for (i=0;i<=4;i++)
	{
		if (nota[i] >= calc_media)
		contador++;
	}
	printf("A media e %f",calc_media);
	printf("\n%d Aluno(s) ficaram com a nota acima da media",contador);
	getch();
}
