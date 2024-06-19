import java.util.Random;

public class Q3_array {
    public static void main(String[] args) {
        int numberOfQuestions = 1000;
        Random random = new Random();

        int[] Answers = new int[numberOfQuestions];
        int[] myAnswers = new int[numberOfQuestions];

        for (int i = 0; i < numberOfQuestions; i++) {
            Answers[i] = random.nextInt(4) + 1;
            myAnswers[i] = random.nextInt(4) + 1;
        }

        int correctCount = 0;

        for (int i = 0; i < numberOfQuestions; i++) {
            if (Answers[i] == myAnswers[i]) {
                correctCount++;
            }
        }

        System.out.println("Index\tCorrect Answer\tMy Answer");
        for (int i = 0; i < numberOfQuestions; i++) {
            System.out.println(i + "\t" + Answers[i] + "\t\t" + myAnswers[i]);
        }

        System.out.println("맞은 개수: " + correctCount);
    }
}
