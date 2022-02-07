package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q14 {  
	/* Günün sorusu: if statement
      katsayıları verilen 2 bilinmeyenli denklemin kökleriniz bulunuz.

        ax^2 + bx + c;
        Çözüm adımları
        kullanıcıdan a,b,c yi okutun.
        Delta = bb - 4ac
        Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
        Delta = 0 => 1 tane kök vardır x = -b/2a
        Delta < 0 ise kök yoktur.
   */
	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double a, b, c, x1, x2, delta;
		System.out.println("ax^2+bx+c seklindeki denklemin istenen degerlerinin asagiya giriniz");
		System.out.println("a : \nb : \nc :");
		a = giris.nextDouble();
		b = giris.nextDouble();
		c = giris.nextDouble();

		delta = b * b - 4 * a * c;

		if (delta < 0) {
			System.out.println("Gercek kok yoktur. \n");
		} else if (delta == 0) {
			x1 = -b / (2 * a);
			System.out.println("x1=x2=" + x1);
		} else {
			x1 = (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);

			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		}

		giris.close();
	}
  
	
	
	
	
	
	
	
	
	
	
	
	
	
}
