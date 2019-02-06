package com.next.sheharyar.gpa;

import com.next.sheharyar.gpa.Interfaces.GpaCalculatorInterface;
import com.next.sheharyar.gpa.Model.GetValuesForGpaFromEdtText;
import com.next.sheharyar.gpa.Model.GpaCalculatorModel;

/**
 * Created by sheharyar on 2/5/2019.
 */

public class GpaSimulator extends GetValuesForGpaFromEdtText implements GpaCalculatorInterface{

    double classOneNum;
    double classTwoNum;
    double classThreeNum;
    double classFourNum;
    String classGrade = "";
    String gradeValue1 = "";
    String gradeValue2 = "";
    String gradeValue3 = "";
    String gradeValue4 = "";
    double TotalGrade = 0;
    double totalGpa;
    double totalPointsForClassOne = 0;
    double totalPointsForClassTwo = 0;
    double totalPointsForClassThree = 0;
    double totalPointsForClassFour = 0;
    double totalPointsOne;
    double totalPointsTwo;
    double totalPointsThree;
    double totalPointsFour;
    double totalCredits = 0;
    double creditClassOne = 0;
    double creditClassTwo = 0;
    double creditClassThree = 0;
    double creditClassFour = 0;
    boolean grades;
    public static double test;
    public static double test2;

    public static double getPointsOne;
    public  static  double getPointsTwo;
    public  static  double setPointsTwo;

    GpaCalculatorModel gpaCalulatorForStudent = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
            gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);

    GpaCalculatorModel gpaCalculatorModel = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
            gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);

    public GpaSimulator(String getValueEditOne, String getValueEditTwo, String getValueEditThree, String getValueEditFour) {
        super(getValueEditOne, getValueEditTwo, getValueEditThree, getValueEditFour);
    }


    @Override
    public double getTotalForClassOne() {
        GpaCalculatorModel gpaCalulatorForStudent = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsClassOne = gpaCalulatorForStudent.getTotalPointsOne();
        getPointsOne = gpaCalulatorForStudent.getTotalPointsOne();
        addAllTotalPoints(getPointsOne);
        addAllTotalCredits(test);
        return (int) totalPointsClassOne;
    }

    @Override
    public double getTotalForClassTwo() {
//        GpaCalculatorModel gpaCalulatorForStudent = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        double totalPointsForClassTwo = gpaCalulatorForStudent.getTotalPointsTwo();
//        return (int) totalPointsTwo;
        double totalPointsClassTwo = gpaCalulatorForStudent.getTotalPointsTwo();
//        settingTotalPoints = totalPointsClassTwo;
        getPointsTwo = setPointsTwo;
        addAllTotalPoints(getPointsTwo);
        addAllTotalCredits(test2);
        return (int) totalPointsClassTwo;
    }

    @Override
    public double getTotalForClassThree() {
//        GpaCalculatorModel gpaCalulatorForStudent = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsClassThree = gpaCalulatorForStudent.getTotalPointsThree();
        double totalCreditsClassThree = gpaCalulatorForStudent.getCreditThree();
        double total = totalPointsClassThree + totalCreditsClassThree;
//        addAllTotalPoints(totalPointsClassOne);
        return (int) total;
    }

    @Override
    public double getTotalForClassFour() {
//        GpaCalculatorModel gpaCalulatorForStudent = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        double totalPointsClassFour = gpaCalulatorForStudent.getTotalPointsFour();
        double totalCreditsClassFour = gpaCalulatorForStudent.getCreditFour();
        double total = totalPointsClassFour + totalCreditsClassFour;
//        addAllTotalPoints(totalPointsClassOne);
        return (int) total;
    }

    @Override
    public void checkClassOneGradesToShowGpa() {

        String classOneNumber = GpaSimulator.super.getGetValueEditOne(); // classOneNum
        String classOneGrade = GpaSimulator.super.getGetValueEditTwo(); // class One Grade

//        GpaCalculatorModel gpaCalculatorModel = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
//                gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        gpaCalculatorModel.setCreditOne(Integer.parseInt((String)classOneNumber));
        gpaCalculatorModel.setGradesValueOne(classOneGrade);



        classGrade = classOneGrade;
        if (classGrade.equals("A")){
            creditClassOne = 4;
        } else if (classGrade.equals("B")){
            creditClassOne = 3;
        } else if (classGrade.equals("C")){
            creditClassOne = 2;
        } else if (classGrade.equals("F")){
            creditClassOne = 0;
        } else if (classGrade.equals("FX")){
            creditClassOne = 0;
        }
        else
            System.out.println("Invalid Grade ..");
        totalPointsForClassOne = creditClassOne * gpaCalculatorModel.getCreditOne();
//        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        totalPointsOne = totalPointsForClassOne;
         test = creditClassOne;
        gpaCalculatorModel.setCreditOne(test);


        gpaCalculatorModel.setTotalPointsOne(totalPointsForClassOne);


    }

    @Override
    public void checkClassTwoGradesToShowGpa() {

        String classTwoNumber = GpaSimulator.super.getGetValueEditThree(); // classOneNum
        String classTwoGrade = GpaSimulator.super.getGetValueEditFour(); // class One Grade

        gpaCalculatorModel.setCreditTwo(Integer.parseInt((String)classTwoNumber));
        gpaCalculatorModel.setGradesValueOne(classTwoGrade);



        classGrade = classTwoGrade;
        if (classGrade.equals("A")){
            creditClassTwo = 4;
        } else if (classGrade.equals("B")){
            creditClassTwo = 3;
        } else if (classGrade.equals("C")){
            creditClassTwo = 2;
        } else if (classGrade.equals("F")){
            creditClassTwo = 0;
        } else if (classGrade.equals("FX")){
            creditClassTwo = 0;
        }
        else
            System.out.println("Invalid Grade ..");
        totalPointsForClassTwo = creditClassTwo * gpaCalculatorModel.getCreditTwo();
//        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
        totalPointsTwo = totalPointsForClassTwo;
        test2 = creditClassTwo;
        gpaCalculatorModel.setCreditTwo(test2);

        setPointsTwo = totalPointsTwo;
        gpaCalculatorModel.setTotalPointsOne(setPointsTwo);
        gpaCalculatorModel.setTotalPointsTwo(totalPointsForClassTwo);
    }

    @Override
    public void checkClassThreeGradesToShowGpa() {

    }

    @Override
    public void checkClassFourGradesToShowGpa() {

    }

