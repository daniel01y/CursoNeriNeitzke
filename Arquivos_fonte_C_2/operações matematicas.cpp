						// Prof Aldoir Neitzke

#include <conio.h>
#include <stdio.h>
main()
{
	float num1, num2, multiplicacao, divisao, soma, subtracao;
	//num1 = 10;
	//num2 = 5;
	
	printf("Digite o numero 1 .: ");
	scanf("%f",&num1);
	printf("Digite o numero 2 .: ");
	scanf("%f",&num2);

    soma = num1 + num2;
    subtracao = num1 - num2;
    divisao = num1 / num2;
    multiplicacao = num1 * num2;

	printf("\nA soma = %f",soma);
	printf("\nA divisao = %f",divisao);
	printf("\nA multiplicacao = %f",multiplicacao);
	printf("\nA subtracao = %f",subtracao);
    printf("\n\n\n..................calculo.bem.sucedido....................");
    getch();   // esperar uma tecla
}
