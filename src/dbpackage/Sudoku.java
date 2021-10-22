package dbpackage;
import java.io.IOException;

public class Sudoku {
    static  int arr[][]=new int[9][9];
    public static void main(String[]arg) throws IOException{
         
        
        placeValues(0, 0);
        
        printArray();
        
    }
    static void placeValues(int y,int x) throws IOException
    {
        for(int value=1;value<=9;value++)
        {
            arr[y][x]=value;
            boolean b=isBoardValid();
            if(!b)
                continue;
            if(y==8 && x==8)
            {
                System.out.println("\nSOlved\n");
                printArray();
                System.in.read();
  
            }
            else
            {
                if(x<8)
                    placeValues(y, x+1);
                else
                    placeValues(y+1, 0);
            }
        }
        arr[y][x]=0;
    }
    static void printArray()
    {
        int n=9;
        for(int i=0;i<=n-1;i++)
                {
                    for(int j=0;j<=n-1;j++)
                        System.out.print("\t" + arr[i][j]);
                    System.out.println();
                }
       // System.out.println(Arrays.toString(arr));
    }
   static boolean isBoardValid()
   {
       for(int x=0;x<=8;x++)
       {
       boolean b=is_Row_Valid(x);
       if(!b)
           return false;
        b=is_Column_Valid(x);
       if(!b) 
           return false;
       }
       
       
       
        /*
      0,0   0,3     0,6
      3,0   3,3     3,6
      6,0   6,3     6,6
      
       row 0,3,6
      */
        for(int row=0;row<=6;row=row+3)
        {
            for(int col=0;col<=6;col=col+3)
            {
                boolean b=is_Box_Valid(row, col);
                if(!b)
                    return false;
             }
        }
            
     return true;
       
       
       
   }
   static  boolean is_Row_Valid (int row)    
  {
          int freq[]=new int[10];
          for(int i=0;i<=8;i++)
     {
         int value=arr[row][i];
         if(value==0) 
             continue;
         if(freq[value]>0)
             return false;
         freq[value]++;
         } 
          return true;
  }
      static  boolean is_Box_Valid (int row,int col)  
  {
     
          int freq[]=new int[10];
          for(int i=row;i<=row+2;i++)
          {
              for(int j=col;j<=col+2;j++)
     {
         int value=arr[i][j];
         if(value==0)
             continue;
         if(freq[value]>0)
             return false;
         freq[value]++;
         }
          }
          return true;
  }
   static  boolean is_Column_Valid (int col)  
  {
          int freq[]=new int[10];
          for(int i=0;i<=8;i++)
     {
         int value=arr[i][col];
         if(value==0)
             continue;
         if(freq[value]>0)
             return false;
         freq[value]++;
         }
          return true;
  }
}    