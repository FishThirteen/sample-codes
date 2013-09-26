CXXFLAGS=-Wall -Werror --std=c++11 -g
CXX=g++

counting-sort : main.cpp counting-sort.o
	$(CXX) $(CXXFLAGS) -o counting-sort main.cpp counting-sort.o

counting-sort.o : counting-sort.cpp counting-sort.h
	$(CXX) $(CXXFLAGS) -c -o counting-sort.o counting-sort.cpp


.PHONY : clean
clean:
	rm -f *.o
	rm counting-sort
