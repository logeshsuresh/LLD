package Observers;

import Observables.StockObervable;

public class EmailAlertObserver implements  NotificationAlertObserver {

    StockObervable observable;

    public EmailAlertObserver(StockObervable observable) {
        this.observable = observable;
        observable.add(this);
    }

    @Override
    public void update() { System.out.println("Email notification -- Iphone currently in stock!!!"); }

}
