package com.company;

class ArithmeticProgression {
    public int zeroPlace, stringDifference;

    ArithmeticProgression(int a0, int r) {
        zeroPlace = a0;
        stringDifference = r;
    }

    public int getTerm(int n) {
        return zeroPlace + n * stringDifference;
    }
}
