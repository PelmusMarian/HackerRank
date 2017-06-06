package solution;

class MyBook extends Book {

    int price;

    MyBook(String newTitle, String newAuthor, int newPrice) {
        super(newTitle, newAuthor);
        price = newPrice;
    }

    @Override
    void display() {
        System.out.println("Title: " + this.title
                + "\nAuthor: " + this.author
                + "\nPrice: " + price);
    }
}
