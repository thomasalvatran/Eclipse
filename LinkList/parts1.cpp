/*
 * parts1.cpp
 *
 *  Created on: Jul 11, 2012
 *      Author: HP
 */


#include <iostream>
#include "parts1.h"
using namespace std;         //otherwise std::cout


//---------------------------------------------------------------------------
ListOfParts::ListOfParts()
//	: size(0), Head(NULL)
{
	size = 0;
	Head = NULL;  // either way : size(0), Head(BULL)
}
//---------------------------------------------------------------------------
int ListOfParts::Count()
{
	return size;
}
//---------------------------------------------------------------------------

int ListOfParts::Add(CarPart *NewItem)
{
	CarPart *Node = new CarPart;  //add struct CarPart into the class

	Node          = NewItem;
        cout << Head << cout << "\n";
        //Head          = Node;			// of class pointer Head
	Node->Next    = Head;			//of the struct pointer Next
	Head          = Node;			// of class pointer Head
	return size++;
}
//---------------------------------------------------------------------------
CarPart *ListOfParts::Retrieve(int Position)
{
	CarPart *Current = Head;

	for(int i = 0; i < Position && Current != NULL; i++)
	{
		Current = Current->Next;
	}

	return Current;
}
//---------------------------------------------------------------------------
bool ListOfParts::Delete()
{
	if( Head == NULL )
	{
		cout << "The list is empty\n";
		return false;
	}
	else
	{
		CarPart *Current;

		Current = Head->Next;
		Head->Next = Current->Next;
		size--;
		return true;
	}
}
//---------------------------------------------------------------------------



