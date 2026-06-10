class Code125
{
    public boolean isPalindrome(String s)
    {
        s=s.toLowerCase().replaceAll("[^a-zA-Z0-9]","");
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}