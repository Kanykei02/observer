package kg.itAcademy.observer;

import java.util.ArrayList;
import java.util.List;

public class CentralComp implements Observable{
    private List observers;
    private int speed;
    private int rpm;
    private int oilPressure;

    public void changeData(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        notifyObserver();
    }

    public CentralComp(){
        observers = new ArrayList();
    }

    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        int i = observers.indexOf(obs);
        if(i >= 0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(speed, rpm, oilPressure);
        }
    }
}
