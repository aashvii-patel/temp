import java.util.*;

public class Missions {
    private String location;
    private double time;
    private String objective;
    private double rewards;
    private static Scanner input = new Scanner(System.in);
    private static String[] wordSearches = {
        "Find the flower?\na u t n o c j r k n d f\nd k f a j r k s j d a f\ns a f k f b o k j d f k\nk a j f k b b s w k d j\np o o e k a n r e f g y",
        "Find the animal?\nl k j b i e u q p n z k\nd o g r t o b f s k x l\no u t w n n l i r n k q\nf g e r j d s k v y d u\nk d h b c d j x g b k l",
        "Find the animal?\nl k j b i e u q p n z k\nd o g r t o b f s k x l\no u t w n n l i r n k q\nf g e r j d s k v y d u\nk d h b c d j x g b k l"

    };
    private static String[] answers = {
        "rose",
        "dog",
        "kfds"

    };

    public static String [] getRanPuzzle() {
        int rand = (int)(Math.random()*2);
        String thisPuzzle = wordSearches[rand];
        return new String [] {String.valueOf(rand), thisPuzzle};

    }

    public static boolean checkAnswer(int puzzle, String answer) {
        if(answers[puzzle].equals(answer)) {
            return true;
        } else {
            return false;
        }
    }
}