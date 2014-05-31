#ifndef _BSTree_H_
#define _BSTree_H_
#include "node.h"

class BSTree
{
public:
  Node *root;
  void convertToLinkedList();
  void printLinkedList();
  void insertNode(Node* node);
  void insertNode(Node* currentNode, Node* newNode);
  BSTree();

private:
  static const int LEFT = 0;
  static const int RIGHT = 1;
  Node* convertToLinkedList(Node *node);
};

#endif 
