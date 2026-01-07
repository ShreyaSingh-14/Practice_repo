import java.util.*;

class DFA {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1 to consider epsilon case");
        int a = sc.nextInt();

        System.out.println("Enter the string (0s and 1s only)");
        String str = sc.next();

        char state = 'x'; 

        if (a == 1 && str.length() == 0) {
         System.out.println("accepted");
    return;
        }

        for (int i = 0; i < str.length(); i++) {
            if (state == 'x') {
            if (str.charAt(i) == '0')
                state = 'y';
            else if (str.charAt(i) == '1')
                state = 'x';
            } 
            else if (state == 'y') {
            if (str.charAt(i) == '0')
                state = 'x';
            else if (str.charAt(i) == '1')
                state = 'y';
            }
        }

        if (state == 'x')
            System.out.println("accepted");
        else
            System.out.println("rejected");
    }
}
