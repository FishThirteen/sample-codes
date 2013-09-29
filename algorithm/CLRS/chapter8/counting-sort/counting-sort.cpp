#include <memory>
#include "counting-sort.h"

using std::unique_ptr;

void CountingSort::sort(int *input, int* result, int size, int max)
{
    max++;
    unique_ptr<int[]> temp { new int[max] };

    for (int i = 0; i < max; i++)
    {
        temp[i]  = 0;
    }

    for (int i = 0; i < size; i++)
    {
        temp[input[i]] = temp[input[i]] + 1;
    }

    for (int i = 1; i < max + 1; i++)
    {
      temp[i] = temp[i] + temp[i - 1];
    }

    for (int i = size - 1; i >= 0; i--)
    {
        result[(temp[input[i]] - 1)] = input[i];
        temp[input[i]] = temp[input[i]] - 1;
    }

}
