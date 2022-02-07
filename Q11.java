package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.
    	TRICK: her else komutundan sonra return; komutu kullanınız...

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
    	Scanner scan = new Scanner(System.in);
		System.out.println(" Lutfen ucgenin kenarlarini uzunluklarını sirayla  giriniz.\nK1 : ");
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

    	
    	
    	
    	
  
