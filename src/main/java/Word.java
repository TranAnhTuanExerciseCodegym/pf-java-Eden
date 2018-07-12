public class Word {
    public static void main(String[] args) {
        Human Adam = new Human();
        Human Eva = new Human();

        God.say("Không được ăn táo nếu không sẽ chết");
        Snake.say("Ăn táo đi ngon lắm không chết đâu");

        Apple apple = new Apple();
        apple.weight = 2;

        while (!apple.isEmpty()) {
            System.out.println("Eva ăn một miếng táo");
            Eva.eat(apple);
            System.out.println("Adam ăn một miếng táo");
            Adam.eat(apple);
        }
        Adam.sleep();
        Eva.sleep();
        God.say("Eva! Bà sẽ phải vâng lời chồng");
        God.say("Adam ngươi phải cày cuốc mà ăn");

        God.say("The end!");

    }
}
