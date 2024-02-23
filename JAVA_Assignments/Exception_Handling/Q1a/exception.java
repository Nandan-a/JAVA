import java.util.Scanner;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String s)
    {
        // Call constructor of parent Exception
        super(s);
    }
}

public class exception {
    static void number_check(int num)throws InvalidNumberException{
        if(num<10){
            throw new InvalidNumberException("Number is less than 10");
        }
        else
        {
            System.out.println("Number is Valid");
        }
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);  
        System.out.println("Enter a number: ");
        int input = user.nextInt();
        try{
            number_check(input);
        }
        catch (InvalidNumberException e){
             System.out.println("Exception occured || "+e);
        }
    }    
}