#ifndef COMPLEX_H
#define COMPLEX_H

#include <iostream>
using namespace std;

class Complex
{
    friend ostream& operator<< (ostream& output, const Complex &);
    friend istream& operator>> ( istream& input, const Complex &);

    public:
        Complex();
        Complex(double);
        Complex(double, double);
        ~Complex();

        Complex getReal();
        Complex getImaginary();
        Complex conjugate();
        Complex operator+(const Complex &) const;
	    Complex operator-(const Complex &) const;
	    Complex operator*(const Complex &) const;
	    Complex operator/(const Complex &) const;

        bool operator==(const Complex &) const;
	    bool operator!=(const Complex &) const;
	    Complex& operator+=(const Complex &);
	    Complex& operator-=(const Complex &);
	    Complex& operator*=(const Complex &);
	    Complex& operator/=(const Complex &);

    private:
        double real;
        double imaginary;
};

#endif // COMPLEX_H
