#include <memory>
#include "counting-sort.h"

using std::unique_ptr;

void CountingSort::sort(int *input, int* result, size_t size, int max)
{
    unique_ptr<int[]> temp(new int[max]);

    for (size_t i = 0; i < static_cast<size_t>(max); i++)
    {
        temp[i]  = 0;
    }

    for (size_t i = 0; i < size; i++)
    {
        temp[input[i]] = temp[input[i]] + 1;
    }

    for (size_t i = size - 1; i >= 0; i--)
    {
        result[temp[input[i]]] = input[i];
    }

}
