#include <string>
#include <cstdio>

using std::string;

string returnString(void)
{
    char buffer[20] = {0};
    snprintf(buffer, 19, "Hello, World!");
    return buffer;
}

int main(int argc, char *argv[])
{
    puts(returnString().c_str());

    return 0;
}
