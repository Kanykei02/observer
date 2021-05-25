package kg.itAcademy.observer;

public class Dashboard implements Observer{
    private Observable observable;
    private int speed;
    private int rpm;
    private int oilPressure;

    public Dashboard(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(int speed, int rpm, int oilPressure) {
        this.speed = speed;
        this.rpm = rpm;
        this.oilPressure = oilPressure;
        show();
    }

    public void show(){
        System.out.println("Speed = " + speed + ", RPM = " + rpm + ", Oil pressure = " + oilPressure);
    }
}
