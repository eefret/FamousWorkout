package com.kaissersoft.FamousWorkout.enums;


/**
 * Created by Christopher Herrera on 2/19/14.
 */
public enum MusclesEnum {
    BICEPS(1),
    TRICEPS(2),
    SHOULDERS(3),
    CHEST(4),
    BACK(5),
    ABS(6),
    FOREARM(7),
    TRAPEZE(8),
    LEGS(9),
    CALVES(10);

    private int index;


    MusclesEnum(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

}
