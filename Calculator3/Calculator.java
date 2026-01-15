package Calculator3;

import java.util.ArrayList;

public class Calculator {

    //컬렉션 생성 * 일반 배열선언과 다르게 자유롭게 들어가니 괜찮아.
    // 속성 캡슐화 / 속성과 생성이 동시에 선언된건가?
    private ArrayList<Integer> resultCollection = new ArrayList<>();


    // 기능
    //[1] method1 더하기
    public int sum(int first, int second) {

        // 변수를 먼저 선언한다. why? 컬렉션에 저장하기 위해서
        int result = (first + second);
        resultCollection.add(result);
        return result;
    }

    //[2] method2 빼기
    public int sub(int first, int second) {

        int result = (first - second);
        resultCollection.add(result);
        return first - second;
    }

    //[3] method3 곱하기
    public int mul(int first, int second) {

        int result = (first * second);
        resultCollection.add(result);
        return first * second;
    }

    //[4] method4 나누기
    public int div(int first, int second) {
        if (second==0){
            System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다");
            return 0;
        }

        int result = (first / second);
        resultCollection.add(result);
        return first / second;

    }

    // method5 getter setter 구현 후 method 추가 삭제
    public void removeResult() {
        resultCollection.remove(0);
    }


    //getter [array get으로 불러오기] / private 캡슐화로 해당클래스에 작성
    public ArrayList<Integer> getResultCollection() {
        return resultCollection; // 변수 이름만 정확히 리턴!
    }


    //setter [변수 수정] / private 캡슐화로 해당클래스에 작성
    public void setResultCollection(ArrayList<Integer> resultCollection) {
        this.resultCollection = resultCollection;
    }



}
