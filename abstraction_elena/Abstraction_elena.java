
package abstraction_elena;

public class Abstraction_elena {

    public static void main(String[] args) {
        wattpads favCreator = new wattpad1();
        wattpads favBook = new wattpad1();
        wattpads Publish = new wattpad1();
        
        
        System.out.println("============Welcome to the Wattpad World============\n");
        favCreator.creator();
        favBook.wattpad_title();
        Publish.publication();
        favBook.setPublisher("Majesty Press");
        System.out.print("Publisher: ");
        System.out.println(favBook.getPublisher());
        favBook.setPrice(430);
        System.out.print("Price: ");
        System.out.println(100 +favBook.getPrice()+ " pesos");
        
        
        wattpads favAuthor2 = new wattpad2();
        wattpads favBook2 = new wattpad2();
        wattpads Publish2 = new wattpad2();
        
        System.out.println("\nFavourite Wattpad Creator: \n");
        favAuthor2.creator();
        favBook2.wattpad_title();
        Publish2.publication();
        favBook.setPublisher("Wattpad Bliss Incorporated");
        System.out.print("Publisher: ");
        System.out.println(favBook.getPublisher());
        favBook.setPrice(199);
        System.out.print("Price: ");
        System.out.println(100+favBook.getPrice()+ " pesos");
        
    }
    
}

