import java.util.Scanner;

public class Q3_homework {
    public static void main(String[] args) {
        System.out.println("첫 번째 수학점수를 입력하시오");
        Scanner sc = new Scanner(System.in);
        int firstMathScore = sc.nextInt();
        System.out.println("두 번째 수학점수를 입력하시오");
        int secondMathScore = sc.nextInt();
        int mathScore = firstMathScore + secondMathScore;

        System.out.println("첫 번째 영어점수 입력하시오");
        int firstEnglishScore = sc.nextInt();
        System.out.println("두 번째 영어점수 입력하시오");
        int secondEnglishScore = sc.nextInt();
        int englishScore = firstEnglishScore + secondEnglishScore;
        System.out.println("mathScore  = " + mathScore + "\nenglishScore =" + englishScore);

    }
}
