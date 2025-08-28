package school.sorokin.javacore.basics;

public class VariablesLesson {

    public static void main(String[] args) {
        byte a;
        short b;
        int c;
        long d;
        float f;
        double g;
        boolean h;
        char ch;

        a = 20;
        b = 1215;
        c = 150000;
        d = 8142000000L;
        f = 3.14f;
        g = 15.3456;
        h = false;
        ch = 'A';

        System.out.println("byte a = " + a);
        System.out.println("short b = " + b);
        System.out.println("int c = " + c);
        System.out.println("long d = " + d);
        System.out.println("float f = " + f);
        System.out.println("double g = " + g);
        System.out.println("boolean h = " + h);
        System.out.println("char ch = " + ch);

        int k = (int) g;

        System.out.println("Приведение double к int: double g = " + g + " получается int k = " + k);

        int l = ch + 1;
        int m = ch + 2;
        int n = ch + 3;

        char o = (char) l;
        char p = (char) m;
        char r = (char) n;

        System.out.println("o = " + o);
        System.out.println("p = " + p);
        System.out.println("r = " + r);
    }
}
