class OverloadDemo {
    int a;
    float b;
    double c;

    void test() {
        System.out.println("test() is called");
    }

    void test(int val) {
        a = val;
        System.out.println("a=" + a);
    }

    void test(double d) {
        c = d;
        System.out.println("c=" + c);
    }

    void test(int a, float b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("a=" + this.a + " b=" + this.b + " c=" + this.c);
    }
}

class MethodOverload {
    public static void main(String args[]) {
        OverloadDemo obj = new OverloadDemo();

        obj.test(6);                  
        obj.test();                  
        obj.test(4.2);               
        obj.test(2, 10.2f, 5.5);      
        obj.test(2, 6.0f, 8.0);       
    }
}
