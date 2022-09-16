package activity2;

public class Animal{
    // public Animal(String Dog){
    //     super(Dog);
    //     System.out.println("The part two Dog!");
    // }//Constructor

    private String animal = "Dogs";

    public String animalsType(){
        return this.animal;
    }//Getter
    public static String animalsSound(){
        return "NGOW! NGOW!";
    }
    public static String animalsSound(String cows){
        return "OONGA! OONGA!";
    }
    public void setAnimal(String getAnimal){
        this.animal = getAnimal;
    }//Setter
    public static void main(String[] args) {
        Tiger tigerJava = new Tiger();
        

        System.out.println("This animal is "+ tigerJava.tigers);
        tigerJava.tigerPower();
        tigerJava.tigerSound();
        //Tiger Java

        Dog dogs = new Dog();
        System.out.println("This animal is "+dogs.animalsType());
        dogs.dogName();
        dogs.dogFeet();
        //Dog Java

        System.out.println(animalsSound());
        System.out.println(animalsSound("OONGA! OONGA!"));
        //Animal Java
    }
}
