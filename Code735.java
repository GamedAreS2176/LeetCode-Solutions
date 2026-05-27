import java.util.*;
class Code735
{
    public int[] asteroidCollision(int[] asteroids)
    {
        ArrayDeque<Integer> st=new ArrayDeque<>();
        for(int i:asteroids)
        {
            if(i>0)
            st.push(i);
            else
            {
                boolean s=true;
                while(!st.isEmpty() && st.peek()>0)
                {
                    if(st.peek()<Math.abs(i))
                    st.pop();
                    else if(st.peek()==Math.abs(i))
                    {
                        st.pop();
                        s=false;
                        break;
                    }
                    else
                    {
                        s=false;
                        break;
                    }
                }
                if(s)
                st.push(i);
            }
        }
        int ans[]=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--)
        {
            ans[i]=st.pop();
        }
        return ans;
    }
}