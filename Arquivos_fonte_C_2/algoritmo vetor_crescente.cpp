#include <conio.h>
#include <stdio.h>

main()
{
	float a[] = {50,21,14};
	int aux,i;
	printf("\nO valor de a[1] = %f",a[0]);
	printf("\nO valor de a[2] = %f",a[1]);
	printf("\nO valor de a[3] = %f",a[2]);
	for (int j=0;j<=1;j++)
	for (i=0;i<=1;i++)
		if (a[i]>a[i+1])
		{
			aux = a[i];
			a[i] = a[i+1];
			a[i+1] = aux;
		}
	printf("\n\n\n--------------------------------");
	printf("\n------------------------------------------------------------------------------------------");
	printf("\nReagrupados em ordem crescente = \na[1] = %f\na[2] = %f\na[3] = %f",a[0],a[1],a[2]);
	printf("\n\n------------------------------------------------------------------------------------------");
	getch();
}
