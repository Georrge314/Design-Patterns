package bg.softuni.creational.singleton;

public class SingletonTwo {
    private static volatile  SingletonTwo instance;
    public String value;

    private SingletonTwo(String value) {
        this.value = value;
    }

    public static SingletonTwo getInstance(String value) {
        SingletonTwo result = instance;
        if(result != null) {
            return result;
        }

        synchronized (SingletonTwo.class) {
            if (instance == null) {
                instance = new SingletonTwo(value);
            }
            return instance;
        }
    }

    public String getValue() {
        return value;
    }
}
