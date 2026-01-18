public class Main {
    public static void main(String[] args) {

        // 아래는 모두 람다식으로 작성해주세요.

        // TODO-1 두 수의 합
        Calculator add =        ;
        System.out.println(add.calc(3, 5));

        // TODO-2 두 수의 곱
        Calculator multiply =       ;
        System.out.println(multiply.calc(3, 5));

        // TODO-3 두 수 중 큰 값
        Calculator max =        ;
        System.out.println(max.calc(3, 5));

        // TODO-4 제곱 계산
        Converter square =          ;
        System.out.println(square.convert(4));

        // TODO-5 2배 계산
        Converter doubleIt =        ;
        System.out.println(doubleIt.convert(7));

        //  TODO-6 이중 콜론 연산자
        //  람다식을 이중 콜론 연산자(::)로 바꿔보세요

        // 람다 방식
        Printer printer1 = message -> System.out.println(message);
        printer1.print("안녕하세요");

        // 이중 콜론 연산자 방식
        Printer printer2 =          ;
        printer2.print("반갑습니다");
    }
}

interface Calculator {
    int calc(int a, int b);
}

interface Converter {
    int convert(int x);
}

interface Printer {
    void print(String message);
}