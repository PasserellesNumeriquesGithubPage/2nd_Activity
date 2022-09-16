public class Plants {
   private String name;

   // Getter
   public String getType() {
     return name;
   }

   // Setter
   public void setName(String newName) {
     this.name = newName;
   }

   public static void main(String[] args) {

    Flower flower = new  Flower();
    flower.setName("Rose");
    System.out.print("This Flower is " +flower.getType() + " And it's Color ");
    flower.FlowerColor();
    
    Trees trees = new Trees();
    System.out.print("The talls tree in the world is ");
    trees.TreeName();
    System.out.print(" and it's size is ");
    trees.Treetall();
  }
}