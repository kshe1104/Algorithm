
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //입력받기

        double sum = 0; //평점 더하기
        double total = 0; //학점 모두 더하기(나누기용)


        for (int i = 0; i < 20; i++) {
            String line = br.readLine(); //과목 하나(한줄) 압력받음
            String[] arr = line.split(" "); //배열 생성 후 띄어쓰기 기준으로 배열을 만듦

            String subject = arr[0]; //과목명(쓸데없지만 혹시모르니)

            double credit = Double.parseDouble(arr[1]); //double 형식으로 바꿈

            String grade = arr[2]; // 학점 분리해냄

            if (grade.equals("P")) { //P라면 제외
                continue;
            }

            double score = toScore(grade); // 학점 -> 숫자로
            sum += credit * score;

            total += credit; //마지막에 나누기 위함
        }

        double result = sum / total;
        System.out.println(result);

}
    private static double toScore(String grade) {
        switch (grade) {
            case "A+": return 4.5;
            case "A0": return 4.0;
            case "B+": return 3.5;
            case "B0": return 3.0;
            case "C+": return 2.5;
            case "C0": return 2.0;
            case "D+": return 1.5;
            case "D0": return 1.0;
            case "F":  return 0.0;
            default:   return -1.0;   // 올 일은 없지만 예외용
        }

}}
