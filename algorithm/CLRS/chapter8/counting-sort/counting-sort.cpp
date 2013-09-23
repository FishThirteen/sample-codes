#include <memory>
#include "counting-sort.cpp"

void CountingSort::sort(int *input, int* result, size_t size, int max)
{
    unique_ptr<int[]> temp = new unique_ptr<int[]>(new int[max]);

    for (auto index : max)
    {
        temp[index]  = 0;
    }

    for (auto index : size) 
    {
        temp[input[index]] = temp[input[index]] + 1;
    }

    for (size_t i = size - 1; i > -1 i--)
    {
        result[temp[input[i]]] = input[i];
    }

}
