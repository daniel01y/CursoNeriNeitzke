#include <conio.h>
#include <stdio.h>

main()
{
	float r,d;
	int c,q;
	c = 1;
	printf("Quantas vezes voce quer converter? = ");
	scanf("%d",&q);
	while (c <= q)
	{
		  printf("\nQual o valor em R$ ");
		  scanf("%f",&r);
		  d = (r / 2.20);
		  printf("\nO valor convertido e US$%f",d);
		  c = c + 1;
     }
}
