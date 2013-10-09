CXXFLAGS=-Wall -Werror --std=c++11 -g
CXX=g++

range-ab : main.cpp range-ab.o
	$(CXX) $(CXXFLAGS) -o range-ab main.cpp range-ab.o

range-ab.o : range-ab.cpp range-ab.h
	$(CXX) $(CXXFLAGS) -c -o range-ab.o range-ab.cpp


.PHONY : clean
clean:
	rm -f *.o
	rm range-ab
