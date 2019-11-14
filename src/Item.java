
/**
 *
 * @author Haier
 */
public class Item {
    private String itemCode;
    private String Name;
    
    public Item(String itemCode,String Name){
        this.itemCode=itemCode;
        this.Name=Name; 
    }
    
    public void displayItemInfo(){
        System.out.print(itemCode);
        System.out.println(Name);
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
}
