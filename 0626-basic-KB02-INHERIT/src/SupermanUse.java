class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + "이(가) 밥을 먹습니다.");
    }
}

class Man extends Person {
    int power;

    public Man(String name, int age, int power) {
        super(name, age);
        this.power = power;
    }

    void run() {
        System.out.println(name + "이(가) 빠르게 달립니다.");
    }
}

class Superman extends Man {
    boolean sky;

    public Superman(String name, int age, int power, boolean sky) {
        super(name, age, power);
        this.sky = sky;
    }

    void space() {
        System.out.println(name + "이(가) 우주를 날아갑니다.");
    }

    @Override
    void run() {
        System.out.println(name + "이(가) 더 빠르게 달립니다.");
    }

    @Override
    public String toString() {
        return "슈퍼맨 [name=" + name + ", age=" + age + ", power=" + power + ", sky=" + sky + "]";
    }
}

public class SupermanUse {
    public static void main(String[] args) {
        Superman superman = new Superman("클라크 켄트", 30, 100, true);
        superman.eat();
        superman.run();
        superman.space();
        System.out.println(superman);
    }
}
