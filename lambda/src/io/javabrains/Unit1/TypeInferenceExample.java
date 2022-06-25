package io.javabrains.Unit1;

public class TypeInferenceExample {
    public static void main(String[] args) {
        StringLengthLambda mylen = (String s)->s.length();
        System.out.println( mylen.getlen("hello lambda"));

        StringLengthLambda mylen1 = (s)->s.length();
        System.out.println( mylen.getlen("hello lambda2"));

        StringLengthLambda mylen2 = s->s.length();
        System.out.println( mylen.getlen("hello lambda34"));

        printerLambda(s->s.length());
    }
    interface StringLengthLambda{
        int getlen(String s);
    }
    public static void printerLambda(StringLengthLambda l){
        System.out.println(l.getlen("hello dear"));
    }
}
