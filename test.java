import java.util.*;
public class test{
    public static void main (String[] args){
        String [] thePuzzle = Missions.getRanPuzzle();
        System.out.println(thePuzzle[1]);
        Scanner input = new Scanner(System.in);
        String answer = input.next();
        if (Missions.checkAnswer(Integer.parseInt(thePuzzle[0]), answer)) {
            System.out.println("You got it Right!");
        } else {
            System.out.println("You got it Wrong!");
        }

    }

}