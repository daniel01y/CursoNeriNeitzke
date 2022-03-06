#include <conio.h>
#include <stdio.h>

main()

{
    int b, a;
    printf("Digite o valor de A = ");
    scanf("%d",&a);
    printf("Digite o valor de B = ");
    scanf("%d",&b);
    
    if (a > b)
    printf("Em ordem crescente b=%d - a=%d",b,a);
    else 
    printf("Em ordem crescente a=%d - b=%d",a,b);
    


	printf("\n--------ordem-atribuida----------");
	getch();
	
	
}
