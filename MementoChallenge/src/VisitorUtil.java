public class VisitorUtil {
    private String name;
    private int age;

    public VisitorUtil(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    public Memento saveVisitorToMemento() {
        return new Memento(getName(), getAge());
    }

    public void undoLastChange(Memento memento) {
        this.name = memento.getName();
        this.age = memento.getAge();
    }
}
