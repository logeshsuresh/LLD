import Observables.IphoneStockObservableImpl;
import Observables.StockObervable;
import Observers.EmailAlertObserver;
import Observers.NotificationAlertObserver;
import Observers.SMSAlertObserver;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws InterruptedException {

        try {
            List<NotificationAlertObserver> observerList = new ArrayList<>();
            StockObervable iphoneObservable = new IphoneStockObservableImpl(observerList);
            NotificationAlertObserver emailAlert = new EmailAlertObserver(iphoneObservable);
            NotificationAlertObserver smsAlert = new SMSAlertObserver(iphoneObservable);
            iphoneObservable.setStockCount(10);
            Thread.sleep(1000);
            iphoneObservable.setStockCount(-10);
            Thread.sleep(1000);
            iphoneObservable.setStockCount(20);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}