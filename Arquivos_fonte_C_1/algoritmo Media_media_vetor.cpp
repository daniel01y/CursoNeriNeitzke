#include <conio.h>
#include <stdio.h>

main()
{
	float nota[5];
	float calc_media, soma_notas=0;
	int contador=0;
	
	printf("Digite a 1. nota = ");
	scanf("%f",&nota[0]);
	printf("Digite a 2. nota = ");
	scanf("%f",&nota[1]);
	printf("Digite a 3. nota = ");
	scanf("%f",&nota[2]);
	printf("Digite a 4. nota = ");
	scanf("%f",&nota[3]);
	printf("Digite a 5. nota = ");
	scanf("%f",&nota[4]);
	soma_notas = nota[0] + nota[1] + nota[2] + nota[3] + nota[4];
	calc_media = soma_notas / 5;
	if (nota[0] >= calc_media)
	contador = contador + 1;
	if (nota[1] >= calc_media)
	contador = contador + 1;
	if (nota[2] >= calc_media)
	contador = contador + 1;
	if (nota[3] >= calc_media)
	contador = contador + 1;
	if (nota[4] >=	 calc_media)
	contador = contador + 1;
	printf("\nA media e %f",calc_media);
	printf("\n\n%d Alunos ficaram com nota acima da media",contador);
	printf("\n\n\n\n....................FIM......................");
	getch();
}
