import java.util.Scanner;

public class Q1_array {
    public static void main(String[] args) {

        String[] movies = {
                "1. 인사이드 아웃 - 조회수: 15,000원",
                "2. 설계자 - 조회수: 23,000원",
                "3. 추락의 해부 - 조회수: 18,000원",
                "4. 사운드 오브 프리덤 - 조회수: 21,000원",
                "5. 리틀 포레스트 - 조회수: 19,000원"
        };

        int[] views = {15000, 23000, 18000, 21000, 19000};

        System.out.println("네이버 시리즈온 실시간 영화 목록:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("정보를 확인하고 싶은 영화 번호를 선택하세요 (1-5): ");
        int choice = scanner.nextInt();

        if (choice >= 1 && choice <= 5) {
            System.out.println("선택한 영화: " + movies[choice - 1].split(" - ")[0]);
            System.out.println("조회수: " + views[choice - 1] + "원");
        } else {
            System.out.println("잘못된 선택입니다.");
        }

        scanner.close();
    }
}
