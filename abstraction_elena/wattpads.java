package abstraction_elena;

    abstract class wattpads{
    String Author;
    int Price_of_the_book;
    
    abstract void creator();
    abstract void  wattpad_title();
    abstract void publication();
    
    public void setPublisher(String pubHouse){
        Author = pubHouse;
    }
    public String getPublisher(){
        return Author;
    }
    
    public void setPrice(int BookPrice){
        Price_of_the_book = BookPrice;
    }
    public int getPrice(){
        return Price_of_the_book;
    }
}

