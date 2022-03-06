#include <conio.h>
#include <stdio.h>

main()
{
	int i;
	for(i=10;i<=1000;i=i+10)
	{
		if ((i == 100) || (i== 200) || (i == 300))
		printf("\n");
	
	printf("\n%d",i);
     }
	getch();
}
