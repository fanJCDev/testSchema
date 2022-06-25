package Hacker.interefasac;

public class Testers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        myGreeting m1 = new myGreeting();
        System.out.println(m1.msg("ali"));
        System.out.println(m1.getClass());

        myGreeting m2 = new myGreeting() {
            public String msg(String name) {
                return "ohoi Hello " + name;
            }
        };
        System.out.println(m2.msg("reza"));

        Greetingintrfc m3 = (name) -> "hi dada " + name;
        System.out.println(m3.msg("Jamal"));
        System.out.println("-----------------------");
        System.out.println(m3.getClass());
        System.out.println("--------");
        System.out.println(Greetingintrfc.class);
        System.out.println("--------");
        System.out.println(m3.getClass() == Greetingintrfc.class);

        System.out.println(((Greetingintrfc) (name) -> "hi dadaaaaa " + name).msg("fffff"));
        System.out.println(m3.getClass() == Greetingintrfc.class);
        System.out.println(10 + 20 + "JavaPoint");
		/*
		myGreeting m4=(myGreeting)(Greetingintrfc)(name)->"Bonjour"+name;
		System.out.println(m4.msg("kkkkkkkkkk"));
		*/

    }
}
