import java.util.Observable;
import java.util.Observer;

/**
 * Created by andrey on 08.08.17.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private Observable observable;

    public CurrentConditionsDisplay(Observable weatherData){
        this.observable = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object arg) {
        if(observable instanceof WeatherData) {
            this.temperature = ((WeatherData) observable).getTemperature();
            this.humidity = ((WeatherData) observable).getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature +"F degrees and " + humidity
        +"% humidity");
    }
}
