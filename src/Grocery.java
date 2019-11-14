
public class Grocery extends Item implements Discount,Tax{
private double price;
private double units;
private double discount;
private double savings;
private double tax;
private double taxprice;



    public Grocery(String itemCode, String Name,double price,double units,double discount,double tax) {
        super(itemCode, Name);
        this.price=price;
        this.units=units;
        this.discount=discount;
        this.tax=tax;
    }

    @Override
    public double computeDiscount() {
          savings=(discount/100)*price;
   return savings;
    }

    @Override
    public double computeTax() {
         taxprice=(tax/100)*price;
   return taxprice;
    }
    public double computeTotalPrice() {
        price=price+computeTax();
        price=price-computeDiscount();
        return price;
    }
public void displayGrocery(){
      System.out.println("item code is:"+"\t"+getItemCode());
        System.out.println("Name of item is:"+"\t"+getName());
        System.out.println("Price is:"+"\t"+"$"+price);
        System.out.println("Units are:"+"\t"+units);
        System.out.println("Discount is:"+"\t"+discount+"%");
        System.out.println("Amount Saved is:"+"\t"+"$"+computeDiscount());
        System.out.println("Tax is:"+"\t"+tax+"%");
        System.out.println("final price is:"+"\t"+"$"+computeTotalPrice()+"\n");
       
}

}