//    @Override
//    public void checkClassTwoGradesToShowGpa() {
//
//        String classTwoNumber = GpaSimulator.super.getGetValueEditThree(); // classOneNum
//        String classTwoGrade = GpaSimulator.super.getGetValueEditFour(); // class One Grade
//
//        GpaCalculatorModel gpaCalculatorModel = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
//                gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        gpaCalculatorModel.setCreditTwo(Integer.parseInt((String)classTwoNumber));
//        gpaCalculatorModel.setGradesValueTwo(classTwoGrade);
//
//        classGrade = classTwoGrade;
//        if (classGrade.equals("A")){
//            creditClassTwo = 4;
//        } else if (classGrade.equals("B")){
//            creditClassTwo = 3;
//        } else if (classGrade.equals("C")){
//            creditClassTwo = 2;
//        } else if (classGrade.equals("F")){
//            creditClassTwo = 0;
//        } else if (classGrade.equals("FX")){
//            creditClassTwo = 0;
//        }
//        else
//            System.out.println("Invalid Grade ..");
//        totalPointsForClassTwo = creditClassTwo * gpaCalculatorModel.getCreditTwo();
////        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        totalPointsTwo = totalPointsForClassOne;
//
//        gpaCalculatorModel.setTotalPointsTwo(totalPointsForClassTwo);
//    }
//
//    @Override
//    public void checkClassThreeGradesToShowGpa() {
//
//        String classThreeNumber = GpaSimulator.super.getGetValueEditFive(); // classOneNum
//        String classThreeGrade = GpaSimulator.super.getGetValueEditSix(); // class One Grade
//
//
//
//        GpaCalculatorModel gpaCalculatorModel = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
//                gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        gpaCalculatorModel.setCreditThree(Integer.parseInt((String)classThreeNumber));
//        gpaCalculatorModel.setGradesValueThree(classThreeGrade);
//
//        classGrade = classThreeGrade;
//        if (classGrade.equals("A")){
//            creditClassThree = 4;
//        } else if (classGrade.equals("B")){
//            creditClassThree = 3;
//        } else if (classGrade.equals("C")){
//            creditClassThree = 2;
//        } else if (classGrade.equals("F")){
//            creditClassThree = 0;
//        } else if (classGrade.equals("FX")){
//            creditClassThree = 0;
//        }
//        else
//            System.out.println("Invalid Grade ..");
//        totalPointsForClassThree = creditClassThree * gpaCalculatorModel.getCreditThree();
////        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        totalPointsThree = totalPointsForClassThree;
//
//        gpaCalculatorModel.setTotalPointsThree(totalPointsForClassThree);
//    }
//
//    @Override
//    public void checkClassFourGradesToShowGpa() {
//
//        String classFourNumber = GpaSimulator.super.getGetValueEditSeven(); // classOneNum
//        String classFourGrade = GpaSimulator.super.getGetValueEditEight(); // class One Grade
//
//        GpaCalculatorModel gpaCalculatorModel = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa,
//                gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        gpaCalculatorModel.setCreditFour(Integer.parseInt((String)classFourNumber));
//        gpaCalculatorModel.setGradesValueFour(classFourGrade);
//
//        classGrade = classFourGrade;
//        if (classGrade.equals("A")){
//            creditClassFour = 4;
//        } else if (classGrade.equals("B")){
//            creditClassFour = 3;
//        } else if (classGrade.equals("C")){
//            creditClassFour = 2;
//        } else if (classGrade.equals("F")){
//            creditClassFour = 0;
//        } else if (classGrade.equals("FX")){
//            creditClassFour = 0;
//        }
//        else
//            System.out.println("Invalid Grade ..");
//        totalPointsForClassFour = creditClassFour * gpaCalculatorModel.getCreditFour();
////        GpaCalulatorForStudent gpaCalulatorForStudent = new GpaCalulatorForStudent(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);
//        totalPointsFour = totalPointsForClassFour;
//
//        gpaCalculatorModel.setTotalPointsFour(totalPointsForClassFour);
//    }

    @Override
    public double addAllTotalPoints(double settingTotalPoints) {

        double totalPtsOne = getPointsOne;
        double totalPtsTwo = getPointsTwo;
//        double totalPtsTwo = gpaCalulatorForStudent.getTotalPointsTwo();
//        double totalPtsThree = gpaCalulatorForStudent.getTotalPointsThree();
//        double totalPtsFour = gpaCalulatorForStudent.getTotalPointsFour();

        double subTotal = totalPtsOne + totalPtsTwo;

        return subTotal;
    }

    @Override
    public double addAllTotalCredits(double totalPointsClassOne) {

        String testOne = String.valueOf(test);
        String testTwo = String.valueOf(test2);
        gpaCalulatorForStudent.setCreditOne(Double.parseDouble(testOne));
        gpaCalulatorForStudent.setCreditTwo(Double.parseDouble(testTwo));
        double totalCreditOne = gpaCalulatorForStudent.getCreditOne();
        double totalCreditTwo = gpaCalulatorForStudent.getCreditTwo();
        double totalCreditThree = gpaCalulatorForStudent.getCreditThree();
        double totalCreditFour = gpaCalulatorForStudent.getCreditFour();

        int subTotalCredits = (int) (totalCreditOne + totalCreditTwo + totalCreditThree + totalCreditFour);
        return subTotalCredits;
    }

    @Override
    public void totalGpaResult() {
        GpaCalculatorModel gpa = new GpaCalculatorModel(classOneNum, classTwoNum, classThreeNum, classFourNum, totalGpa, gradeValue1, gradeValue2, gradeValue3, gradeValue4, totalPointsOne, totalPointsTwo, totalPointsThree, totalPointsFour);

    }
}
