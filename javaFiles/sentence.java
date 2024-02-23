// write a program to get a sentence as user input and print each word in opposite order
import java.util.Scanner;
public class sentence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String str = sc.nextLine();
        String reverseSentence = "";
        int length = str.length() - 1;
        while (length >= 0) {
            reverseSentence += str.charAt(length--);
            }
            String[] words = reverseSentence.split(" ");
            for (int i = words.length-1; i>=0; i--){
                System.out.print(words[i]+" ");
                }
                }

    }  
