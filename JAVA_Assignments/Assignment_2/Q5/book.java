public class book{
    private int bookNo;
    private String title;
    private String author;
    private float price;

public book(int bookNo, String title, String author, float price) {
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
        return (this.bookNo+"  "+this.title+"  "+this.author+"  "+this.price);
    }

    public static void main(String[] args){
        book B1=new book(1,"C in Depth", "Nandan", 500);
        System.out.println(B1.incrPrice(100));
        System.out.println(B1.displayBookDetails());
    }

}
