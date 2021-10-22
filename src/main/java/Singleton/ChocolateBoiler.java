package Singleton;

public class ChocolateBoiler {
    private boolean empty;

    private boolean boiled;

    public ChocolateBoiler() {
        this.empty = true;
        this.boiled = false;
    }

    public void fill() {
        if(!this.isEmpty()) {
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if(!this.isEmpty() && this.isBoiled())
            this.empty = true;
    }

    public void boil() {
        if(!this.isBoiled() && !this.isEmpty())
            this.boiled = true;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
