#include <conio.h>
#include <stdio.h>

main()
{
	float nota1,nota2,nota3,nota4,nota5,calc_media, soma_notas=0;
	int contador=0;
	
	printf("Digite a 1. nota = ");
	scanf("%f",&nota1);
	printf("Digite a 2. nota = ");
	scanf("%f",&nota2);
	printf("Digite a 3. nota = ");
	scanf("%f",&nota3);
	printf("Digite a 4. nota = ");
	scanf("%f",&nota4);
	printf("Digite a 5. nota = ");
	scanf("%f",&nota5);
	soma_notas = nota1 + nota2 + nota3 + nota4 + nota5;
	calc_media = soma_notas / 5;
	if (nota1 > calc_media)
	contador = contador + 1;
	if (nota2 > calc_media)
	contador = contador + 1;
	if (nota3 > calc_media)
	contador = contador + 1;
	if (nota4 > calc_media)
	contador = contador + 1;
	if (nota5 > calc_media)
	contador = contador + 1;
	printf("\nA media e %f",calc_media);
	printf("\n\n%d Alunos ficaram com nota acima da media",contador);
	printf("\n\n\n\n....................FIM......................");
	getch();
}
