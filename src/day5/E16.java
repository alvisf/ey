package day5;

public class B {

    private void don() {
        System.out.println("hoho private");
    }
    public static void main(String[] args) {
        B t = new A();
        t.don();
    }
}

class E16 extends B {
    public void don() {
        System.out.println("hoho public");
    }
}