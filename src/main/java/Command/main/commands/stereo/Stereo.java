package Command.main.commands.stereo;

public class Stereo {
    private boolean stereo;

    public Stereo() {};

    public void stereoOn() {
        this.stereo = true;
        System.out.println("Stereo ON");
    }

    public void stereoOff() {
        this.stereo = false;
        System.out.println("Stereo OFF");
    }
}
