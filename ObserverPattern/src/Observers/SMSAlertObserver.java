package Observers;

import Observables.StockObervable;

public class SMSAlertObserver implements NotificationAlertObserver {

    StockObervable observable;

    public SMSAlertObserver(StockObervable observable) {
        this.observable = observable;
        observable.add(this);
    }

    @Override
    public void update() { System.out.println("SMS notification -- Iphone currently in stock!!!"); }

}
