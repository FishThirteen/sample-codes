#include <cstdio>
#include <memory>
#include "counting-sort.h"

#define MAX_NUMBER 6
#define INPUT_SIZE 10
int main(int argc, char* argv[])
{
    
    int a[INPUT_SIZE] = {6, 0, 2, 0, 1, 3, 4, 6, 1, 3};
    int result[INPUT_SIZE];


    printf("The input: ");

    for (int i = 0; i < INPUT_SIZE; i++)
    {
        printf("%d", a[i]);

        if (i < (INPUT_SIZE - 1))
        {
            printf(", ");
        }
    }

    printf("\n");

    CountingSort::sort(a, result, INPUT_SIZE, MAX_NUMBER);
    
    printf("The result: ");

    for (int i = 0; i < INPUT_SIZE; i++)
    {
        printf("%d", result[i]);

        if (i < INPUT_SIZE - 1)
        {
            printf(", ");
        }
    }

    printf("\n");

}
