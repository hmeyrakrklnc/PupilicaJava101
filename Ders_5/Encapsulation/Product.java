package Encapsulation;

public class Product {
    private double price;  //price: ürünün fiyatı. negatif yada 0 olamaz.

    public void setPrice(double value){  //bu metod geçersiz fiyatlara karşı koruma sağlıyor
        if (value<=0){
            throw new IllegalArgumentException("Ürün fiyatı 0 ya da negatif olamaz!");
        }

        price = value;
    }

    public double getPrice(){
        return price;
    }

    private String name;  //ürünün adı


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //ürün stok:

    private boolean stockExisting;   //stok var mı yok mu bilgisini tutmak için tanımlanmış ama kullanılmıyor.

    private int stockCount;   //stokta kaç ürün olduğu


    public boolean isStockExisting() {  //stok sayısına göre stok durumunu dinamik olarak belirler.
        return stockCount > 0;
    }



    public int getStockCount() {
        return stockCount;
    }

    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
    }
}
