#include <stdio.h>
#define SIZE 20

int main()
{

	printf("Type something to the black board: \n");
	
	char input[SIZE];
	gets(input); // C dilinde scanf ile string yazmaya izin yok, char yazilabilir.

	printf("Welcome to the C programming language.\n");
	printf("You were writing %s to the black board. :D\n", input);

	return 0;
}
