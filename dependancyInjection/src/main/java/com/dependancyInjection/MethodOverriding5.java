package com.dependancyInjection;



class Steel
{
    void setGrade(int g)
    {
        System.out.print(",GRADE="+g);
    }
}
class CarbonSteel extends Steel
{
    void setGrade(int grade)
    {
        System.out.print(",Grade="+grade);
    }
}
public class MethodOverriding5
{
    public static void main(String[] args)
    {
        Steel s = new CarbonSteel();
        s.setGrade(5);
        s.setGrade('A');
    }
}