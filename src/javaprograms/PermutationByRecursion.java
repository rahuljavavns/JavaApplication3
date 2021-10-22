package javaprograms;

import java.util.Arrays;

public class PermutationByRecursion {
    
    static void f(int fromx,int tox,int[] a)
    {
    if(fromx>tox)
        return;
    int n=a.length;
        //System.out.println(fromx + "," + tox);
        for(int value=0;value<=n-1;value++)
        {
            //0 to fromx-1 value nahin hona chahiye
            boolean found=false;
            for(int i=0;i<=fromx-1;i++)
            {
                if(a[i]==value)
                {
                    found=true;
                    break;
                }
            }
            if(found)
                continue;
            
            
            
            
            a[fromx]=value;
        if(fromx==tox)
            System.out.println(Arrays.toString(a));
        else
    f(fromx+1,tox,a);
        }
        
    }
    
    
    
    public static void main(String[] args) {
        int n=3;
        int[] a=new int[n];
        f(0,n-1,a);
    }
    
}
