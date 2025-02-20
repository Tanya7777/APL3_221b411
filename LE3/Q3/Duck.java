 public abstract class Duck {
    FlyBehavior flyBehavior;
    SoundBehavior soundBehavior;
    SwimBehavior swimBehavior;

    public Duck(FlyBehavior flyBehavior, SoundBehavior soundBehavior, SwimBehavior swimBehavior) {
        this.flyBehavior = flyBehavior;
        this.soundBehavior = soundBehavior;
        this.swimBehavior = swimBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performSound() {
        soundBehavior.makeSound();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public abstract void display();
}

