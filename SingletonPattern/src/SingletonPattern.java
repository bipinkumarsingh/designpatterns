public class SingletonPattern {

    private static SingletonPattern singletonPattern=null;

    private SingletonPattern()
    {

    }

    public static SingletonPattern getSingletonPattern() {

        if(singletonPattern==null) {
            singletonPattern=new SingletonPattern();
        }
        return singletonPattern;
    }
}
