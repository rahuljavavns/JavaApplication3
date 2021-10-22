package javaprograms;

public class Permutation {
    public static void main(String[] args) {
        int n=3;
        String s="ABC";
        char[] chars=s.toCharArray();
        for(int i=0;i<=n-1;i++)
        {
            for(int j=0;j<=n-1;j++)
            {
                if(i==j)
                    continue;
                for(int k=0;k<=n-1;k++)
                {if(i==k || k==j)
                    continue;
                    System.out.println( chars[i] + "," + chars[j] + "," + chars[k]);
                }
            }
        }
    }
    
}
