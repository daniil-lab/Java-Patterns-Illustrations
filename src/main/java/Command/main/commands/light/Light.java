package Command.main.commands.light;

public class Light {
    private boolean light;

    public Light() {};

    public void lightOn() {
        System.out.println("Light on");
        this.light = true;
    }

    public void lightOff() {
        System.out.println("Light off");
        this.light = false;
    }

    public boolean isLight() {
        return light;
    }

    public void switchLight() {
        this.light = !this.light;

        if (this.light) {
            System.out.println("Light on");
        } else {
            System.out.println("Light off");
        }
    }
}
