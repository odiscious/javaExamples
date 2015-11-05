#include <stdio.h>
int modOps = 0;
int greatestCommonDivisor(int m, int n, int &modOps)
{
    if(n == 0 && m == 0)
    {
        return 0;
    }
    int r;

    /* Check For Proper Input */
    if(m == 0)
    {
        return n;
    }
    if(n == 0)
    {
         return m;
    }

    do
    {
        r = m % n;
        modOps++;
        if(r == 0)
            break;
        m = n;
        n = r;
    }
    while(true);

    return n;
}

int main()
{
    int num1 = 270, num2 = 192;
    int gcd = greatestCommonDivisor(num1, num2, modOps);

    printf("The GCD of %d and %d is %d\n with %d # of mods", num1, num2, gcd, modOps);

    getchar();
    return 0;
}
