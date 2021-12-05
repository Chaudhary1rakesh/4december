import java.util.Scanner;
public class Test1 {
    public static void talk()
    {
          System.out.print("Hello ");
    }
    public static void talk(String name)
    {
          System.out.print(name+"!");
    }

    

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
       String name= sc.nextLine();
        talk();
        talk(name);
        sc.close();
    }
}
      