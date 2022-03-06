#include <conio.h>
#include <stdio.h>

main()

{
  float total_prest, qtd_prest_pagas, valor_prest, total_pago, saldo_devedor;

	printf("Digite o valor total das prestacoes = ");
	scanf("%f",&total_prest);
	printf("Digite a quantidade de prestacoes pagas = ");
	scanf("%f",&qtd_prest_pagas);
	printf("Digite o valor de cada prestacao = ");
    scanf("%f",&valor_prest);
    
    total_pago = qtd_prest_pagas * valor_prest;
    saldo_devedor = valor_prest * (total_prest - qtd_prest_pagas);
    
    printf("O valor total das prestacoee = %f",total_prest);
    printf("\nA quantidade de prestacoes pagas = %f",qtd_prest_pagas);
    printf("\nO valor de cada prestacao = %f",valor_prest);
    printf("\nO valor total pago = %f",total_pago);
    printf("\nO saldo devedor = %f",saldo_devedor);
    
    printf("\n\n\n\n-------------Algoritmo-Consorcio---------------");
    getch();
}
