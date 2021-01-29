package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score == 4000)
//            System.out.println("Your score was 5000");
//
//        if (score == 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed");
//        }
//
//        if (score <= 5000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed");
//        } else {
//            System.out.println("Got here");
//        }
//
//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was 5000");
//            System.out.println("This was executed");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        } else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        // Print out a second score on the screen with the following
        // score set 10000
        // levelCompleted set to 8
        // bonus set to 200
        // But make sure the first printout above still displays as well

//        boolean newGameOver = true;
//        int newScore = 10000;
//        int newLevelCompleted = 8;
//        int newBonus = 200;
//
//        if (newGameOver) {
//            int finalScore = newScore + (newLevelCompleted * newBonus);
//            System.out.println("Your final score was " + finalScore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
