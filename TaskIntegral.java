import java.util.*;

public class TaskIntegral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("--Use comma instead of dot when will input double type--");
        System.out.println("Enter a: ");
        double a = sc.nextDouble(); // граница левая
        System.out.println("Enter b: ");
        double b = sc.nextDouble(); // граница правая
        System.out.println("Enter count of line segments: ");
        int n = sc.nextInt(); // ввод количества отрезков пользователем
        String sssss = "sss";
        

        double dx = (b-a)/n; // длина отрезка
        System.out.println("dx = " + dx);
        double x = a;
        double s1 = 0.0, s2 = 0.0;
        
        while (x<b){
            s1 += rectangle(function(x), dx);
            x+= dx;
        }
        System.out.println("rectangle = " + s1);
        x = a;
        while (x<b){
            s2 += trapezoid(function(x), function(x+dx), dx);
            x +=dx;
        }
        System.out.println("trapezoid = " + s2);
        System.out.println("simpson = " + simpson(a, b));

    }
    // функция
    public static double function(double one){
        double y = (one-4)*(one-4);
        return y;
    }
    // площадь прямоугольника
    // one это функция от х, two это dx
    public static double rectangle(double f, double dx){
           double t = f * dx;
           return t;
    }
    // площадь трапеции
    // значение f1 - функции в точке x, f2 - значение функции в точке (x+dx), dx
    public static double trapezoid(double f1, double f2, double dx){
        double t = ((f1 + f2)/2)*dx;
        return t;
    }
    // формула симсона
    public static double simpson(double a, double b){
        double t = (b-a)/6*(function(a)+4*function((a+b)/2)+function(b));
        return t;
    }
}



