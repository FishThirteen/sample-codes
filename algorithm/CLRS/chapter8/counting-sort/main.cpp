#include <cstdio>
#include <memory>
#include "counting-sort.h"

int main(int argc, char* argv[])
{
    int a[5] = {4, 2, 7, 11, 10};
    int result[5];


    printf("The input: ");

    for (int i = 0; i < 5; i++)
    {
        printf("%d", a[i]);

        if (i < 4)
        {
            printf(", ");
        }
    }

    printf("\n");

    CountingSort::sort(a, result, 5, 11);
    
    printf("The result: ");

    for (int i = 0; i < 5; i++)
    {
        printf("%d", result[i]);

        if (i < 4)
        {
            printf(", ");
        }
    }

    printf("\n");

}
