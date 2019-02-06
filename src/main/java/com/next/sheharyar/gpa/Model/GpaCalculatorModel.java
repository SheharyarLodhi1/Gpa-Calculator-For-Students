package com.next.sheharyar.gpa.Model;

/**
 * Created by sheharyar on 2/5/2019.
 */

public class GpaCalculatorModel {
    double creditOne;
    double creditTwo;
    double creditThree;
    double creditFour;
    double gpa;
    String gradesValueOne;
    String gradesValueTwo;
    String gradesValueThree;
    String gradesValueFour;
    double totalPointsOne;
    double totalPointsTwo;
    double totalPointsThree;
    double totalPointsFour;

    public GpaCalculatorModel(double creditOne, double creditTwo, double creditThree, double creditFour, double gpa, String gradesValueOne, String gradesValueTwo, String gradesValueThree, String gradesValueFour, double totalPointsOne, double totalPointsTwo, double totalPointsThree, double totalPointsFour) {
        this.creditOne = creditOne;
        this.creditTwo = creditTwo;
        this.creditThree = creditThree;
        this.creditFour = creditFour;
        this.gpa = gpa;
        this.gradesValueOne = gradesValueOne;
        this.gradesValueTwo = gradesValueTwo;
        this.gradesValueThree = gradesValueThree;
        this.gradesValueFour = gradesValueFour;
        this.totalPointsOne = totalPointsOne;
        this.totalPointsTwo = totalPointsTwo;
        this.totalPointsThree = totalPointsThree;
        this.totalPointsFour = totalPointsFour;
    }

    public double getCreditOne() {
        return creditOne;
    }

    public void setCreditOne(double creditOne) {
        this.creditOne = creditOne;
    }

    public double getCreditTwo() {
        return creditTwo;
    }

    public void setCreditTwo(double creditTwo) {
        this.creditTwo = creditTwo;
    }

    public double getCreditThree() {
        return creditThree;
    }

    public void setCreditThree(double creditThree) {
        this.creditThree = creditThree;
    }

    public double getCreditFour() {
        return creditFour;
    }

    public void setCreditFour(double creditFour) {
        this.creditFour = creditFour;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getGradesValueOne() {
        return gradesValueOne;
    }

    public void setGradesValueOne(String gradesValueOne) {
        this.gradesValueOne = gradesValueOne;
    }

    public String getGradesValueTwo() {
        return gradesValueTwo;
    }

    public void setGradesValueTwo(String gradesValueTwo) {
        this.gradesValueTwo = gradesValueTwo;
    }

    public String getGradesValueThree() {
        return gradesValueThree;
    }

    public void setGradesValueThree(String gradesValueThree) {
        this.gradesValueThree = gradesValueThree;
    }

    public String getGradesValueFour() {
        return gradesValueFour;
    }

    public void setGradesValueFour(String gradesValueFour) {
        this.gradesValueFour = gradesValueFour;
    }

    public double getTotalPointsOne() {
        return totalPointsOne;
    }

    public void setTotalPointsOne(double totalPointsOne) {
        this.totalPointsOne = totalPointsOne;
    }

    public double getTotalPointsTwo() {
        return totalPointsTwo;
    }

    public void setTotalPointsTwo(double totalPointsTwo) {
        this.totalPointsTwo = totalPointsTwo;
    }

    public double getTotalPointsThree() {
        return totalPointsThree;
    }

    public void setTotalPointsThree(double totalPointsThree) {
        this.totalPointsThree = totalPointsThree;
    }

    public double getTotalPointsFour() {
        return totalPointsFour;
    }

    public void setTotalPointsFour(double totalPointsFour) {
        this.totalPointsFour = totalPointsFour;
    }
}
