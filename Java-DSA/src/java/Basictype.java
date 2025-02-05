package java;

public class Basictype {
    public static void main(String[] args) {
        boolean isFun = false;
        System.out.println(isFun);

        char c = 'f';

        int x = 59;

        long bing = 3445435353L;

        float f = 32.4f;

        double d = 3434343.5;

//        기본형 타입 변환
        int a = 50000;
        long y = a;

//        강제 형변환
        long a2 = 5;
//        int y2 = a2; (이렇게 묵시적으로 수행하면 컴파일러는 오류를 발생 시킨다.)
        int y2 = (int) a2; //(반드시 (타입) 으로 명시적으로 형을 바꾸어 주어야 한다.)
    }
}
