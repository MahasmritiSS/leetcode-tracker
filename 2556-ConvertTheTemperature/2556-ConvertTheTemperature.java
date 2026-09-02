// Last updated: 9/2/2026, 12:40:24 PM
class Solution {
    public double[] convertTemperature(double celsius) {
        double[] r = new double[2];
        r[0] = celsius + 273.15;
        r[1] = celsius * 1.80 + 32.00;
        return r;
    }
}