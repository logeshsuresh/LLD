package models;

public class Seat {

    private Character row;
    private Integer column;

    private SeatType seatType;

    Double price;

    public Seat(Character row, Integer column, SeatType seatType, Double price) {
        this.row = row;
        this.column = column;
        this.seatType = seatType;
        this.price = price;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public SeatType getSeatType() {
        return this.seatType;
    }

    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.row + "-" + this.column;
    }

}
