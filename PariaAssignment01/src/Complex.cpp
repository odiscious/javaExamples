#include "Complex.h"

 ostream& operator<< (ostream& output, const Complex &Complex);
 istream& operator>> ( istream& input, const Complex &Complex);


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

Complex Complex::getReal(){
    return real;
}
Complex Complex::getImaginary(){
    return imaginary;
}
Complex Complex::conjugate(){

}
Complex Complex::operator+(const Complex &) const{

}
Complex Complex::operator-(const Complex &) const{

}
Complex Complex::operator*(const Complex &) const{

}
Complex Complex::operator/(const Complex &) const{

}

bool Complex::operator==(const Complex &) const{

}
bool Complex::operator!=(const Complex &) const{

}
Complex& Complex::operator+=(const Complex &){

}
Complex& Complex::operator-=(const Complex &){

}
Complex& Complex::operator*=(const Complex &){

}
Complex& Complex::operator/=(const Complex &){

}
