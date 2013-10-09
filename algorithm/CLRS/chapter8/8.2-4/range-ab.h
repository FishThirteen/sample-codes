#ifndef RANGE_AB_H
#define RANGE_AB_H
class RangeAB
{
public:    
    RangeAB(const int* input, int size, int max);
    ~RangeAB();
    void reenterData(const int* input, int size, int max);
    int findCount(int begin, int end);

private:
    int *temp;
    int tempSize;

    void calculateCount(const int* input, int size);
    void sumAll();
};
#endif
