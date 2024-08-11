package dev.yanpgabriel.patterns.creational;

public class Singleton {
    public static void main(String[] args) {
        SingletonObject singletonObject1 = SingletonObject.getInstance();
        SingletonObject singletonObject2 = SingletonObject.getInstance();

        System.out.println(singletonObject1);
        System.out.println(singletonObject2);
    }
}

class SingletonObject {
    private String name;
    private static SingletonObject instance;

    private SingletonObject(String name) {
        this.name = name;

    }

    public static SingletonObject getInstance() {
        if (instance == null) {
            instance = new SingletonObject("Singleton Object " + System.currentTimeMillis());
        }
        return instance;
    }

    public String toString() {
        return name;
    }
}