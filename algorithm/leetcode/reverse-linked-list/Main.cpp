#include <iostream>

#include "Node.h"
#include "LinkedList.h"

using std::cout;

int main(int argc, char* argv[]) 
{
  LinkedList list;

  list.add(1);
  list.add(2);
  list.add(3);

  list.reverse();

  list.print();

}

