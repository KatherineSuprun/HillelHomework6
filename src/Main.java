
public class Main {
    public static void main(String[] args) {

        DataTypes.findSymbolOccurance("Welc&ome to & the & club now &&", '&');
        DataTypes.findWordPosition("Hello world", "world");
        DataTypes.stringReverse("Hello");
        System.out.println("---------Task 4 palindrome string");
        System.out.println("Word palindrome: " + DataTypes.isPalindrome("ERE"));
        DataTypes.boolGame();
    }
}