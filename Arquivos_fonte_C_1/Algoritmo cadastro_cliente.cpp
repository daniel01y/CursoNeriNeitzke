#include <conio.h>
#include <stdio.h>
struct cadastro
{
	char nome[30];
	int idade;
	float salario;
};
main()
{
	struct cadastro dados_cliente;
	printf("Digite o nome do cliente = ");
	scanf("%s",&dados_cliente.nome);
	printf("Digite a idade do cliente = ");
	scanf("%d",&dados_cliente.idade);
	printf("Digite o salario do cliente = ");
	scanf("%f",&dados_cliente.salario);
	printf("\n\nO nome do cliente: %s",dados_cliente.nome);
	printf("\nA idade do cliente: %d",dados_cliente.idade);
	printf("\nO salario do cliente: %f",dados_cliente.salario);
	getch();
}
