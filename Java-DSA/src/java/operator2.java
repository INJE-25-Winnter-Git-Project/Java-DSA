package java;

public class operator2 {
    public static void main(String[] args) {
        int i = 10; // = 대입연산자
        int j = 10;

        // i 와 j 가 같은지 비교 하는 비교 연산자
        System.out.println(i == j );
        System.out.println(i != j );
        System.out.println(i < j);
        System.out.println( i <= j);
        System.out.println(i > j);
        System.out.println(i >= j);

        //복합대입연산자
        i += 10; // i = i + 10;
        System.out.println(i);
        System.out.println(i -= 5);

        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a - b * c);
        System.out.println(a > 5 || b > 5);
        System.out.println(++a - 5); //증감연산자
        System.out.println(a);
    }
}
