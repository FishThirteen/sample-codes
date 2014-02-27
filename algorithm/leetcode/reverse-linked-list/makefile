all : reverse-linkedlist

reverse-linkedlist : Main.o LinkedList.o
	g++ Main.o LinkedList.o -o reverse-linkedlist

Main.o : Main.cpp
LinkedList.o : LinkedList.cpp LinkedList.h Node.h
