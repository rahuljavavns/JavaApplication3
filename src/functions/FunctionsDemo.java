
package functions;


public class FunctionsDemo {
      static void printNMessage(int n,String message)
    {
        for(int i=1;i<=n;i++)
        System.out.println(message);
     
    }   
     static void printNHello(int n)
    {
        for(int i=1;i<=n;i++)
        System.out.println("Hello");
     
      }
    
    
    static void printHello()
    {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
    public static void main(String[] args) {
       printHello();
        printNHello(3);
        printNMessage(3, "Train");
    }
}
