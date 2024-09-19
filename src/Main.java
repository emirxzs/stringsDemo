//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         //metindeki bazı karakterleri başka karakterlerle değiştirmeyi,belli bir karakterden bir yere kadar kesmeyi ya da sadece baştan kesmeyi,
        //metindeki bazı yerleri çıkarıp dizi şekline çevirmeyi.metni tamamen büyük ya da küçük harfle yazdırmayı ve en son olarak metnin başındaki sonundaki gereksiz boşlukları çıkarma fonksiyonları

        String not="   Sitemize hoş geldiniz";
        System.out.println(not.replace(' ','-'));
         //eğer her yazdırdığımızda yeni versiyondaki gibi çıksın istersek yeni bir değişken tanımlarız
        String yeniNot = not.replace(' ','-');
        System.out.println(yeniNot);

        System.out.println(not.substring(9,21)); //burda da get chars fonksiyonunda olduğu gibi 21 yazınca 21.elemanı saymıyor!

        for(String boşluksuznot:not.split(" ")){
              System.out.println(boşluksuznot);
        }
         System.out.println(not.toLowerCase());
         System.out.println(not.toUpperCase());
         System.out.println(not.trim());
         System.out.println(not.substring(6));
    }
}