package Watcher;

import Watcher.Display.CurrentConditionsDisplay;
import Watcher.Subject.WeatherData;

/*
    Паттерн Наблюдатель определяет отношение
    «один-ко-многим» между объектами таким образом,
    что при изменении состояния одного объекта про-
    исходит автоматическое оповещение и обновле-
    ние всех зависимых объектов.
 */
public class Watcher {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay =
                new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
