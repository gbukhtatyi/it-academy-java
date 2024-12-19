package examination.unicode;

public class Test1 {
    public static void main(String[] args) {
        char letterA = '\u0041'; // unicode for 'A'
        char smileyFace = '\u263A'; // unicode for a smiley face
        System.out.println(letterA);
        System.out.println(smileyFace);

        String emoji = "\uD83D\uDE00"; // surrogate pair for the emoji
        System.out.println(emoji);
    }
}
