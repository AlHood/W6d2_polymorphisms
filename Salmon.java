public class Salmon implements Edible , Swimmable {
  
  int nv; 
  public Salmon(){
    this.nv = 2;
  }


  public String swim(){
   return "swimming";
  }

  public int nutritionValue(){
    return this.nv;
  }

}