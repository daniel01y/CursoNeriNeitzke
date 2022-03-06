#include <conio.h>
#include <stdio.h>

main()
{
	float le, ld, li;
	printf("Digite o comprimento do lado esquerdo = ");
	scanf("%f",&le);
	printf("Digite o comprimento do lado direito = ");
	scanf("%f",&ld);
	printf("Digite o comprimento do lado inferior = ");
	scanf("%f",&li);
	if ((li < (le + ld)) && (le < (ld + li)) && (ld < (li + le))) 
	    if ((le == ld) && (le == li))
	printf("E um triangulo equilatero");
	else if ((li == ld) || (li == le) || (le == ld))
	printf("E um triangulo isosceles");
	else 
	printf("E um triangulo escaleno");
	
	else
	printf("Nao e um triangulo");
printf("\n\n\n.............fim.............");   
	
	
	
	
	
	
	
}
