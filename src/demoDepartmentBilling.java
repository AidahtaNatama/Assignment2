
public class demoDepartmentBilling {
    public static void main(String[] args) {
        Grocery obj1=new Grocery("itemCode-11", "Bread" ,1.50, 2, 0,2);
        Grocery obj2=new Grocery("itemCode-12", "Apples", 0.75, 6, 1,0);
        System.out.println("****************** Groceries ******************");
        obj1.displayGrocery();
        obj2.displayGrocery();
        
        System.out.println("****************** Clothing ******************");
        Clothing obj3=new Clothing("itemCode-21", "Jeans", 1, 35, "Levis", 0);
        obj3.displayClothing();
        Clothing obj4=new Clothing("itemCode-22", "Dress Shirt", 2, 25, "Izod", 10);
        obj4.displayClothing();
        

                
       
    }
}
