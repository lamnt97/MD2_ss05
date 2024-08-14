package product;

import java.util.Scanner;

public class Product {
    // khai báo trường
    private String id;
    private String name;
    private int price;
    private int quantity;

    public Product(){

    }

    public Product(String id, String name, int price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào mã sản phẩm ");
        this.id = scanner.nextLine();
        System.out.println("Nhập vàp tên sản phẩm ");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào giá sản phẩm ");
        this.price = scanner.nextInt();
        System.out.println("Nhâp vào số lượng ");
        this.quantity = scanner.nextInt();
    }

    // hiển thị thông tin
    public void displayData(){
        System.out.println("======Thông tin sản phẩm======");
        System.out.println("Mã sản phảm "+this.id);
        System.out.println("Tên sản phảm "+this.name);
        System.out.println("Giá sản phảm "+this.price);
        System.out.println("Số lượng sản phảm "+this.quantity);
    }
}
