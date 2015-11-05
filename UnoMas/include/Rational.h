#ifndef RATIONAL_H
#define RATIONAL_H


#include <iostream>
using namespace std;

class Rational {
	   friend ostream& operator<< (ostream& output, const Rational & r);
	   friend istream& operator>> ( istream& input, Rational & r );
	public:
	   Rational(int = 0, int = 1);             // default constructor
	   Rational add(const Rational &);
	   Rational subtract(const Rational &);
	   Rational multiply(const Rational &);
	   Rational divide(const Rational &);
	   void printRational();
	   void printRationalAsFloat();
	    int getNumerator();
	    int getDenominator();
	    Rational operator+(const Rational &) const;
	    Rational operator-(const Rational &) const;
	    Rational operator*(const Rational &) const;
	    Rational operator/(const Rational &) const;

	    bool operator>(const Rational &) const;
	    bool operator<(const Rational &) const;
	    bool operator>=(const Rational &) const;
	    bool operator<=(const Rational &) const;
	    bool operator==(const Rational &) const;
	    bool operator!=(const Rational &) const;
	    Rational& operator+=(const Rational &);
	    Rational& operator-=(const Rational &);
	    Rational& operator*=(const Rational &);
	    Rational& operator/=(const Rational &);


	private:
	   int numerator;
int denominator;

	   void reduce();                 // utility function, reduce to lowest terms
	};

#endif // RATIONAL_H
