package sec01.exam08;

public class CompareOperatorExample2 {
    public static void main(String[] args) {
        int v2 = 1;
        double v3 = 1.0;

        // 타입이 달라도 값이 비교가 되나 확인

        System.out.println(v2 == v3); //true

        double v4 = 0.1;
        float v5 = 0.1f;
        System.out.println(v4 == v5); //false
        System.out.println((float)v4 == v5 ); //true
        System.out.println((int)(v4*10) == (int) (v5*10)); //true
    }
}
