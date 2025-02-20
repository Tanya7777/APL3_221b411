public class LakeDuck extends Duck {
    public LakeDuck() {
        super(new CanFly(), new Quack(), new Swim());
    }

    public void display() {
        System.out.println("I'm a Lake Duck.");
    }
}
