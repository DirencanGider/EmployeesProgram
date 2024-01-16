import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Çalışanlar Programına Hoşgeldiniz...");

        String islemler = "İşlemler...\n"
                            + "1. Yazılımcı İşlemleri\n"
                            + "2. Yönetici İşlemleri\n"
                            + "Programdan Çıkmak İçin q Harfine Basınız";
        System.out.println("******************************************");
        System.out.println(islemler);
        System.out.println("******************************************");

        while (true) {
            System.out.print("İşlemi Seçiniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Direncan", "Gider", 123456, "Java");
                String yazilimci_islemleri = "Yazılımcı İşlemleri\n"
                                            +"1. Format At\n"
                                            +"2. Bilgileri Göster \n"
                                            +"Çıkmak için q'ya basınız...";

                System.out.println("*****************");
                System.out.println(yazilimci_islemleri);
                System.out.println("*****************");

                while (true) {

                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();


                    if (y_islem.equals("q")) {
                        System.out.println("Yazılımcı İşlemlerinden çıkılıyor...");
                        break;

                    }
                    else if (y_islem.equals("1")) {
                        System.out.print("İşlemtim Sistemi : ");
                        String isletim_sistemi = scanner.nextLine();
                        yazilimci.formatAt(isletim_sistemi);

                    }
                    else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();

                    }
                    else {
                        System.out.println("Geçersiz Yazılımcı İşlemi...");
                    }

                }


            }
            else if(islem.equals("2")) {
                Yonetici yonetici = new Yonetici("Metin", "Sezer", 13579, 20);

                String yonetici_islemleri = "Yönetici İşlemleri\n"
                                            +"1. Zam Yap\n"
                                            +"2. Bilgileri Göster\n"
                                            +"Çıkmak için q'ya basınız...";

                System.out.println("*****************");
                System.out.println(yonetici_islemleri);
                System.out.println("*****************");

                while (true) {

                    System.out.print("İşlemi Seçiniz : ");
                    String y_islem = scanner.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Yönetici İşlemlerinden çıkılıyor...");
                        break;

                    }
                    else if (y_islem.equals("1")) {
                        System.out.println("Yöneticinin ne kadar zam yapmasını istiyorsunuz? : ");
                        int zamMiktari = scanner.nextInt();
                        scanner.nextLine();

                        yonetici.zamYap(zamMiktari);

                    }
                    else if (y_islem.equals("2")) {
                        yonetici.bilgileriGoster();

                    }
                    else {
                        System.out.println("Geçersiz Yönetici İşlemi...");

                    }

                }

            }
            else {
            System.out.println("Geçersiz İşlem...");

            }

        }

    }

}