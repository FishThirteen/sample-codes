#include <iostream>
#include <thread>
#include <chrono>

void runInThread()
{
    std::cout << "Hello" << std::endl;
    
}

int main(int argc, char *argv[])
{
    std::thread t(runInThread);

    t.detach();

    std::chrono::seconds one_second(1);
    std::this_thread::sleep_for(one_second);
    //t.join();
    
}
