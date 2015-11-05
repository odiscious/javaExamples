#include "Rational.h"
#include <iostream>
//------------------------------ Rational ------------------------------------
// default constructor:  parameters are numerator and denominator respectively
// if the number is negative, the negative is always stored in the numerator
Rational::Rational(int n, int d) {
   numerator = d < 0 ? -n : n;
   denominator = d < 0 ? -d : d;
   reduce();
}

int Rational::getNumerator()
{
    return numerator;
}

int Rational::getDenominator()
{
    return denominator;
}
//--------------------------------- add --------------------------------------
// overloaded +: addition of 2 Rationals, current object and parameter
Rational Rational::add(const Rational& a) {
   Rational t;

   t.numerator = a.numerator * denominator + a.denominator * numerator;
   t.denominator = a.denominator * denominator;
   t.reduce();

   return t;
}

Rational Rational::operator+( const Rational& a ) const
{
    Rational sum;
    sum.numerator = numerator * a.denominator + denominator * a.numerator; sum.denominator = denominator * a.denominator;
    sum.reduce( );
    return sum;

}


//------------------------------ subtract ------------------------------------
// subtraction of 2 Rationals, current object and parameter

Rational Rational::subtract(const Rational& s) {
   Rational t;

   t.numerator = s.denominator * numerator - denominator * s.numerator;
   t.denominator = s.denominator * denominator;
   t.reduce();

   return t;
}

Rational Rational::operator-(const Rational& s) const {
    Rational t;

    t.numerator = s.denominator * numerator - denominator * s.numerator;
    t.denominator = s.denominator * denominator;
    t.reduce();

    return t;
}
//------------------------------ multiply ------------------------------------
// multiplication of 2 Rationals, current object and parameter
Rational Rational::multiply(const Rational& m) {
   Rational t;

   t.numerator = m.numerator * numerator;
   t.denominator = m.denominator * denominator;
   t.reduce();

   return t;
}
Rational Rational::operator*(const Rational& m) const {
    Rational t;

    t.numerator = m.numerator * numerator;
    t.denominator = m.denominator * denominator;
    t.reduce();

    return t;
}

//-------------------------------- divide ------------------------------------
// division of 2 Rationals, current object and parameter,
// division by zero crashes
Rational Rational::divide(const Rational& v) {
   Rational t;

   t.numerator = v.denominator * numerator;
   t.denominator = denominator * v.numerator;
   t.reduce();

   return t;
}
Rational Rational::operator/(const Rational& v) const {
    Rational t;

    t.numerator = v.denominator * numerator;
    t.denominator = denominator * v.numerator;
    t.reduce();

    return t;
}

//---------------------------- printRational ---------------------------------
void Rational::printRational() {
   if (denominator == 0)
      cout << endl << "DIVIDE BY ZERO ERROR!!!" << endl;
   else if (numerator == 0)
      cout << 0;
   else
      cout << numerator << "/" << denominator;
}

//------------------------ printRationalAsFloat ------------------------------
void Rational::printRationalAsFloat() {
   if (denominator == 0)
      cout << endl << "DIVIDE BY ZERO ERROR!!!" << endl;
   else
      cout << float(numerator) / float(denominator);
}
//--------------------------------- > -----------------------------------

bool Rational::operator>( const Rational& r ) const {
    return float(numerator/denominator) > float(r.numerator/r.denominator);
}

// -------------------------------- < -------------------------------------

bool Rational::operator<( const Rational& r ) const {
    return float(numerator/denominator) < float(r.numerator/r.denominator);

}

//------------------------------- >= ----------------------------------------

bool Rational::operator>=( const Rational& r ) const {
        return *this == r || *this > r;
}

//-------------------------------- <= ---------------------------------------

bool Rational::operator<=( const Rational& r ) const {

        return *this == r || *this > r;

}
//----------------------------------==---------------------------------------

bool Rational::operator==( const Rational& r ) const {
        return numerator == r.numerator && denominator == r.denominator;
}

//--------------------------------!=-----------------------------------------


    bool Rational::operator!=( const Rational& r ) const {
        return numerator != r.numerator && denominator != r.denominator;
    }

//----------------------------------+=------------------------------------
    Rational& Rational::operator+=( const Rational& r ) {

        numerator = numerator * r.denominator + denominator * r.numerator; denominator = denominator * r.denominator;
        reduce( );
        return *this;
    }


//-------------------------------- -= -------------------------------------
/*
    Rational& Rational::operator-=( const Rational& r ) {

        numerator = numerator * r.denominator + denominator * r.numerator; denominator = denominator * r.denominator;
        reduce( );
        return *this;
    }

//------------------------------- *= ---------------------------------------------
    Rational& Rational::operator*=( const Rational& r ) {

        numerator = numerator * r.denominator + denominator * r.numerator; denominator = denominator * r.denominator;
        reduce( );
        return *this;
    }

//-------------------------------- /= ------------------------------------------------

    Rational& Rational::operator/=( const Rational& r ) {

        numerator = numerator * r.denominator + denominator * r.numerator; denominator = denominator * r.denominator;
        reduce( );
        return *this;
    }


*/
//--------------------------------<<------------------------------------------

    ostream& operator<<( ostream& output, const Rational& r ) {
        if (r.denominator == 0) {
            output << "DIVIDE BY ZERO ERROR!!!" << endl;
        }
        else if (r.numerator == 0) output << 0;
        else if (r.denominator == 1) output << r.numerator;
        else
            output << r.numerator << "/" << r.denominator;
        return output;
    }


//------------------------------->>------------------------------------------

    /*ostream& operator>>( ostream& output, const Rational& r ) {
        if (r.denominator == 0)
            output << "DIVIDE BY ZERO ERROR!!!\n";
        else if (r.numerator == 0) output >> 0;
        else if (r.denominator == 1) output >> r.numerator;
        else
            output << r.numerator << "/" >> r.denominator;
        return output;
    }*/


//-------------------------------- reduce ------------------------------------
// reduce fraction to lowest terms
void Rational::reduce() {
   int n = numerator < 0 ? -numerator : numerator;
   int d = denominator;
   int largest = n > d ? n : d;

   int gcd = 0;                                 // greatest common divisor

   for (int loop = largest; loop >= 2; loop--)
      if (numerator % loop == 0 && denominator % loop == 0) {
         gcd = loop;
         break;
      }

   if (gcd != 0) {
      numerator /= gcd;
      denominator /= gcd;
   }
}
