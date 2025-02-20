public class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new CannotFly(), new Mute(), new Swim());
    }

    public void display() {
        System.out.println("I'm a Wooden Duck.");
    }
}
