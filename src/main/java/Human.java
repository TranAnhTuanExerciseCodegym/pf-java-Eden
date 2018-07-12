public class Human {
    private String name;
    private boolean gender;
    private int age;
    private String food = "Apple";

    public Human() {
    }

    public Human(String name, boolean gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void say(String word) {
        System.out.println(word);
    }

    public void eat(Apple food) {
        food.weight -= 1;
    }

    public void sleep() {
        System.out.println("zzZZ");
    }
}
