#include <conio.h>
#include <stdio.h>
main()
{
	float custo_fabrica, perc_revendedor, impostos, preco_final;
	//custo_fabrica = 40000;
	printf("Digite o custo de fabrica.: ");
	scanf("%f",&custo_fabrica);
	perc_revendedor = (25 * custo_fabrica) / 100;
	impostos = (45 * custo_fabrica) / 100;
	preco_final = custo_fabrica + perc_revendedor + impostos;
 
    printf("\nO custo de fabrica.........: %f",custo_fabrica);
	printf("\nO percentual do revendedor.: %f",perc_revendedor);
	printf("\nOs impostos................: %f",impostos);
	printf("\nO preco final..............: %f",preco_final);
	printf("\n\n\n...........................Dados.da.fabrica...........................");
	getch();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
