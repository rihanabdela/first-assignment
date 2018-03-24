/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculation;

/**
 *
 * @author user
 */
public class calScientific {
    public static final double E = 2.7182818284590452354;
    public static final double PI = 3.14159265358979323846;
    
    public static double add(double   a, double  b)
    {
        double  c=a+b;
        return c;
    } 
    public static double subb(double  g , double  f)
    {
        double  c =g-f; 
        return c;
    }
    public static double multiply( double  h , double i)
    {
        double c = h * i ;
        return c;
    }
    public static double divide(double a , double b)
    {
    double c=a/b;
    return c;
    }
    public static double sin(double x )
    {
        double d=Math.toRadians(x);
        double c=Math.sin(d);
                return c;
    }
    public static double cos(double a)
    {
        double d= Math.toRadians(a);
        double c=Math.cos(d);
        return c;
    }
    public static double tan(double a){
        double d=Math.toRadians(a);
        double c=Math.tan(d);
        return c;
    }
    public static double asin(double a){
        double d=Math.toRadians(a);
        double c=Math.asin(d);
        return c;
}
    public static double acos(double a){
        double d=Math.toRadians(a);
        double c=Math.acos(d);
        return c;
}
    public static double atan(double a){
        double d=Math.toRadians(a);
        double c=Math.atan(d);
        return c;
}
    public static double log10(double a){
        double c=Math.log10(a);
        return c;
}
    public static double logE(double a){
        double c=Math.log(a);
        return c;
}
    public static double pow10(double a){
        double c=Math.pow(10,a);
        return c;
}
    public static double powE(double a){
        double c=Math.pow(E,a);
        return c;
}
    public static double xPowY(double x,double y){
        double c=Math.pow(x,y);
        return c;
}
    public static double xSquare(double x){
        double c=Math.pow(x,2);
        return c;
}
    public static double xSqrt(double x){
        double c=Math.sqrt(x);
        return c;
}

    }
