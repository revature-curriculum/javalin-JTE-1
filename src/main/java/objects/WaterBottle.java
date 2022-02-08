package objects;

public class WaterBottle {

  String brandName;
  int amount;

  public WaterBottle(String brandName, int amount){
    this.brandName = brandName;
    this.amount = amount;
  }

  public String getBrandName(){
    return brandName;
  }

  public int getAmount(){
    return amount;
  }

}