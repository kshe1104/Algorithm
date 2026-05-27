    class Solution{
        public int[] solution(int brown, int yellow) {

            int total = brown + yellow; // 1단계 : 전체 넓이 구하기
            
            // 2단계: 세로를 3부터 시작해서 1씩 늘리면서 대입해보기
            // 최소 3은 되어야 노란색이 들어갈 공간이 생기기 때문
            for (int height = 3; height <= total; height++) {
                
                // 전체 넓이에서 세로를 나눴을 때 딱 떨어져야 올바른 사각형 구조이다
                if (total % height == 0) {
                    int width = total / height; //가로

                    // 3단계 : 가로가 세로 이상이고, 알맹이(노란색) 개수 공식이 일치하는가?
                    if (width >= height && (width - 2) * (height - 2) == yellow) {
                            return new int[]{width, height};
                    }
                }
            }
            return new int[]{};
        }
    }