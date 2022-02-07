package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan üç adet sayı alarak bu sayıların
        bir dik üçgenin kenar uzunlukları olup olmadığını hesaplatan bir kod yazınız
        (Yardım: Bir üçgenin dik olduğunu anlamak için a2+b2=c2 pisagor
        bağlantısından yararlanabilirsiniz)

        Örnek Ekran Çıktısı
        birinci kenarı giriniz: 2
        ikinci kenarı giriniz 15
        üçüncü kenarı giriniz: 7
        Bu bir dik üçgen değildir.

        Bu bir dik üçgendir
     */

    	Scanner scan = new Scanner(System.in);
		System.out.println(" Lutfen ucgenin kenarlarini sirayla  giriniz.\nK1 : ");
		double k1=scan.nextDouble();
		System.out.println("k2 : ");
		double k2=scan.nextDouble();
		System.out.println("k3 : ");
		double k3=scan.nextDouble();
		double temp=0;
		
		if ((((k1 + k2 > k3 && k3 > k1 - k2) && ((k1 + k3 > k2) && k2 > k1 - k3) && ((k2 + k3 > k1) && k3 > k2 - k3))
			&& k1 > 0 && k2 > 0 && k3 > 0)) {
			if (k1!=k2||k1!=k3||k2!=k3) {
				
				if (k1>k2&&k1>k3) {
					temp=k1;
					k1=k3;
					k3=temp;
					if (((k1*k1)+(k2*k2))==(k3*k3)) {
						System.out.println("Kenarlari girilen ucgen dik ucgendir");
					}  else {
						System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
					}
				} else if (k2>k1&&k2>k3) {
					temp=k2;
					k2=k3;
					k3=temp;
					if (((k1*k1)+(k2*k2))==(k3*k3)) {
						System.out.println("Kenarlari girilen ucgen dik ucgendir");
					}else {
						System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
					}
				}else if (k3>k1&&k3>k2) {
					
					if (((k1*k1)+(k2*k2))==(k3*k3)) {
						System.out.println("Kenarlari girilen ucgen dik ucgendir");
					} else {
						System.out.println("Ucgen olusabilir ama  dik ucgen olamaz");
					}
				} 
				
			} else {
				System.out.println("Ucgen olusabilir ama  dik ucgen olamaz. ");
			}
			
		} else {
			System.out.println("Girilen degerler  ile ucgen olusturulamaz.");
		}
	scan.close()	;



    }
}
