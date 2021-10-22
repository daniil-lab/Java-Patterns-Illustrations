package Watcher.Display;

import Watcher.Observer.Observer;
import Watcher.Subject.Subject;

public class CurrentConditionsDisplay implements Display, Observer {
    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " +
                "%d degrees and ".formatted((int) temperature)
                + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        this.display();
    }
}
