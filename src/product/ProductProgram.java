package product;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductProgram {
    public static void main(String[] args) {
        //Khởi tạo đối tượng scanner
        Scanner scanner = new Scanner(System.in);
        // Khai báo danh sách đối tưởng sản phẩm
        List<Product> list = new ArrayList<>();

        // in ra menu
        do {
            System.out.println("=====MENU=====");
            System.out.println("1. Thêm mới sản phẩm");
            System.out.println("2. Hiển thị danh sách sản phẩm");
            System.out.println("3. THOÁT");
            System.out.println(" Mời bạn chọn 1-3 ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // khởi tạo đối tượng sản phẩm
                    Product product = new Product();
                    // gọi đến phương thức inputData
                    product.inputData();
                    // add đối tượng vừa tạo vào danh sách List
                    list.add(product);
                    break;
                case 2:
                    System.out.println("=========Danh sách sản phẩm =========");
                    for (Product item : list) {
                        item.displayData();
                    }
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Sai lựa chọn");

            }
        } while (true);
    }
}
