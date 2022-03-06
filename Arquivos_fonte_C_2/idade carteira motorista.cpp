#include <stdio.h>

main()
{
	int nota1,nota2,media;
	printf("Digite a nota da primeira prova = ");
	scanf("%d",&nota1);
	printf("Digite a nota da segunda prova = ");
	scanf("%d",&nota2);
	media = (nota1 + nota2) / 2;
	if (media >= 60)
	printf("\nA media do aluno foi = %d\nO aluno foi aprovado.",media);
	else if ((media < 60) && (media >= 40))
	printf("\nA media do aluno foi = %d\nO aluno ficou de recuperacao.",media);
	else
	printf("\nA media do aluno foi = %d\nO aluno foi reprovado.",media);
}
   	/*int ano_atual,ano_nasc,idade;
	printf("------------------------\nDEPARTAMENTO DE TRANSITO\n------------------------\n");
	printf("Digite o ano atual = ");
	scanf("%d",&ano_atual);
	printf("Digite o ano de nascimento = ");
	scanf("%d",&ano_nasc);
	idade = ano_atual - ano_nasc;
	if (idade < 18)
	printf("----- STATUS -----\nIDADE : %d\nINAPTO A TIRAR CARTEIRA\n-----------------",idade);
	else
	printf("----- STATUS -----\nIDADE : %d\nAPTO A TIRAR CARTEIRA\n------------------",idade);
	
}
    */  
