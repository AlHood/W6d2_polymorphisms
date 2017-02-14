
public class Human implements Edible, Swimmable {
  int nv; 

  public Human(){
    this.nv = 5;
  }

public String speak() {
  return "Help I'm being eaten by a bear!";
}


public int nutritionValue(){
  return this.nv;
}

}

