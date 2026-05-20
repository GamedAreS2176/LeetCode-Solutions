class Code1768 {
    public String mergeAlternately(String word1, String word2) {
        int p1=0,p2=0,i=0;
        String w3="";
        while(p1<word1.length() && p2<word2.length())
        {
            w3+=word1.charAt(p1++);
            w3+=word2.charAt(p2++);
        }
        if(p1<word1.length())
        w3+=word1.substring(p1);
        if(p2<word2.length())
        w3+=word2.substring(p2);
        return w3;
    }
}