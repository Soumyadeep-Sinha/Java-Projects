package MorseCode;

import java.util.HashMap;
import java.util.Scanner;

public class EnglishToMorse {
    public static HashMap<Character, String> map = new HashMap<>();
    public static HashMap<String, Character> mtoe = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("\u001B[35m" + "--- MORSE CODE SYSTEM ---" + "\u001B[37m");
        Scanner input = new Scanner(System.in);

        System.out.print("Encryption / Decryption (enter (e or d)) : ");
        char choice = input.next().charAt(0);

        if(choice != 'e' && choice != 'd'){
            while(choice != 'e' && choice != 'd'){
                System.out.println("wrong input");
                System.out.print("Encryption / Decryption (enter (e or d)) : ");
                choice = input.next().charAt(0);
            }
        }

        if(choice == 'e'){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter English Message Below : ");
            String m = in.nextLine().trim();
    
            fillmap(map);
            System.out.println("\u001B[31m" + convertetom(m) + "\u001B[37m");
            in.close();
        }

        if(choice == 'd'){
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Morse Code Below : ");
            String m = in.nextLine().trim();
    
            fillmtoe(mtoe);
            System.out.println("\u001B[32m" + convertmtoe(m) + "\u001B[37m");
            in.close();
        }

        
        input.close();
    }

    public static void fillmap(HashMap<Character, String> map) {
        // alphabets
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");

        map.put('A', ".-");
        map.put('B', "-...");
        map.put('C', "-.-.");
        map.put('D', "-..");
        map.put('E', ".");
        map.put('F', "..-.");
        map.put('G', "--.");
        map.put('H', "....");
        map.put('I', "..");
        map.put('J', ".---");
        map.put('K', "-.-");
        map.put('L', ".-..");
        map.put('m', "--");
        map.put('N', "-.");
        map.put('O', "---");
        map.put('P', ".--.");
        map.put('Q', "--.-");
        map.put('R', ".-.");
        map.put('S', "...");
        map.put('T', "-");
        map.put('U', "..-");
        map.put('V', "...-");
        map.put('W', ".--");
        map.put('X', "-..-");
        map.put('Y', "-.--");
        map.put('Z', "--..");

        // numbers

        map.put('0', "-----");
        map.put('1', ".----");
        map.put('2', "..---");
        map.put('3', "...--");
        map.put('4', "....-");
        map.put('5', ".....");
        map.put('6', "-....");
        map.put('7', "--...");
        map.put('8', "---..");
        map.put('9', "----.");

        // special characters

        map.put('.', ".-.-.-");
        map.put(',', "--..--");
        map.put('?', "..--..");
        map.put('"', ".-..-.");
        map.put('!', "-.-.--");
        map.put('/', "-..-.");
        map.put('(', "-.--.");
        map.put(')', "-.--.-");
        map.put('&', ".-...");
        map.put(':', "---...");
        map.put(';', "-.-.-.");
        map.put('=', "-...-");
        map.put('+', ".-.-.");
        map.put('-', "-....-");
        map.put('_', "..--.-");
        map.put('$', "...-..-");
        map.put('@', ".--.-.");
        map.put('¿', "..-.-");
        map.put('¡', "--...-");

        // space
        map.put(' ', "/");
    }

    public static void fillmtoe(HashMap<String, Character> mtoe) {

        //alphabets

        mtoe.put(".-", 'A');
        mtoe.put("-...", 'B');
        mtoe.put("-.-.", 'C');
        mtoe.put("-..", 'D');
        mtoe.put(".", 'E');
        mtoe.put("..-.", 'F');
        mtoe.put("--.", 'G');
        mtoe.put("....", 'H');
        mtoe.put("..", 'I');
        mtoe.put(".---", 'J');
        mtoe.put("-.-", 'K');
        mtoe.put(".-..", 'L');
        mtoe.put("--", 'M');
        mtoe.put("-.", 'N');
        mtoe.put("---", 'O');
        mtoe.put(".--.", 'P');
        mtoe.put("--.-", 'Q');
        mtoe.put(".-.", 'R');
        mtoe.put("...", 'S');
        mtoe.put("-", 'T');
        mtoe.put("..-", 'U');
        mtoe.put("...-", 'V');
        mtoe.put(".--", 'W');
        mtoe.put("-..-", 'X');
        mtoe.put("-.--", 'Y');
        mtoe.put("--..", 'Z');

        mtoe.put(".-", 'a');
        mtoe.put("-...", 'b');
        mtoe.put("-.-.", 'c');
        mtoe.put("-..", 'd');
        mtoe.put(".", 'e');
        mtoe.put("..-.", 'f');
        mtoe.put("--.", 'g');
        mtoe.put("....", 'h');
        mtoe.put("..", 'i');
        mtoe.put(".---", 'j');
        mtoe.put("-.-", 'k');
        mtoe.put(".-..", 'l');
        mtoe.put("--", 'm');
        mtoe.put("-.", 'n');
        mtoe.put("---", 'o');
        mtoe.put(".--.", 'p');
        mtoe.put("--.-", 'q');
        mtoe.put(".-.", 'r');
        mtoe.put("...", 's');
        mtoe.put("-", 't');
        mtoe.put("..-", 'u');
        mtoe.put("...-", 'v');
        mtoe.put(".--", 'w');
        mtoe.put("-..-", 'x');
        mtoe.put("-.--", 'y');
        mtoe.put("--..", 'z');

        //numbers
        mtoe.put("-----",'0');
        mtoe.put(".----",'1');
        mtoe.put("..---",'2');
        mtoe.put("...--",'3');
        mtoe.put("....-",'4');
        mtoe.put(".....",'5');
        mtoe.put("-....",'6');
        mtoe.put("--...",'7');
        mtoe.put("---..",'8');
        mtoe.put("----.",'9');

        //specials
        mtoe.put(".-.-.-",'.' );
        mtoe.put("--..--",',' );
        mtoe.put("..--..",'?' );
        mtoe.put(".-..-.",'"' );
        mtoe.put("-.-.--",'!' );
        mtoe.put("-..-.",'/' );
        mtoe.put("-.--.",'(' );
        mtoe.put("-.--.-",')' );
        mtoe.put(".-...",'&' );
        mtoe.put("---...",':' );
        mtoe.put("-.-.-.",';' );
        mtoe.put("-...-",'=' );
        mtoe.put(".-.-.",'+' );
        mtoe.put("-....-",'-' );
        mtoe.put("..--.-",'_' );
        mtoe.put("...-..-",'$' );
        mtoe.put(".--.-.",'@' );
        mtoe.put("..-.-",'¿' );
        mtoe.put("--...-",'¡' );


        //space
        mtoe.put("/", ' ');
    }

    public static String convertetom(String m) {

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < m.length(); i++) {
            build.append(map.get(m.charAt(i)));
            build.append(" ");
        }
        System.out.println("\n--- Encrypted Morse Code ---\n");
        return build.toString().trim();
    }

    public static String convertmtoe(String m){
        StringBuilder build = new StringBuilder();
        String[] words = m.split(" / ");

        for(String word : words){
            String[] letters = word.split(" ");
            for(String letter : letters){
                build.append(mtoe.get(letter));
            }
            build.append(" ");
        }
        System.out.println("\n--- Decrypted English output --- \n");
        return build.toString().trim();
    }

}
