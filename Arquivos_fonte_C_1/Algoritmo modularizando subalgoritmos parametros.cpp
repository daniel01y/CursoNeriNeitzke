#include <conio.h>
#include <stdio.h>
void leitura();
void calculos(float pn1,float pn2);
void imprimir(float soma,float divisao,float multiplicacao,float subtracao);
float num1, num2, multiplicacao, divisao, soma, subtracao;
main()
{
	leitura();
	calculos(num1,num2);
	imprimir(soma,divisao,multiplicacao,subtracao);
    getch();   
}
void leitura()
{
	printf("Digite o numero 1 .: ");
	scanf("%f",&num1);
	printf("Digite o numero 2 .: ");
	scanf("%f",&num2);
}
void calculos(float pn1,float pn2)
{
	soma = pn1 + pn2;
    subtracao = pn1 - pn2;
    divisao = pn1 / pn2;
    multiplicacao = pn1 * pn2;
}
void imprimir(float som,float div,float mult,float sub)
{
	printf("\nA soma = %f",som);
	printf("\nA divisao = %f",div);
	printf("\nA multiplicacao = %f",mult);
	printf("\nA subtracao = %f",sub);
    printf("\n\n\n..................calculo.bem.sucedido....................");
}
