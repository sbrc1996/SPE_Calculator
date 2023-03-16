package org.example;

public class Calculator {
    public Calculator() {
    }
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public double sqrRoot(int a)
    {
        return Math.sqrt(a);
    }
    public int fact(int a)
    {
        int res = 1;
        for(int i=1;i<=a;i++)
            res *= i;
        return res;
    }

    public double natLog(int a)
    {
        return Math.log(a)/Math.log(2.7182818);
    }
    public int pow(int a,int p)
    {
        int res = 1;
        for(int i=1;i<=p;i++)
            res *= a;
        return res;
    }

}
