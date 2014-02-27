#include "Node.h"
#include "LinkedList.h"

#include <iostream>

using std::cout;
using std::endl;


LinkedList::LinkedList() : head(NULL)
{
}

LinkedList::~LinkedList()
{
  if (this->head != NULL) 
  {
    deleteNodesRecursively(this->head);
  }
}

void LinkedList::deleteNodesRecursively(Node *node) 
{
  if (node->next != NULL)
  {
    deleteNodesRecursively(node->next);
  }

  delete node;

}

void LinkedList::add(int value)
{
  Node *newNode = new Node();
  newNode->value = value;

  if (this->head == NULL)
  {
    this->head = newNode;
  }
  else
  {
    Node* last = this->findLastNode();
    last->next = newNode;
  }
}

void LinkedList::reverse()
{
  if (this->head != NULL)
  {
    Node* newHead = NULL;
    Node* current = NULL;
    Node* tempHead = this->head;
    

    while (tempHead != NULL)
    {
      current = tempHead;
      tempHead = tempHead->next;

      current->next = newHead;
      newHead = current;
    }

    this->head = newHead;
  }
}


void LinkedList::print()
{
  if (this->head == NULL)
  {
    cout << "Empty List" << endl;
  }
  else
  {
    Node* temp = head;
    
    while (temp != NULL) 
    {
      cout << temp->value << " ";
      temp = temp->next;
    }

    cout << endl;
  }
  
}

Node* LinkedList::findLastNode()
{
  Node* temp = this->head;

  while (temp->next != NULL) 
  {
    temp = temp->next;
  }

  return temp;
}
