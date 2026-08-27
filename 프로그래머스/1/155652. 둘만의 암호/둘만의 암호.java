class Solution {
public String solution(String s, String skip, int index) {
    // 1. 올바른 알파벳 배열 생성 ('v' 포함 26자)
    char[] s1 = s.toCharArray();
    char[] skip1 = skip.toCharArray();
    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    // 2. skip 문자를 alphabet에서 제거 (StringBuilder 활용)
    StringBuilder sb = new StringBuilder(new String(alphabet));
    for (char c : skip1) {
        int idx = sb.indexOf(String.valueOf(c));
        if (idx != -1) {
            sb.deleteCharAt(idx);
        }
    }
    alphabet = sb.toString().toCharArray(); // skip 제거된 알파벳 배열

    // 3. index만큼 이동 (모듈러 연산으로 범위를 벗어나는 경우 처리)
    for (int i = 0; i < s1.length; i++) {
        for (int j = 0; j < alphabet.length; j++) {
            if (s1[i] == alphabet[j]) {
                int newIndex = (j + index) % alphabet.length; // 모듈러 연산
                s1[i] = alphabet[newIndex];
                break; // 변환 완료 후 내부 루프 탈출
            }
        }
    }

    return new String(s1);
}
}