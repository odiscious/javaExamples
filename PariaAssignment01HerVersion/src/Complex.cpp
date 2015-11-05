
/*
 * Complex.cpp
 *
 *  Created on: Oct 11, 2015
 *      Author: Paria
 */

#include "Complex.h"
#include<math.h>

//it allows usage as cout<<a<<b<<c
ostream& operator<< (ostream& output, const Complex &Complex){
        output << '(' << Complex.real << "," << Complex.imaginary << ')';
                return output;
}

//it allows usage as cin>>a>>b>>c
 istream& operator>> ( istream& input, const Complex &c){
         char plus;
           char i;
           input >> c.real >> plus >> c.imaginary >> i;
           return input;
}

Complex::Complex()
{
 real = 5;
 imaginary = 10;
}
Complex::Complex(double x){
    real = x;
}
Complex::Complex(double x , double y){
 real = x;
 imaginary = y;
}
Complex::~Complex(){
}

double Complex::getReal(){
    return real;
}
double Complex::getImaginary(){
    return imaginary;
}
Complex Complex::conjugate(){
        return Complex(real, -imaginary);
}
Complex Complex::operator+(const Complex &a) const{
            Complex p;
                p.real = real + a.real;
                p.imaginary =imaginary + a.imaginary;
                return p;

}
Complex Complex::operator-(const Complex &b) const{
                Complex p;
                        p.real = real - b.real;
                        p.imaginary =imaginary - b.imaginary;
                        return p;

}
Complex Complex::operator*(const Complex &c) const{
        return Complex((real *c.real)-(real* c.imaginary), (real*c.imaginary)-(imaginary*c.real));


        /*
         Complex m;
     m.real=(real*c.real)-(imaginary*c.imaginary);
     m.imaginary=(real*c.imaginary)+(imaginary*c.real);
     return m;
         */

}
Complex Complex::operator/(const Complex &c) const{

        int div=(c.real*c.real) + (c.imaginary*c.imaginary);
    Complex tmp;
    tmp.real=(real*c.real)+(imaginary*c.imaginary);
    tmp.real/=div;
    tmp.imaginary=(imaginary*c.real)-(real*c.imaginary);
    tmp.imaginary/=div;
    return tmp;


}

bool Complex::operator==(const Complex &right) const{
         if ((real == right.real) && (imaginary == right.imaginary))
                    return true;
                else
                    return false;

}
bool Complex::operator!=(const Complex &right) const{
        if ((real != right.real) && (imaginary != right.imaginary))
            return true;
        else
            return false;

}
Complex& Complex::operator+=(const Complex &c){
        real = real + c.real;
        imaginary = imaginary + c.imaginary;

         return *this;

}
Complex& Complex::operator-=(const Complex &c){
        real = real - c.real;
        imaginary = imaginary - c.imaginary;
    return *this;

}
Complex& Complex::operator*=(const Complex &c){

         real=(real*c.real)-(imaginary*c.imaginary);
         imaginary=(real*c.imaginary)+(imaginary*c.real);
         return *this;

}
Complex& Complex::operator/=(const Complex &c){
         int div=(c.real*c.real) + (c.imaginary*c.imaginary);
         real=(real*c.real)+(imaginary*c.imaginary);
         real/=div;
         imaginary=(imaginary*c.real)-(real*c.imaginary);
         imaginary/=div;
         return *this;

}
