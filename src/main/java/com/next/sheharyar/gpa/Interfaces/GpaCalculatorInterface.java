package com.next.sheharyar.gpa.Interfaces;

/**
 * Created by sheharyar on 2/4/2019.
 */

public interface GpaCalculatorInterface {
    double getTotalForClassOne();
    double getTotalForClassTwo();
    double getTotalForClassThree();
    double getTotalForClassFour();
    void checkClassOneGradesToShowGpa();
    void checkClassTwoGradesToShowGpa();
    void checkClassThreeGradesToShowGpa();
    void checkClassFourGradesToShowGpa();
    double addAllTotalPoints(double settingTotalPoints);
    double addAllTotalCredits(double totalPointsClassOne);
    void totalGpaResult();

}
