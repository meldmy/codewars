package com.meldmy;

/**
 * @author Dmytro Melnychuk
 */
public class Xbonacci {
    public double[] tribonacci(double[] s, int n) {
        if (s.length == 0 || n == 0) return new double[0];
        double[] res = new double[n];
        for (int i = 0; i < n; i++) {
            res[i] = i < 3 ? s[i] : res[i - 3] + res[i - 2] + res[i - 1];
        }
        return res;
    }
}
