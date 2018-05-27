package Bulls_and_Cows;

import java.util.Random;
import java.util.Scanner;

public class Transformator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String test = scanner.next();
        char c = test.charAt(0);  // returns 'l'
        char[] c_arr = test.toCharArray(); // returns a length 4 char array ['l','i','n','e']
        for (char ch : test.toCharArray()){
            System.out.println(test.toCharArray());
        }
    }
}

