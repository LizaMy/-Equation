package Equation;

public class Equation {
    private double coefficient [] = new double[3];

    public Equation(double a, double b, double c){
        setСoefficient(new double[]{a,b,c});
    }
    public void setСoefficient(double[] coefficient) throws IllegalArgumentException {
        if (coefficient[0] == 0) throw new IllegalArgumentException("Первый коэффициент не может быть равен нулю");
        this.coefficient[0] = coefficient[0];
        this.coefficient[1] = coefficient[1];
        this.coefficient[2] = coefficient[2];
    }

    public double[] QuadraticEquation(){
        double[] res;
        double D = coefficient[1] * coefficient[1] - 4 * coefficient[0] * coefficient[2];
        if (D > 0){
            res = new double[2];
            res[0]= (- coefficient[1] + Math.sqrt(D)) / (2 * coefficient[0]);
            res[1]= (- coefficient[1] - Math.sqrt(D)) / (2 * coefficient[0]);
        } else {
            if (D == 0){
                res = new double[1];
                res[0] = ( - coefficient[1]) / ( 2 * coefficient[0]);
            } else {
                res = new double[0];
            }
        }
        return res;
    }
}
