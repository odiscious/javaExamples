#include "Complex.h"


/*
 * Complex.cpp
 *
 *  Created on: Oct 11, 2015
 *      Author: Paria
 *Program assumes the use of correct numerical
 *inputs (double)
 */

#include<math.h>
#include <iostream>

//it allows usage as cout<<a<<b<<c
ostream& operator<< (ostream& output, const Complex &n){
    if (n.real == 0 || n.imaginary == 0)
	{
		return output;
	}
	else if (n.real == 0 && n.imaginary == 0)
	{
		output << 0;
	}
	else if (n.imaginary == 1)
	{
		output << n.real << " + " << "i" << endl;
	}
	else if (n.imaginary < -1)
	{
		output << n.real << " - " << -n.imaginary << "i" << endl;
	}
	else if (n.imaginary == -1)
	{
		output << n.real << " - " << "i" << endl;
	}
	else
	{
		output << n.real << " + " << n.imaginary << "i" << endl;
		return output;
	}
    return output;
}

//it allows usage as cin>>a>>b>>c
 istream& operator>> ( istream& input, Complex &c){
         /*char plus;
           char i;
           input >> c.real >> plus >> c.imaginary >> i;
           return input;*/
           cout<<"enter real part:\n";
        cin>>c.real;
        cout<<"enter imag part: \n";
        cin>>c.imaginary;
        return input;
}

Complex::Complex()
{
 real = 0.0;
 imaginary = 0.0;
}
Complex::Complex(double x){
    real = x;
    imaginary = 0;
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
            p.imaginary = imaginary + a.imaginary;

            return p;

}
Complex Complex::operator-(const Complex &b) const{
                Complex p;
                        p.real = real - b.real;
                        p.imaginary = imaginary - b.imaginary;
                        if(p.imaginary < 0){
                            -p.imaginary;
                        }
                        return p;

}
Complex Complex::operator*(const Complex &c) const{
    double y = (real*c.imaginary)-(imaginary*c.real);
    if(y < 0)
    {

        -y;
    }
    return Complex((real *c.real)-(real* c.imaginary), y);


        /*
         Complex m;
     m.real=(real*c.real)-(imaginary*c.imaginary);
     m.imaginary=(real*c.imaginary)+(imaginary*c.real);
     return m;
         */

}
Complex Complex::operator/(const Complex &c) const{

Complex numerator = this * c.conjugate();
Complex denomenator = c * c.conjugate();
        double div=(c.real*c.real) + (c.imaginary*c.imaginary);
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

