package by.training.model;

import by.training.exception.RandMaxNotFound;
import by.training.util.Constants;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Model {
    private Integer guessNumber;
    private Integer minValue;
    private Integer maxValue;
    private Optional<Integer> randMax = Optional.empty();
    private List<Integer> userAttempts = new ArrayList<>();

    public Model() {
    }

    public void generateGuessNumber(Integer min, Integer max) {
        guessNumber = (int) (min + Math.random()*(max - min));
        minValue = min;
        maxValue = max;
    }

    public void generateGuessNumber() throws Exception {
        guessNumber = (int) (Math.random()*randMax.orElseThrow(
                () -> new RandMaxNotFound(Constants.RAND_MAX_NOT_FOUND_EXCEPTION)
        ));
        minValue = Constants.ZERO;
        maxValue = randMax.get();
    }

    public int checkNumber(Integer userNumber) {
        return userNumber.compareTo(guessNumber);
    }

    public void addValueToUserAttempts(int value) {
        userAttempts.add(value);
    }

    public String getBorders() {
        return "[ " + minValue.toString() + ", " + maxValue.toString() + "]";
    }

    public Integer getGuessNumber() {
        return guessNumber;
    }

    public void setGuessNumber(Integer guessNumber) {
        this.guessNumber = guessNumber;
    }

    public Optional<Integer> getRandMax() {
        return randMax;
    }

    public void setRandMax(Optional<Integer> randMax) {
        this.randMax = randMax;
    }

    public void setRandMax(Integer randMax) {
        this.randMax = Optional.ofNullable(randMax);
    }

    public List<Integer> getUserAttempts() {
        return userAttempts;
    }

    public void setUserAttempts(List<Integer> userAttempts) {
        this.userAttempts = userAttempts;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public void setMinValue(Integer minValue) {
        this.minValue = minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Integer maxValue) {
        this.maxValue = maxValue;
    }
}
