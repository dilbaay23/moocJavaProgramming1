/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Counter {

    private int value;

    public Counter(int startValue) {
        this.value = startValue;
    }

    public Counter() {
        this(0);
    }

    public int value() {
        return value;
    }

    public void increase() {
        value = value + 1;
    }

    public void decrease() {
        value -= 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value = value + increaseBy;
        }

    }

    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }

    }
}
