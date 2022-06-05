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

        a1.setB(b1);
        a2.setB(b2);

        b1.setA(c1);
        b2.setA(c2);

        c1++;
        c2++;

        b1.setA(b2.getA());
        b2.setA(b1.getA());

        System.out.println(a1.getB().getA());
        System.out.println(a2.getB().getA());
        System.out.println(b1.getA());
        System.out.println(b2.getA());
        System.out.println(c1);
        System.out.println(c2);

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
