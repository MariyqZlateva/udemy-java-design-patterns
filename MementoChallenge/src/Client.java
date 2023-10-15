public class Client {
    public static void main(String[] args) {
        VisitorUtil visitor1 = new VisitorUtil("Sam", 11);
        Caretaker caretaker = new Caretaker();
        caretaker.add(visitor1.saveVisitorToMemento());


        System.out.println("Current Visitor " + visitor1.getName() + " " + visitor1.getAge());

        VisitorUtil visitor2 = new VisitorUtil("Kim", 14);
        caretaker.add(visitor2.saveVisitorToMemento());

        visitor2.undoLastChange((Memento) caretaker.getVisitor(1));
        System.out.println("Current Visitor " + visitor2.getName() + " " + visitor2.getAge());
    }
}
