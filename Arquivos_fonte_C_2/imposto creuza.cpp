#include <stdio.h>

main()
{
	int preco,imposto;
	printf("Digite o preco do produto = ");
	scanf("%d",&preco);
	imposto = (preco * 60) / 100;
	printf("O imposto sera de US$ %d,00",imposto);
}
