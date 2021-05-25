package kg.itAcademy.observer;

public class ObserverMain {
    public static void main(String[] args) {
        CentralComp comp = new CentralComp();
        Dashboard db = new Dashboard(comp);

        comp.changeData(10, 1000, 100);
        comp.changeData(20, 2000, 200);
        comp.changeData(14, 1040, 700);
    }
}
