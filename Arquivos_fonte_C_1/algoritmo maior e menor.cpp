#include <stdio.h>
#include <conio.h>

main()
{

int n1, n2, n3;
printf("Digite o valor de n1 = ");
scanf("%d",&n1);
printf("Digite o valor de n2 = ");
scanf("%d",&n2);
printf("Digite o valor de n3 = ");
scanf("%d",&n3);
if ((n1 >= n2) & (n1 >= n3))
   {
	printf("\nO maior e = %d",n1);
if (n2 <= n3)
    printf("\nO menor e = %d",n2);
else
    printf("\nO menor e = %d",n3);    
	
}
else if ((n2 >= n1) & (n2 >= n3))
{
	printf("\nO maior e = %d",n2);
	if 	(n1 <= n3)
	printf("\nO menor e = %d",n1);
	else 
	printf("\nO menor e = %d",n3);
	}
	else
	{
    printf("\nO maior e = %d",n3);
	if (n2 <= n1)
	printf("\nO menor e = %d",n2);
	else
	printf("\nO menor e = %d",n1);
	}



getch();
}
