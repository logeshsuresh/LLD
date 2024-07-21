package Observables;

import Observers.NotificationAlertObserver;
import Observers.SMSAlertObserver;

import java.util.List;

public class IphoneStockObservableImpl implements StockObervable {

    private int stockCount = 0;

    private final List<NotificationAlertObserver> observerList;

    public IphoneStockObservableImpl(List<NotificationAlertObserver> observerList) { this.observerList = observerList; }

    public IphoneStockObservableImpl(List<NotificationAlertObserver> observerList, int stockCount) {
        this.observerList = observerList;
        this.stockCount = stockCount;
    }

    @Override
    public void add(NotificationAlertObserver observer) { this.observerList.add(observer); }

    @Override
    public void remove(NotificationAlertObserver observer) { this.observerList.remove(observer); }

    @Override
    public void notifySubscriber() {
        observerList.forEach(NotificationAlertObserver::update);
    }

    @Override
    public void setStockCount(int count) {
        if (stockCount == 0) {
            this.notifySubscriber();
        }
        this.stockCount += count;
    }

    @Override
    public int getStockCount() { return this.stockCount; }

}
