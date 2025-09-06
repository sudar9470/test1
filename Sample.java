import java.util.*;
class Sample{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        String name  = in.nextLine();
        int age = in.nextInt();
        in.nextLine();
        String gender = in.nextLine();
        System.out.println("Name: "+name);
        System.out.println("Age:"+age);
        System.out.println("Gender:"+gender);


    }
}