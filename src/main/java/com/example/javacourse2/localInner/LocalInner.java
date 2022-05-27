package com.example.javacourse2.localInner;

import lombok.AllArgsConstructor;
import lombok.Data;

public class LocalInner {
    public static void main(String[] args) {
        class Sum implements Math2{
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        }
        System.out.println(new Sum().doOperation(3, 5));
        Math math = new Math();
        math.getResult();
    }
}
interface Math2{
    int doOperation(int a, int b);
}

class Math {

    private int a = 10;

    public void getResult() {

        @Data
        @AllArgsConstructor
        class Division {
            private int dividend;
            private int divider;

            public int quotient() {
                return dividend / divider;
            }

            public int remainder() {
                return dividend % divider;
            }

        }

        Division div = new Division(21, 4);
        System.out.println(div.quotient());
        System.out.println(div.remainder());
    }
}
