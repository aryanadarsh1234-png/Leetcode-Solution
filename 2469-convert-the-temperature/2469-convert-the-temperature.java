class Solution {
    public double[] convertTemperature(double celsius) {

        double[] ans = new double[2];

        double kel = celsius + 273.15;
        double fah = celsius * 1.80 + 32.00;

        ans[0] = kel;
        ans[1] = fah;
        return ans;
        
    }
}