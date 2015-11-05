
#include<iostream>
#include <vector>
#include <math.h>
#include <cstdlib>
#include <stdio.h>
//#include <sys/time.h>
using namespace std;

int Findgcd(int a, int b , int &cost)
{
	int temp;
	while (b!= 0)
	{
		temp = a % b;
		a = b;
		b = temp;
		cost++;
	}
	return a;
}

void printMaxCost(int n)
{
	int maxCost = 0;
	int gcd = 0;
	int Operation = 0;
	int tempa = 0;
	int tempb = 0;
	int tempGCD = 0;


	for (int i = 8; i <= n; i++)
	{
		for (int a = 1; a <= i; a++)
		{
			for (int b = 1; b <= i; b++)
			{
				int cost = 0;
				tempGCD = Findgcd(a, b, cost);
				if (cost > maxCost)
				{
					maxCost = cost;
					tempa = a;
					tempb = b;
					gcd = tempGCD;
				}
				cout << "At i=" << i << " gcd(" << tempa << ", " << tempb << ")=" << gcd << endl;
				cout << " took " << maxCost << "module Operations" << endl;
			}

		}
	}


}

int main()
{
    int testIn = 0;
	// prompt user
	int n = 0;
	while (n <= 8)
	{
		cout << "enter max" << endl;
		cin >> n;
	}

	{
		printMaxCost(n);

	}
	/*struct timevalStart;
	struct timeValEnd;
	gettimeofday(&start, NULL)
	printMaxCost(max);
	gettimeofday(&end, NULL)
	cout << "the program for max = " << max << " ran for " << ;
	(end tv_sec, start tv_sec)<< " + " << (end tv_sec, start tv_sec) << " maxCost";

	*/
	cin >> testIn;
	return -1;
}
