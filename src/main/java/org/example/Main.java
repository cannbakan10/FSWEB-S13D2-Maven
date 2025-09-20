package org.example;

public class Main {

    public static boolean isPalindrome(int sayi) {
        sayi = Math.abs(sayi); // negatifse pozitife çevir

        int orijinal = sayi;
        int tersi = 0;

        while (sayi > 0) {
            int sonBasamak = sayi % 10;
            tersi = (tersi * 10) + sonBasamak;
            sayi = sayi / 10;
        }

        return orijinal == tersi;
    }

    public static boolean isPerfectNumber(int sayi){
        if(sayi < 0 ){
            return false;
        }

        int toplam=0;
        for(int i=1; i<sayi; i++){
            if(sayi % i == 0){
                toplam += i;
            }
        }
        return toplam == sayi;
    }


    public static String numberToWords(int sayi) {
        if (sayi < 0) {
            return "Invalid Value";
        }
        String numStr = String.valueOf(sayi); //sayıyı stringe çevirir, "1", "2", "3" gibi
        StringBuilder result = new StringBuilder(); //özel bir class

        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);

            switch (ch) {
                case '0':
                    result.append("Zero");
                    break;
                case '1':
                    result.append("One");
                    break;
                case '2':
                    result.append("Two");
                    break;
                case '3':
                    result.append("Three");
                    break;
                case '4':
                    result.append("Four");
                    break;
                case '5':
                    result.append("Five");
                    break;
                case '6':
                    result.append("Six");
                    break;
                case '7':
                    result.append("Seven");
                    break;
                case '8':
                    result.append("Eight");
                    break;
                case '9':
                    result.append("Nine");
                    break;
            }
            if (i < numStr.length() - 1) {
                result.append(" ");
            }
        }
            return result.toString();

    }
    public static void main(String[] args) {
        System.out.println("POLİNOM SAYİLAR");
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("----------------------------------");
        System.out.println("MÜKEMMEL SAYİLAR");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("----------------------------------");
        System.out.println("SAYİLARİN KELİMELERE ÇEVİRME  ");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(-12));
    }
}






/*
* Palindrom Sayıyı Bulma
Palindrom sayılar, kendisi ve tersen okunusu birbirine aynı olan sayılar demektir.
121 sayısının tersten okunusu da 121 olduğu için sayı plaindrom dur. Ya da 1001 sayısı da örnek verilebilir.
isPalindrome isimli bir metod yazınız. int bir parametre almalı.
Metodun dönüş değeri boolean olmalı.
Negatif bir değer verdiğinde işareti yok saymalı.
isPalindrome(-1221); => true dönmeli

isPalindrome(707); => true dönmeli

isPalindrome(11212); => false dönmeli
*
*
Mükemmel Sayıları Bulma
Mükemmel Sayı, kendisi hariç tüm bölenlerinin toplamı kendisine eşit olan sayıya denir.
Örneğin 6; 1, 2, 3 e bölünebilir. Bu değerlerin toplamı aynı zamanda 6 ya eşittir.
isPerfectNumber isimli tek parametre alan bir metod yazmak istiyoruz.
Parametresi 0'dan küçükse metod false döner.
isPerfectNumber(6); => true dönmeli (1+2+3=6)

isPerfectNumber(28); => true dönmeli (1+2+4+7+14=28)
isPerfectNumber(5); => false dönmeli (kendisi dışındaki tek böleni 1)
isPerfectNumber(-1); => false dönmeli(parametre 0'dan küçük olamaz)
*
*
* Sayıları Kelimelere Dök
numberToWords isimli bir metod yazmalıyız ve içerisine bir tane int parametre almalı.
metodumuz sayının numaralarına bakmalı ve string olarak her bir rakama karşılık gelen değerlerini yazdırmalı.
Sayının değeri 0'dan küçükse "Invalid Value" değeri dönmeli.
numberToWords(123); => "One Two Three" dönmeli.

numberToWords(1010); => "One Zero One Zero" dönmeli.
* */