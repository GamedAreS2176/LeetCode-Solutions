class Code1071
{
    int gcd(int x,int y)
    {
        if(y==0)
        return x;
        else
        return gcd(y,x%y);
    }
    String gcdOfStrings(String str1,String str2)
    {
        if(!(str1+str2).equals(str2+str1))
        return "";
        return str1.substring(0,gcd(str1.length(),str2.length()));
    }
}