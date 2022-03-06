// Prof Aldoir Neitzke

#include <conio.h>
#include <stdio.h>
main()
{
	float nota1,nota2,calc_media;
	printf("digite a primeira nota: ");
	scanf("%f",&nota1); //nota1 = 5;
	printf("digite a segunda nota: ");
	scanf("%f",&nota2); //nota1 = 5;
	calc_media = (nota1+nota2) / 2;
    printf("A media: = %f",calc_media);
    printf("\n..................calculo bem sucedido....................");
    getch();   // esperar uma tecla
}
