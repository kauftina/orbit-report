import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        String q1 = "What color are carrots?\n(a)red\n(b)green\n(c)orange\n";
        String q2 = "What color are bananas?\nSelect 1, 2 or 3: (1)green\n(2)yellow\n(3)purple\n";
        String q3 = "Peppers are always green. True or False";

        QuizRunner[] questions = {
                new QuizRunner(q1, "c"),
                new QuizRunner(q2, "2"),
                new QuizRunner(q3, "False")
                };
                    takeTest(questions);
          }




    public static void takeTest(QuizRunner[] questions) {
        int score = 0;
        Scanner keyboardInput = new Scanner(System.in);
        for(int i =0; i< questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = keyboardInput.nextLine();
            if (answer.equals(questions[i].answer)) {
                score++;
            }
        }
            System.out.println("You got " + score + "/" + questions.length);


    }
}
