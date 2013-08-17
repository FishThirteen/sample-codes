#include <iostream>

#define TOTAL 15

using std::cin;
using std::cout;
using std::endl;

int Joseph_intel(int number);

int main(int argc, char *argv[])
{
    int number = 0;

    cin >> number;

    int result = Joseph_intel(number);

    cout << "The Result: " << result << endl;
}


int Joseph_intel(int N)
{
   int a[TOTAL]  = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
   //int a[TOTAL] = {1};
   int nextStart = 0;

   cout << "The Initial list" << endl;

   for (int i = 0; i < TOTAL; i++)
   {
       cout << a[i];
       
       if (i != TOTAL - 1)
       {
           cout << ", ";
       }
   }

   cout << endl;
   
   for (int i = 1; i < TOTAL; i++)
   {
       int counter = 0;

       while (counter < N)
       {
           if (counter++ && counter == N)
           {
               a[nextStart] = 0;
           }
           
           do
           {
               nextStart = ((nextStart + 1) < TOTAL ? nextStart + 1 : 0);

           } while(!a[nextStart]);
       }
   }

   return nextStart + 1;
}
