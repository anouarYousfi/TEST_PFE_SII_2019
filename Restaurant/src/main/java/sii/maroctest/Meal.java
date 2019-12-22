package sii.maroctest;


public class Meal {

    private static final int FIRSTDISH_DURATION = 6;
    private Ticket ticket;
    private int numberOfDishes;
    private int cookingTime;

    public int servedDishes() {

        return numberOfDishes;
    }

    public int cookingDuration() {
        this.setCookingTime();
        return cookingTime;
    }

    public void setCookingTime() {

        if (ticket.checkIfOrderIsPizza()) {
            cookingTime += 20;
        }
        if (numberOfDishes > 1) {
            int additionalDishes = numberOfDishes - 1;
            int durationOfAnadditionalDish = 3;
            cookingTime = FIRSTDISH_DURATION + durationOfAnadditionalDish * additionalDishes;
        } else if (numberOfDishes == 1)
            cookingTime = FIRSTDISH_DURATION;


    }

    public void setNumberOfDishes(int numberOfDishes) {
        this.numberOfDishes = numberOfDishes;
    }

    public void setTicket(Ticket ticket) {
        this.ticket=ticket;
    }
}
