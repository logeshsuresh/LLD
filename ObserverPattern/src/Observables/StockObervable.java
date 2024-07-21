package Observables;

import Observers.NotificationAlertObserver;
import Observers.SMSAlertObserver;

public interface StockObervable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscriber();

    public void setStockCount(int count);

    public int getStockCount();

}
