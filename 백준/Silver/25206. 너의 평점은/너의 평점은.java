import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double sum = 0;
        double total = 0;

        for (int i = 0; i < 20; i++) {
            String line = br.readLine(); //입력받기
            String[] arr = line.split(" "); // 띄어쓰기 기준으로 뱅ㄹ 나누기

            String subject = arr[0]; // 과목명
            double credit = Double.parseDouble(arr[1]); // 몇학점인지
            String grade = arr[2]; // 성적(학점)

            if (grade.equals("P")) continue; // P라면 그냥 진행

            Main q = new Main(); //객체 생성

            double score = q.toScore(grade); // 학점을 숫자로
            sum += credit * score; // 학점 모두 더하기
            total += credit; // 수강한 학점전부
        }
        double result = sum / total;
        System.out.println(result);
    }

    private double toScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.5;
            case "A0":
                return 4.0;
            case "B+":
                return 3.5;
            case "B0":
                return 3.0;
            case "C+":
                return 2.5;
            case "C0":
                return 2.0;
            case "D+":
                return 1.5;
            case "D0":
                return 1.0;
            case "F":
                return 0.0;
            default:
                return 0;
        }
    }
}
