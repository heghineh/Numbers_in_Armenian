package com.company;

public class Number {
    //region Properties
    private long number;
    int counter = 0;
    //endregion

    //region Constructors
    public Number() {
    }

    public Number(long number) {
        this.number = number;
    }
    //endregion

    //region Public Methods
    public String hrashq(String str1, String str2, int counter, long number) {
        String gumar = str2 + str1;
        if (str2.equals("տաս") && !str1.equals("")) {
            switch ((int) (number%10)) {
                case 1:
                    gumar = "տասնմեկ";
                    break;
                case 2:
                    gumar = "տասներկու";
                    break;
                case 3:
                    gumar = "տասներեք";
                    break;
                case 4:
                    gumar = "տասնչորս";
                    break;
                case 5:
                    gumar = "տասնհինգ";
                    break;
                case 6:
                    gumar = "տասնվեց";
                    break;
                case 7:
                    gumar = "տասնյոթ";
                    break;
                case 8:
                    gumar = "տասնութ";
                    break;
                case 9:
                    gumar = "տասնինը";
                    break;
            }
        }
        return gumar;
    }

    public int counter(long number) {
        while (number != 0) {
            number = number / 10;
            counter++;
        }
        return counter;
    }

    public long counter1(long number) {
        long miavor = number % 10;
        return miavor;
    }

    public long counter2(long number) {
        long tasnavor = number / 10 % 10 * 10;
        return tasnavor;
    }

    public long counter3(long number) {
        long haryuravor = number / 100 % 10;
        return haryuravor;
    }
    //endregion

    //region Getters and Setters
    public long getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    //endregion
}