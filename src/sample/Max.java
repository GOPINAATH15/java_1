package sample;

public class Max {

	public static void main(String[] args) {
		int a=7,b=155,c=30;
		int out;
		if (a > b && a > c)
            out = a;
        else if (b > c && b>a)
            out = b;
        else
            out = c;
        System.out.println("Maximum is : " + out);
	}
}
