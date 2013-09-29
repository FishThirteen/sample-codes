#include <cstdio>
#include <memory>
#include "range-ab.h"

#define MAX_NUMBER 6
#define INPUT_SIZE 10

using std::unique_ptr;

void printIntArray(const int* array, const int size)
{
    for (int i = 0; i < INPUT_SIZE; i++)
    {
        printf("%d", array[i]);

        if (i < INPUT_SIZE - 1)
        {
            printf(", ");
        }
    }

    printf("\n");

}

int main(int argc, char* argv[])
{
    
    int a[INPUT_SIZE] = {6, 0, 2, 0, 1, 3, 4, 6, 1, 3};

    printf("The input: ");
    printIntArray(a, INPUT_SIZE);


    unique_ptr<RangeAB> rangeAB(new RangeAB(a, INPUT_SIZE, MAX_NUMBER));

    printf("Count 0 - 3: ");
    printf("%d", rangeAB->findCount(0, 3));
    printf("\n");

    printf("Count 4 - 6: ");
    printf("%d", rangeAB->findCount(4, 6));
    printf("\n");

    printf("Count 0 - 6: ");
    printf("%d", rangeAB->findCount(0, 6));
    printf("\n");
}
