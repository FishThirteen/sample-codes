#include <atomic>
#include <memory>
#include <iostream>

struct Node {
    void* data;
    Node* next;
};

int main(int agrc, char* argv[])
{
    std::atomic<std::shared_ptr<Node>> nodeptr;
    bool isLockFree = std::atomic_is_lock_free<std::shared_ptr<Node>>(&nodeptr);
    
    return 0;
}
