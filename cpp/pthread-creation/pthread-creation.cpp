#include <pthread.h>
#include <unistd.h>
#include <cstdio>
#include <stdlib.h>

pthread_t ntid;

void printid(const char * mesg)
{
    pid_t pid;
    pthread_t tid;

    pid = getpid();
    tid = pthread_self();

    printf("%s pid: %u tid: %u(0x%X) \n", mesg, (unsigned int)pid, 
        (unsigned int) tid, (unsigned int)tid);



}

void* thr_fun(void *arg)
{
    printid(" New Thread: ");
    return (void*)0;
}


int main(int argc, char *argv[])
{
    int err;

    err = pthread_create(&ntid, NULL, thr_fun, NULL);

    printid("Main Thread: ");
    
    sleep(1);

    exit(0);
    
}
