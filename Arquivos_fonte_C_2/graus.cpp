#include <stdio.h>

main()
{
	float f,c;
	printf("Digite a temperatura dos EUA = ");
	scanf("%f",&f);
	c = (f - 32) / 1.8;
	printf("No Brasil estaria %f",c);
}
