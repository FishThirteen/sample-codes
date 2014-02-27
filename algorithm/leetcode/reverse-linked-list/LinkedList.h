#ifndef _LINKEDLIST_H_
#define _LINKEDLIST_H_

class Node;

class LinkedList 
{
public:
  LinkedList();
  ~LinkedList();
  void add(int value);
  void print();
  void reverse();
  

private:
  Node *head;
  Node* findLastNode();
  void deleteNodesRecursively(Node *node);
};

#endif
