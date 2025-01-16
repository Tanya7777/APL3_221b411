/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main {
    private String name;
    private int age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getNameAndAge() {
        return "Name: " + name + ", Age: " + age;
    }

    public static void LE0(String[] args) {
        Main getset = new Main();
        getset.setName("Tejashwani Dixit");
        getset.setAge(20);
        System.out.println(getset.getNameAndAge());

        
    }
}
