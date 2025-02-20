/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Test {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performSound();
        rubberDuck.performSwim();

        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performSound();
        woodenDuck.performSwim();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performSound();
        redHeadDuck.performSwim();

        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performSound();
        lakeDuck.performSwim();
    }
}
