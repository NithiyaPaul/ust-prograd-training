public class Probability {
    /*private double probabilityEventOne;
    private double probabilityEventTwo;*/

    public double probabilityCalculation(double possibleEvents, double totalEvents) {
        return possibleEvents / totalEvents;
    }

    public double probabilityOfEvent(double possibleEvents, double totalEvents) {
        return probabilityCalculation(possibleEvents, totalEvents);
    }

    /*public double probabilityOfTwoEventsOccurringTogether(double possibleEventOne, double totalEventOne, double possibleEventTwo, double totalEventTwo) {
        probabilityEventOne = probabilityOfEvent(possibleEventOne, totalEventOne);
        probabilityEventTwo = probabilityOfEvent(possibleEventTwo, totalEventTwo);
        return probabilityEventOne * probabilityEventTwo;
    }*/

   /* public double probabilityOfAnEventNotOccurring(double possibleEvents, double totalEvents) {
        return 1 - probabilityOfEvent(possibleEvents, totalEvents);
    }*/

}

//    As a statistician, I want to be able to know that the probability of a heads in a coin toss is equal to the probability of a tails in a coin toss.(h = 0.5, t = 0.5)
//    As a statistician, I want to be able to know the probability of two events occurring together.
//    As a statistician, I want to be able to know the probability of an event not occurring.
//    As a statistician, I want to be able to know the probability of either two events occurring.
