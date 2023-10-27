package racingcar.domain;

import racingcar.service.RacingCarService;

public class RacingCar {
    private final String name;
    private int moveNumber;

    public RacingCar(String name) {
        this.name = name;
        this.moveNumber = 0;
    }

    public void moveCar() {
        if(isMoreThanFour()) {
            moveNumber++;
        }
    }

    private boolean isMoreThanFour() {
        return RacingCarService.getRandomNumber() >= 4;
    }

    public String getName() {
        return name;
    }

    private String getDashString() {
        return "-".repeat(moveNumber);
    }
}