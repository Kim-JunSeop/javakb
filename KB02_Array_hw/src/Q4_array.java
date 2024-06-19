public class Q4_array {
    public static void main(String[] args) {

        String[] subjects = {"국어", "영어", "수학", "컴퓨터", "회화"};

        int[] firstSemesterGrades = {44, 66, 22, 99, 100};

        int[] secondSemesterGrades = firstSemesterGrades.clone();
        secondSemesterGrades[0] = 22;
        secondSemesterGrades[2] = 88;

        System.out.println("1학기 성적:");
        printGrades(subjects, firstSemesterGrades);

        System.out.println("2학기 성적:");
        printGrades(subjects, secondSemesterGrades);

        int sameGradeCount = 0;
        for (int i = 0; i < subjects.length; i++) {
            if (firstSemesterGrades[i] == secondSemesterGrades[i]) {
                sameGradeCount++;
            }
        }
        System.out.println("동일한 성적 과목 수: " + sameGradeCount);

        int improvedGradeCount = 0;
        StringBuilder improvedSubjects = new StringBuilder();
        for (int i = 0; i < subjects.length; i++) {
            if (secondSemesterGrades[i] > firstSemesterGrades[i]) {
                improvedGradeCount++;
                improvedSubjects.append(subjects[i]).append(" ");
            }
        }
        System.out.println("성적이 오른 과목 수: " + improvedGradeCount);
        System.out.println("성적이 오른 과목명: " + improvedSubjects.toString());
    }

    private static void printGrades(String[] subjects, int[] grades) {
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + grades[i]);
        }
    }
}
