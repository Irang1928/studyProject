package com.example.studyproject;

// 가변인자 오버라이딩, 오버로딩 예제
// Alt + Insert , Alt + Shift + Enter , Shift * 2
public class TestImpl implements TestInterface {
    private String a;

    @Override
    public void test1() {
        String s = "";
        String a = this.a;
    }

    public void test1(String a) {
        test1("", "", "");
    }

    public void test1(String... a) {
        String[] a1 = a;
    }


    // call-by-value, call-by-reference 예제
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        B b1 = new B();
        B b2 = b1;
        int c1 = 5;
        int c2 = 7;

        a1.setB(b1);    // b = b1
        a2.setB(b2);    // b = b2

        b1.setA(c1);    // a = 5
        b2.setA(c2);    // a = 5 -> a = 7

        c1++;   // 6
        c2++;   // 8

        b1.setA(b2.getA());     // a = 7 -> a = 7
        b2.setA(b1.getA());     // a = 7 -> a = 7

        System.out.println(a1.getB().getA());   // 7
        System.out.println(a2.getB().getA());   // 7
        System.out.println(b1.getA());          // 7
        System.out.println(b2.getA());          // 7
        System.out.println(c1);                 // 6
        System.out.println(c2);                 // 8

    }

    static class A {
        B b = null;

        public B getB() {
            return b;
        }

        public void setB(B b) {
            this.b = b;
        }
    }

    static class B {
        int a = 0;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }
    }
}
