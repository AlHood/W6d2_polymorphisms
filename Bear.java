import java.util.*;

public class Bear {
  private String name;
  private ArrayList<Edible> belly;

  public Bear(String name){
    this.belly = new ArrayList<Edible>();
    this.name = name;
  }

  public String getName(){
    return name;
  }

  public int foodCount(){
    return belly.size();
  }

  public void eat(Edible edible){
    belly.add(edible);
  }

  public void sleep(){
    belly.clear();
  }

  public Edible throwUp() {
    if(foodCount() > 0) {
      return belly.remove(0);
    }
    return null;
  }
public int totalNutrition(){
  int total = 0;
  for (Edible food : this.belly ) {

 total = total + food.nutritionValue();

  }
    return total;

}


}