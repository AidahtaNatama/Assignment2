
public class Clothing extends Item implements Discount,Tax{
private String brand;
private double price;
private double units;
private double discount;
private double savings;
final double taxp=8.5;
private double taxprice;
    public Clothing(String itemCode, String Name,double units,double price,String brand,double discount) {
        super(itemCode, Name);
        this.brand=brand;
        this.price=price;
        this.units=units;
        this.discount=discount;
       
    }

   @Override
    public double computeDiscount() {
          savings=(discount/100)*price;
   return savings;
    }

    @Override
    public double computeTax() {
         taxprice=(taxp/100)*price;
   return taxprice;
    }
    public double computeTotalPrice() {
        price=price+computeTax();
        price=price-computeDiscount();
        return price;
    }
    public void displayClothing(){
        System.out.println("item code is:"+"\t"+getItemCode());
        System.out.println("Name of item is:"+"\t"+getName());
        System.out.println("Brand is:"+"\t"+brand);
        System.out.println("Price is:"+"\t"+"$"+price);
        System.out.println("Units are:"+"\t"+units);
        System.out.println("Discount is:"+"\t"+discount+"%");
         System.out.println("Amount Saved is:"+"\t"+"$"+computeDiscount());
        System.out.println("Tax is:"+"\t"+taxp+"%");
        System.out.println("final price is:"+"\t"+"$"+computeTotalPrice()+"\n");
       
    }  
  
}
