import java.util.ArrayList;

public class MyStringBuilder implements Observable {
    private StringBuilder stringBuilder = new StringBuilder();
    private ArrayList<Observer> listeners = new ArrayList<>();

    public MyStringBuilder() {
    }

    @Override
    public void registerObserver(Observer o) {
        listeners.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        listeners.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : listeners)
            o.update();
    }

    public int compareTo(MyStringBuilder another) {
        return stringBuilder.compareTo(another.stringBuilder);
    }

    public StringBuilder append(Object obj) {
        stringBuilder.append(String.valueOf(obj));
        notifyObservers();
        return stringBuilder;
    }

    public StringBuilder delete(int start, int end) {
        stringBuilder.delete(start, end);
        notifyObservers();
        return stringBuilder;
    }

    public StringBuilder deleteCharAt(int index) {
        stringBuilder.deleteCharAt(index);
        notifyObservers();
        return stringBuilder;
    }

    public StringBuilder replace(int start, int end, String str) {
        stringBuilder.replace(start, end, str);
        notifyObservers();
        return stringBuilder;
    }

    public StringBuilder insert(int offset, Object obj) {
        stringBuilder.insert(offset, obj);
        notifyObservers();
        return stringBuilder;
    }

    public int indexOf(String str) {
        return stringBuilder.indexOf(str);
    }

    public int indexOf(String str, int fromIndex) {
        return stringBuilder.indexOf(str, fromIndex);
    }

    public int lastIndexOf(String str) {
        return stringBuilder.lastIndexOf(str);
    }

    public int lastIndexOf(String str, int fromIndex) {
        return stringBuilder.lastIndexOf(str, fromIndex);
    }

    public StringBuilder reverse() {
        stringBuilder.reverse();
        notifyObservers();
        return stringBuilder;
    }

    public String toString() {
        return new String(stringBuilder);
    }
}

interface Observable {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}


