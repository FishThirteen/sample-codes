#include <iostream>

using std::cout;
using std::endl;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode *sortList(ListNode *head) {
        if (head == NULL || head->next == NULL) {
            return head;
        } else if (head->next->next == NULL) {
            
            ListNode* nextNode = head->next;

            if (head->val <= nextNode->val) {
                return head;
            } else {
                nextNode->next = head;
                head->next = NULL;
                return nextNode;
            }
        } else {
            ListNode *first = NULL;
            ListNode *last = head;
            
            ListNode *current = last;
            ListNode *temp = last;
            
            while(last->next != NULL) {
                current = last->next;
                
                if (current->val >= head->val) {
                    last = last->next;
                    continue;
                } else {
                    last->next = current->next;
                    current->next = NULL;
                    
                    current->next = first;
                    first = current;
                    
                    if (last->next != NULL) {
                        last = last->next;
                    }
                }
            }

            if (first != NULL) {
                first = sortList(first);
                temp = first;
                while (temp->next != NULL) {
                  temp = temp->next;
                }
                temp->next = head;
            }

            if (head->next != NULL) {
                head->next = sortList(head->next);
            }
            
            if (first != NULL) {
                return first;
            } else {
                return head;
            }
        }
    }
};



int main(int argc, char *argv[]) {
  const int arraySize = 5;
  int data[arraySize] = {2, 1, 3, 5, 7};

  int data[arraySize]

  ListNode *head = NULL;
  ListNode *temp = NULL;

  for (int i = 0; i < arraySize; ++i) {
    ListNode *node = new ListNode(data[i]);

    if (temp != NULL) {
      temp->next = node;
      temp = node;
    } else {
      temp = node;
      head = node;
    }
  }

    
  Solution s;
  head = s.sortList(head);

  temp = head;

  while (temp != NULL) {
    if (temp == head) {
      cout << "[ " << temp->val;
    } else {
      cout << ", " << temp->val;
    }

    temp = temp->next;
  }
  cout << " ]" << endl;
  
  return 0;
}
