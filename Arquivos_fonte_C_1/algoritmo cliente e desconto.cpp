#include <stdio.h>
#include <conio.h>

main()
{
    float valor_compra, valor_desconto, valor_pagar;
    char nome[30];
    int desconto;
	
	printf("Digite o nome do cliente ");
	scanf("%s",&nome);
	printf("Digite o valor da compra ");
	scanf("%f",&valor_compra);
	
	if (valor_compra <= 200) 
	desconto = 10;
	else if (valor_compra <= 500)
	desconto = 15;
	else
	desconto = 20;
	
	valor_desconto = (valor_compra * desconto) / 100;
	valor_pagar = valor_compra - valor_desconto;
	
	printf("Nome do Cliente = %s",nome);
	printf("\nValor da compra = %f",valor_compra);
	printf("\nO percentual de desconto = %d",desconto);
	printf("\nValor do desconto = %f ",valor_desconto);
	printf("\nValor a pagar = %f",valor_pagar);
	
	printf("\n\n\n...........................Nota.do.Aluno...........................");
	getch();
	
}
