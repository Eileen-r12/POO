package Ensayo;

public class Number {
    public static void main(String args[]) {
        var a = 10;
        var b = 30;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(b / a);

        a = b;
        System.out.println(a);

        a+= 6 + b;
        System.out.println(a);
}
}
