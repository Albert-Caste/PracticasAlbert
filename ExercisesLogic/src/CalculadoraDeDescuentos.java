public class CalculadoraDeDescuentos {
    public static final int EDADLIMITE = 60;
    public static final int DESCUENTOMAYOR = 15;
    public static final int DESCUENTOMENOR = 5;

    public static void main(String[] args) {

        double price = Reuse.enterDouble("Ingrese el precio del producto");
        int age = Reuse.enterInt("Ingrese la edad del cliente");
        double saleOff = calculateSaleOff(price,age);
        double finalPrice = calculateFinalPrice(saleOff,price);

        System.out.println("Precio del producto : "+ price +"\n" +
                "% descuento : " + validateSaleOff(age)+"%\n" +
                "Descuento : " + saleOff +"\n" +
                "Precio Final : " + finalPrice);


    }

    public static double calculateSaleOff(double price, int age){
        double saleOff = price*validateSaleOff(age)/100;
        return saleOff;
    }

    public static double calculateFinalPrice(double priceSaleOff, double price){
        double finalPrice=price-priceSaleOff;
        return finalPrice;
    }

    public static int validateSaleOff(int age){
        int saleOff = 0;
        if (age>=EDADLIMITE){
            saleOff = DESCUENTOMAYOR;
        }else {
            saleOff = DESCUENTOMENOR;
        }
        return saleOff;

    }






}
