public class MyStringListener implements Observer {
    private String name;

    public MyStringListener(String name, Observable o) {
        this.name = name;
        o.registerObserver(this);
    }

    @Override
    public void update() {
        System.out.println(name + " has been notified about the changes.");
    }
}

interface Observer {
    void update();
}
