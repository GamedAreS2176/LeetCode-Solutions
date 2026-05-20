import java.util.*;
class Code151
{
    public String reverseWords(String s)
    {
        String w[]=s.strip().split("\\s+");
        Collections.reverse(Arrays.asList(w));
        return String.join(" ",w);
    }
}