package book;

import java.util.Scanner;


public class Book {
    private String bookId;
    private String bookName;
    private float importPrice;
    private float exportPrice;
    private String author;
    private float interest;
    private int year;

    public Book(){
    }
    public Book(String bookId, String bookName, float importPrice, float exportPrice, String author, float interest,int year) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.importPrice = importPrice;
        this.exportPrice = exportPrice;
        this.author = author;
        this.interest = interest;
        this.year = year;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public String getAuthor() {
        return author;
    }

    public float getInterest() {
        return interest;
    }

    public int getYear() {
        return year;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }

    public void prosesInterest() {
        this.interest = this.exportPrice - this.importPrice;
        this.displayBookInfo();
        System.out.println("lợi nhuận" + this.interest);
    }


    public void inputBookData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sách: ");
         this.bookId = scanner.nextLine();
        System.out.println("Nhập vào tên sách: ");
        this.bookName = scanner.nextLine();
        System.out.println("Nhập vào giá nhập sách: ");
        this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào giá xuất sách: ");
        this.exportPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập vào tác giả: ");
        this.author = scanner.nextLine();
        System.out.println("Nhập vào năm: ");
        this.year = Integer.parseInt(scanner.nextLine());
    }

    // Phương thức hiển thị dữ liệu sách
    public void displayBookInfo() {
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName);
        System.out.println("Giá nhập: " + importPrice);
        System.out.println("Giá xuất: " + exportPrice);
        System.out.println("Tác giả: " + author);
        System.out.println("Lợi nhuận: " + interest);
        System.out.println("Năm: " + year);
    }
}
