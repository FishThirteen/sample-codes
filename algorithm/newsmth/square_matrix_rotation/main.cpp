#include <iostream> 

using std::cout;
using std::endl;

void squareMatrixRotation(int *matrix[], int order); 
void printMatrix(int *matrix[], int order);
void innerSquareMatrixRotation(int *matrix[], int order);
int getMiddle(int number);
int transformX(int y);
void transformMatrixUnit(int *matrix[], int order, int x, int y);
int transformY(int x, int order);
bool isOdd(int number);
void freeSquareMatrixArray(int *matrix[], int order);

void innerSquareMatrixRotation(int *matrix[], int order) 
{
  int middle = getMiddle(order);
  int sizeX = middle;

  if (isOdd(order)) {
    sizeX = middle - 1;
  }

  for (int i = 0; i < sizeX; i++)
  {
    for (int j = 0; j < middle; j++)
    {
      transformMatrixUnit(matrix, order, i, j);
    }
  }
}

void transformMatrixUnit(int *matrix[], int order, int x, int y)
{
  int oldValue = matrix[x][y];
  int temp = 0;

  int oldX = x;
  int oldY = y;
  int newX = 0;
  int newY = 0;

  for (int i = 0; i < 4; i++)
  {
    newX = transformX(oldY);
    newY = transformY(oldX, order);

    temp = matrix[newX][newY];
    matrix[newX][newY] = oldValue;
    oldValue = temp;

    oldX = newX;
    oldY = newY;
  }
}

int transformX(int y) 
{
  return y;
}

int transformY(int x, int order) 
{
  return order - 1 - x;
}

int main(int argc, char *argv[]) 
{
  int **c;
  const int TWO = 2;

  c = new int*[TWO];
  
  c[0] = new int[TWO] {1, 2};
  c[1] = new int[TWO] {3, 4};
  squareMatrixRotation(c, TWO);
  freeSquareMatrixArray(c, TWO);

  cout << endl;
  


  int **a;
  const int THREE = 3;

  a = new int*[THREE];
  
  a[0] = new int[THREE] {0, 1, 2};
  a[1] = new int[THREE] {3, 4, 5};
  a[2] = new int[THREE] {6, 7, 8};

  squareMatrixRotation(a, THREE);
  
  freeSquareMatrixArray(a, THREE);
  cout << endl;


  int **b;
  const int FOUR = 4;
  b = new int*[FOUR];

  b[0] = new int[FOUR] {0, 1, 2, 3};
  b[1] = new int[FOUR] {4, 5, 6, 7};
  b[2] = new int[FOUR] {8, 9, 10, 11};
  b[3] = new int[FOUR] {12, 13, 14, 15};

  squareMatrixRotation(b, FOUR);
  freeSquareMatrixArray(b, FOUR);
}


void freeSquareMatrixArray(int *matrix[], int order) 
{ 
  for (int i = 0; i < order; i++) 
  {
    delete[] matrix[i];
  }
  delete[] matrix;

}


void squareMatrixRotation(int *matrix[], int order) 
{
  if (order < 0) 
  {
    cout << "Order of matrix cann't < 0" << endl;
  }

  cout << "The original matrix:" << endl;
  printMatrix(matrix, order);

  cout << endl;

  
  if (order > 1) 
  {
    innerSquareMatrixRotation(matrix, order);
  }

  cout << "The output matrix:" << endl;
  printMatrix(matrix, order);
}



bool isOdd(int number) 
{
  return (number % 2) != 0;
}


int getMiddle(int number) 
{
  if (isOdd(number)) 
  {
    return (number / 2) + 1;
  }
  else 
  {
    return number / 2; 
  }
}



void printMatrix(int *matrix[], int order) 
{
  for (int i = 0; i < order; i++) 
  {
    for (int j = 0; j < order; j++) 
    {
      cout << matrix[i][j] << " ";
    }
    cout << endl;
  }

}
