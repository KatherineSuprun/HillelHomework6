import java.util.Random;
import java.util.Scanner;

public class DataTypes {

    public static void findSymbolOccurance(String words, char count) {

        System.out.println("---------The task 1 is to find the number of a certain character in a string");

        words = "Welc&ome to & the & club now &&";
        count = (char) words.length();
        char count1 = (char) words.replace("&", "").length();

        int count2 = count - count1;
        System.out.println("The character count & is: " + count2);

    }

    public static void findWordPosition(String source, String target) {

        System.out.println("---------Task 2 to find a substring in a string");

        source = "Hello world!";
        target = String.valueOf(source.indexOf("world"));

        System.out.println("Index of occurrence of a substring in a string: " + target);
    }

    public static void stringReverse(String reverse) {

        System.out.println("---------Task 3 to find a substring in a string");

        reverse = "Hello";
        StringBuilder builder = new StringBuilder(reverse);
        System.out.println("The word is reversed: " + builder.reverse());
    }

    public static boolean isPalindrome(String palindrome) {

        palindrome = "ERE";
        palindrome = palindrome.replaceAll("\\W", "");
        StringBuilder strBuilder = new StringBuilder(palindrome);
        strBuilder.reverse();
        String rotateText = strBuilder.toString();

        return palindrome.equalsIgnoreCase(rotateText);

    }

    public static void boolGame() {
        System.out.println("---------Task 5 Guess the word: ");
        System.out.println("Do u want to start the game? Yes / No");
        Scanner scan = new Scanner(System.in);
        String bool = scan.nextLine().toLowerCase();
        if (bool.equals("yes")) {
            DataTypes.guessWord();
        } else {
            System.out.println("Waiting for you next time");
            System.exit(0);
        }
    }

    public static void guessWord() {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                " pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};


        Random random = new Random();
        String randomWord = words[random.nextInt(words.length)];
        System.out.println("apple, orange, lemon,banana,apricot,avocado,broccoli,carrot,cherry,garlic,grape,\n" +
                "melon,leak,kiwi,mango,mushroom,nut,olive,pea, peanut, pear,\n" +
                "pepper, pineapple, pumpkin, potato");

        StringBuilder stringBuilder = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        while (true) {
            String desired = sc.nextLine().toLowerCase();

            if (randomWord.equals(desired)) {
                System.out.println(randomWord + "\nOh my god! - You won! :) ");
                break;

            } else {
                for (int i = 0; i < 15; i++) {
                    if (i < randomWord.length() && i < desired.length() &&
                            randomWord.charAt(i) == desired.charAt(i)) {
                        stringBuilder.append(desired.charAt(i));

                    } else {
                        stringBuilder.append("#");
                    }
                }
                System.out.println(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
                System.out.println("Please, try again :( \nYou can do it!");
            }
        }
    }
}



// palindrom = palindrom.replaceAll("\\W", "");
//         StringBuilder strBuilder = new StringBuilder(palindrom);
//         strBuilder.reverse();
//         String rotateText = strBuilder.toString();
//
//         return palindrom.equalsIgnoreCase(rotateText);

//        String input = "Hello & Java! Hello Everybody &!";
//        Pattern pattern = Pattern.compile("&(\\w*)");
//        Matcher matcher = pattern.matcher(input);
//        while(matcher.find())
//            System.out.println(matcher.group());

//2 private static boolean isSubstring(String s, String seq) {
//            return s.indexOf(seq) != -1;
//
//        }
//            String s = "Saturday";
//            String seq = "Sat";
//
//            System.out.println(isSubstring(s, seq)? "Yes": "No");