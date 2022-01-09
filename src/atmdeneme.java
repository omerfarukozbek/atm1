import java.util.Scanner;

public class atmdeneme {
    public static void main(String[] args) {
        String ad,parola;
        int hak=3,secim;
        int bakiye=1500;
        Scanner input=new Scanner(System.in);
        while (hak > 0) {
            System.out.print("Adınızı Giriniz:");
            ad=input.nextLine();
            System.out.print("parola Giriniz:");
            parola =input.nextLine();

            if (ad.equals("ömer") && parola.equals("1234")) {
                System.out.println("sisteme giriş yaptınız");
                do {


                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.println("lüften yapmak istediğiniz işlemi seçiniz");
                    secim = input.nextInt();
                    switch (secim) {
                        case (1):
                            System.out.print("Yatırmak istediğiniz tutarı giriniz:");
                            int tutar = input.nextInt();
                            bakiye += tutar;
                            break;
                        case (2):
                            System.out.print("çekmek istediginiz tutarı giriniz:");
                            int cekme = input.nextInt();
                            if (bakiye>= cekme){
                                bakiye -= cekme;

                            }else {
                                System.out.println("yetersiz bakiye");
                                break;
                            }
                        case (3):
                            System.out.println("bakiyeniz :"+bakiye);
                            break;

                    }
                }
                while (secim != 4);
                System.out.println("tekrar bekleriz");

            }
            else {
                System.out.println("hatalı giriş yaptınız");
                hak--;
                System.out.println("kalan hakkınız:" + hak);
            }
        }


    }


}