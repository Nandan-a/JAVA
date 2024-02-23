class PriceOutOfRangeException extends Exception{
    public PriceOutOfRangeException(String s){
        super(s);
    }
}

public class Book{
    static void check_price(double price) //throws PriceOutOfRangeException
    {
       try{
if(price>1000){
            throw new PriceOutOfRangeException("Price is out of range. Enter price below 1000!");
        }
        else{
            System.out.println("Price is right!");
        }
       
    }catch(PriceOutOfRangeException e){
        e.getMessage();
    }
}
    private int bookNo;
    private String title;
    private String author;
    private float price;

public Book(int bookNo, String title, String author, float price) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.price = price;
	}

    public double incrPrice(double percentage){
        double price=this.price+percentage;
        return price;
    }
    public String displayBookDetails(){
        return (this.bookNo+this.title+this.author+this.price);
    }

    public static void main(String[] args){
        Book B1=new Book(1,"C in Depth", "Nandan", 500);
        Book B2=new Book(3,"JAVA", "Aniket", 1050);
        //try{
            double val = B1.incrPrice(900);
            check_price(val);
             double val_2 = B2.incrPrice(10);
            check_price(val_2);
        // }
        // catch (PriceOutOfRangeException e)
        // {
        //     System.out.println("Exception has occurred || "+ e);
        // }

        System.out.println(B1.incrPrice(100));
        System.out.println(B2.incrPrice(100));
    }

}
