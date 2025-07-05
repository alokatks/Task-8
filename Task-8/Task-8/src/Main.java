import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Question> questions=new ArrayList<>();
        questions.add(new Question(
                "Which of the following is not a Java keyword?",
                new String[]{"class", "static", "array", "int"},
                2)); // "array" is not a keyword

        questions.add(new Question(
                "Which method is the entry point of a Java program?",
                new String[]{"start()", "main()", "run()", "init()"},
                1)); // "main()" is correct

        questions.add(new Question(
                "Which of these is used to create an object in Java?",
                new String[]{"alloc", "malloc", "new", "create"},
                2)); // "new"
        int score = 0;

        // Loop through questions
        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();
            if (q.isCorrect(ans)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Wrong!");
            }
            System.out.println();
        }

        // Final score
        System.out.println("Quiz Over! Your Score: " + score + "/" + questions.size());
    }


    }
