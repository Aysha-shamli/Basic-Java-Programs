import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print ("Enter the Alphabet: ");
        char Alphabet = scanner.next().charAt(0);
        boolean isvowel = false;
        char[] vowels = {'a','e','i','o','u'};
        for (char x : vowels){
            if(Alphabet == x){
                isvowel = true;

            }else{
                isvowel = false;
            }
        }
        if (isvowel ){
            System.out.println("The Alphabet is vowel");
        }else{
            System.out.println("The Alphabet is Consonant");
        }


    }

}
