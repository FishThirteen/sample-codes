#ifndef COUNTING_SORT_H
#define COUNTING_SORT_H
#include <cstddef>

class CountingSort
{
public:
    static void sort(int *input, int *result, size_t size, int max);
};

#endif
