#include <conio.h>
#include <stdio.h>
main()
{
	float prova1, prova2, prova3, media;
	
	
	printf("Digite a nota da prova 1.: ");
	scanf("%f",&prova1);
	printf("Digite a nota da prova 2.: ");
	scanf("%f",&prova2);
	printf("Digite a nota da prova 3.: ");
	scanf("%f",&prova3);
	
	prova1 = prova1 * 2 / 10;
	prova2 = prova2 * 3 / 10;
	prova3 = prova3 * 5 / 10;
    media = (prova1 + prova2 + prova3);
    
    if   (media >= 60) 
         printf("Aprovado com Media %f ",media);
    else
         printf("Reprovado com media %f ",media);
    
    
	printf("\n\n\n...........................Nota.do.Aluno...........................");
	getch();
	
	
	
}
