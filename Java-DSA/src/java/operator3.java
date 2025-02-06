package java;

public class operator3 {
    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;

        System.out.println(b1 && b2);
        System.out.println(b1 && b3);
        System.out.println(b1 || b2);
        System.out.println(b1 || b3);
        System.out.println(b2 || b2);

        int score = 68;
        if (score <= 100 && score >= 70) {
            System.out.println("성공");
        } else {
            System.out.println("실패");
        }

        System.out.println(b1 ^ b3);
        System.out.println(b1 ^ b2);
        System.out.println(!b1);

        //삼항연산자
        int c1 = (5 > 4) ? 50 : 40;
        System.out.println(c1);

        int c2 = 0;
        if (5 > 4) {
            c2 = 50;
        } else {
            c2 = 40;
        }

        System.out.println(c2);
    }
}