import java.util.*;

public class Chicken implements Edible {

  int nv; 
  public Chicken(){
    this.nv = 3;
  }



public String cluck(){
return "cluck?";

}

public int nutritionValue(){
  return this.nv;
}



}