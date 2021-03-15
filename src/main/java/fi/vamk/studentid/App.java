package fi.vamk.studentid;
import org.jetbrains.annotations.Nullable;
import java.text.DecimalFormat;
/**
 * Hello world!
 *
 */
public class App{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
	public static int add(int a, int b){
		return a +b;
	}
	public static String divide(double a, double b){
        DecimalFormat df2 = new DecimalFormat("#.##");

        if(b == 0){
            return "NaN";
        }

        double result = a / b;

        return df2.format(result);
    }
	public static Double divideDouble(Double a, Double b){
        Double zero = new Double(0);
        if (a == null || b == null || b == zero.doubleValue()) {
            return null;
        }

        return Math.round((a / b)*100.0)/100.0;
    }

    public static String twoLetter(String string){
        if(string == null){
            return null;
        }
        if(string.length() > 2){
            return string.substring(0,2);
        }
        else {
            return string;
        }

    }
}
