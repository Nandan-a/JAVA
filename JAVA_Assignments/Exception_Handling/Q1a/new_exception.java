import java.util.Scanner;

class NameException extends Exception{
    public NameException(String s){
        super(s);
    }

}


public class new_exception {
    static void name_check(int name) throws NameException{
        if(name== 10)
        {
            System.out.println("Welcome");
        }
        else
        {
            throw new NameException("You are not a valid user!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        try{
            name_check(input);
        }
        catch(NameException n){
            System.out.println("Exception occured || "+n);
        }
    }
}

