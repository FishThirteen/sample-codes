#include <iostream>
#include <string>

using std::cout;
using std::endl;
using std::string;


class Solution {
public:
    void reverseWords(string &s) {
        size_t size = s.length();
        
        string newS;
        
        int lastEmpty = (int)size;
        
        for (int i = size - 1; i >= 0; i--) {
        cout << "i = " << i << "; lastEmpty = " << lastEmpty << endl;
            if (s[i] == ' ') {
                if (i + 1 == lastEmpty) {
                    lastEmpty = i;
                } else {
                    if (newS.length() != 0) {
                            newS.push_back(' ');
                    }
                    for (int j = i + 1; j < lastEmpty; j++) {
                        cout << "j = " << j << endl;
                        newS.push_back(s[j]);
                    }
                    
                    lastEmpty = i;
                }
            }
        }
        
        
        if (newS.length() > 0) {
          s.swap(newS);
        }
                
    }
};

int main(int argc, char *argv[]) {
  string s(" a");
  Solution so;
  so.reverseWords(s);

  cout << s << endl;

  return 0;
}
