#include "BSTree.h"
#include <cstddef>
#include <iostream>

using std::cout;
using std::endl;

BSTree::BSTree() 
{
  root = NULL;
}

void BSTree::convertToLinkedList() 
{
  cout << "Begin convertToLinkedList" << endl;
  
  if (root != NULL) {
    cout << "root isn't null" << endl;
    cout << (long)root << endl;
    
    root = convertToLinkedList(root);

    while (root->leftChild != NULL)
    {
      root = root->leftChild;
    }
  }
}

Node* BSTree::convertToLinkedList(Node *node) 
{
  if (node != NULL) 
  {
    Node *leftChild = node->leftChild;
    
    if (leftChild != NULL) 
    {
      Node *leftResult = convertToLinkedList(leftChild);

      while (leftResult->rightChild != NULL) 
      {
        leftResult = leftResult->rightChild;
      }

      leftResult->rightChild = node;
      node->leftChild = leftResult;
    }

    Node* rightChild = node->rightChild;

    if (rightChild != NULL) 
    {
      Node* rightResult = convertToLinkedList(rightChild);

      while(rightResult->leftChild != NULL) 
      {
        rightResult = rightResult->leftChild;
      }

      rightResult->leftChild = node;
      node->rightChild = rightResult;
    }

  }
  return node;

}

void BSTree::insertNode(Node* node)
{
  if (root == NULL)
  {
    root = node;
  }
  else
  {
    insertNode(root, node);
  }
}

void BSTree::insertNode(Node* currentNode, Node* newNode)
{
  if (newNode->m_nValue < currentNode->m_nValue)
  {
    if (currentNode->leftChild == NULL)
    {
      currentNode->leftChild = newNode;
    }
    else
    {
      insertNode(currentNode->leftChild, newNode);
    }
    
  }
  else
  {
    if (currentNode->rightChild == NULL) 
    {
      currentNode->rightChild = newNode;
    }
    else
    {
      insertNode(currentNode->rightChild, newNode);
    }

  }

}
