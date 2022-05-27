package com.example.javacourse2.anonymous;

public class Anonymous {
    private int x = 5;

    public static void main(String[] args) {
        Math m = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }

            int c = 10;

            void abc() {
            }
        };

//        Math m2 = new Math() {
//            @Override
//            public int doOperation(int a, int b) {
//                return (a * b) % new Anonymous().x;
//            }
//        };

        Math m2 = (a, b) -> (a * b) % new Anonymous().x;
        System.out.println(m.doOperation(4, 3));
        System.out.println(m2.doOperation(4, 3));

    }

    interface Math {
        int doOperation(int a, int b);
//        int moreOperation(int c, int g);
    }
}
