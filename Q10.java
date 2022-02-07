package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
          Problem tanimi : Kulanıcıdan aracının hızını alınız    Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:            Ceza 500 $'dır.

            ve ayrıca,            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.
-----------------------------------------
            Örn;
            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */
       
    	Scanner scan = new Scanner(System.in);
		System.out.println(" Hizini Giriniz\nEhliyet Varsa" + "E Yoksa H ye Basiniz");
		
		int hiz=scan.nextInt();
		char ehliyet=scan.next().toUpperCase().charAt(0);
			
			if (ehliyet == 'E' && hiz <= 45) {// ehliyeti var ise
				System.out.println(" Iyi Yolculuklar ");						
			} else if ((ehliyet == 'E') & (hiz>=55) && (hiz<74)  ) {
				System.out.println(" Ceza 100 $'dir, hayırlı olsun ucuz yirttin ");	
			} else if ((ehliyet == 'E') & (hiz>=75) && (hiz<84)  ) {
				System.out.println(" Ceza 150 $'dir. ");	
			} else if ((ehliyet == 'E') & (hiz>=85) && (hiz<94)  ) {
				System.out.println(" Ceza 320 $'dir.");	
			} else if ((ehliyet == 'E') & (hiz>94)) {
				System.out.println(" Ceza 500 $'dir.");	
			} else if	((ehliyet == 'H') && (hiz <= 45)) {// ehliyeti yok ise
			System.out.println(" Iyi Yolculuklar, Haluk Hoca sana kiyak gecmis, git bakalım bu seferlik ");						
			}  if ((ehliyet == 'H') & (hiz>=55) && (hiz<74)  ) {
				System.out.println(" Ceza 300 $'dir, hayırlı olsun ucuz yirttin ");	
			} else if ((ehliyet == 'H') & (hiz>=75) && (hiz<84)  ) {
				System.out.println(" Ceza 350 $'dir. ");	
			} else if ((ehliyet == 'H') & (hiz>=85) && (hiz<94)  ) {
				System.out.println(" Ceza 520 $'dir.");	
			} else  if ((ehliyet == 'H') && (hiz>94)) {
				System.out.println(" Ceza 700 $'dir. Uzulme dostum beterin beteri var. ");	
			}	
			scan.close();
    }
}

