import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<Memento> mementoVisitors = new ArrayList<>();

    public void add(Memento visitor) {
        mementoVisitors.add(visitor);
    }

    public Object getVisitor(int index) {
        return mementoVisitors.get(index);
    }
}

