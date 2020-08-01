/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Timer {

    private ClockHand seconds;
    private ClockHand hundredths;

    public Timer() {
        this.hundredths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public String toString() {
        return seconds + ":" + hundredths ;
    }

    public void advance() {
        this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();

        }
    }
}