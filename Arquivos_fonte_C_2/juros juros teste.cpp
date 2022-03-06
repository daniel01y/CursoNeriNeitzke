#include <stdio.h>

main()
{
	float valor_emprestimo,parcelas,juros,taxa_juros;
	printf("Digite o valor do emprestimo = ");
	scanf("%f",&valor_emprestimo);
	printf("Digite quantas parcelas deseja = ");
	scanf("%f",&parcelas);
	juros = valor_emprestimo * 1.2 / parcelas;
	printf("Tera de pagar %f parcelas de %f",parcelas,juros);
}
