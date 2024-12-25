import java.util.List;
public interface Subject{
public void notify();
public void addobserver(Observer observer);
public void removeobserver(Observer observer);
}
public interface Observer{
public void update(float temp, float humidity, float pressure);
}
public class WeatherStation implements Subject{
  private List<Observer> observers;
  private float temp;
  private float humidity;
  private float pressure;

  public WeatherStation(){
    this.observers = new ArrayList<>();
  }
  public void addobserver(Observer Observer){
    observers.add(observer);
  }
  public void removeobserver{
    observers.remove(Observer);
  }
  public void notify(){
    for(Observer observer: observers){
      observer.update(temp,humidity,pressure);
    }
  }
  public void setdata(float temo, float humidity, float pressure){
    this.temp = temp;
    this.humidity = humidity;
    this.pressure = pressure;
    changed();
  }
  public void changed(){
    notify();
  }
}

public class Statsdisp  implements Observer{
public void update(float temp, float humidity, float pressure){
    display();
  }
public void display(){}
}
public class predict implements Observer{
public void update(float temp, float humidity, float pressure){
    display();
  }
public void display(){}}

public class humidity implements Observer{
public void update(float temp, float humidity, float pressure){
    display();
  }
public void display(){}

}
