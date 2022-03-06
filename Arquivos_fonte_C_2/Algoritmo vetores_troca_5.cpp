#include <conio.h>
#include <stdio.h>

main()
{
	int a[] = {9,3,7,6,21};
	int b[] = {50,45,36,2,14};
	int c[5];
	int i;
	printf(".........VALORES.A.........");
	for (i=0;i<=4;i++)
	printf("\nO valor original de A[%d] e = %d",i,a[i]);
	printf("\n\n.........VALORES.B.........");
	for (i=0;i<=4;i++)
	printf("\nO valor original de B[%d] e = %d",i,b[i]);
	for (i=0;i<=4;i++)
	{
	c[i] = a[i];
 	a[i] = b[i];
  	b[i] = c[i];
	}
	printf("\n\n\n--------------------------------");
	printf("\n------------------------------------------------------------------------------------------");
	printf("\n.........VALORES.A.........");
	for (i=0;i<=4;i++)
	printf("\nO valor atualizado de A[%d] e = %d",i,a[i]);
	printf("\n\n.........VALORES.B.........");
	for (i=0;i<=4;i++)
	printf("\nO valor atualizado de B[%d] e = %d",i,b[i]);
	printf("\n\n------------------------------------------------------------------------------------------");
	getch();
}
