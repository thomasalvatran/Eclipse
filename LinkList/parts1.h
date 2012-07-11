/*
 * part1.h
 *
 *  Created on: Jul 11, 2012
 *      Author: HP
 */

#ifndef PART1_H_
#define PART1_H_

#pragma once

//---------------------------------------------------------------------------
struct CarPart
{
	long     PartNumber;
	char     PartName[40];
	double   UnitPrice;
	CarPart* Next;
};

//---------------------------------------------------------------------------
class ListOfParts
{
//////private:
	int size;

// List Builder
public:
	ListOfParts();
	int Count();
	CarPart* Head;

// List Operations
//////////public:
	int Add(CarPart* Item);
	CarPart *Retrieve(int pos);
	bool Delete();
};
//---------------------------------------------------------------------------

#endif /* PART1_H_ */
