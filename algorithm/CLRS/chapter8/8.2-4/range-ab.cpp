#include "range-ab.h"

RangeAB::RangeAB(const int* input, int size, int max)
{
    tempSize = max + 1;
    temp = new int[tempSize];

    for (int i = 0; i < tempSize; i++)
    {
        temp[i] = 0;
    }

    calculateCount(input, size);
}


RangeAB::~RangeAB()
{
    if (temp != nullptr)
    {
        delete[] temp;
    }
}

void RangeAB::reenterData(const int* input, int size, int max)
{
}

int RangeAB::findCount(int begin, int end)
{
    if (begin == 0)
    {
        return temp[end];
    }
    else
    {
        return temp[end] - temp[begin - 1];
    }

}

void RangeAB::calculateCount(const int* input, int size)
{
    for (int i = 0; i < size; i++)
    {
        int inputValue = input[i];
        temp[inputValue] = temp[inputValue] + 1;
    }

    sumAll();
}

void RangeAB::sumAll()
{
    for (int i = 1; i < tempSize; i++)
    {
        temp[i] = temp[i - 1] + temp[i];
    }
}
