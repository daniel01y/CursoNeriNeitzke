#include <conio.h>
#include <stdio.h>

main()
{
	int a[] = {50,21,14,100,5,3,87,23,8,26,48,18,78,5,20};
	int aux,i;
	for (i=0;i<=14;i++)
	printf("\nO valor de a[%d] = %d",i,a[i]);
	for (int j=0;j<=14;j++)
	for (i=0;i<=14;i++)
		if (a[i]<a[i+1])
		{
			aux = a[i];
			a[i] = a[i+1];
			a[i+1] = aux;
		}
	printf("\n\n\n--------------------------------");
	printf("\n------------------------------------------------------------------------------------------");
	for (i=0;i<=14;i++)
	printf("\nVALORES REAGRUPADOS EM ORDEM DECRESCENTE = %d",a[i]);
	printf("\n\n------------------------------------------------------------------------------------------");
	getch();
}
